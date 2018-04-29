package com.lee.collection.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lee.collection.entities.SysOrganization;
import com.lee.collection.service.OrganizationService;

@Controller
public class OrganizationController
{
	@Autowired
	private OrganizationService oService;

	@ResponseBody
	@RequestMapping("/select")
	public SysOrganization getById(Integer id)
	{
		SysOrganization sysOrganization = oService.getById(id);
		return sysOrganization;
	}
	
//	表格读取数据
	public List<SysOrganization> getAllNotTree(HttpSession session){
		List<SysOrganization> list_organization = oService.getAll();
		session.setAttribute("list_organization", list_organization);
		return list_organization;
	}
	
	@ResponseBody
	@RequestMapping("/load_organization")
	public List<SysOrganization> getAll(Model model,HttpSession session){
		// 临时数据, 用于返回
		List<SysOrganization> SysOrganizations = new ArrayList<>();
		// 从数据库中一次查询出所有的SysOrganization
		List<SysOrganization> allSysOrganizations = oService.getAll();
		// 使用Map提高效率
		Map<Integer, SysOrganization> map = new HashMap<>();
		for (SysOrganization organization : allSysOrganizations) {
			// 放入map中
			map.put(organization.getId(), organization);
		}
		for (SysOrganization organization : allSysOrganizations) {
			// 集合中所有的元素都是子节点
			SysOrganization child = organization;
			if ("0".equals(child.getParentId())) {
				// 根节点
				SysOrganizations.add(organization);
			} else {
				// 获取父节点
				SysOrganization parent = map.get(Integer.valueOf(child.getParentId()));
				// 整合父子关系
				parent.getChildren().add(child);
			}
		}
		// 返回data
		return SysOrganizations;
	}
	
	/**
	* @Title: organization
	* @Description: TODO(加载所有的机构放在session域)
	* @param @return    参数
	* @return String    返回类型
	* @throws
	*/
	@RequestMapping("/organization")
	public String organization(HttpSession session) {
		List<SysOrganization> list_organization = oService.getAllNotTree();
		session.setAttribute("list_organization", list_organization);
		return "organization";
	}
	
	@ResponseBody
	@RequestMapping("/add_organization")
	public Object add_organization(SysOrganization organization) {
		int i = oService.insert(organization);
		return i == 1;
	}
	
	/**
	* @Title: getInfo
	* @Description: TODO(主键查询)
	* @param @param id
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	*/
	@ResponseBody
	@RequestMapping("/getInfo")
	public Object getInfo(Integer id) {
		return oService.getById(id);
	}
	
	/**
	* @Title: edit_organization
	* @Description: TODO(修改)
	* @param @param organization
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/edit_organization")
	public Object edit_organization(SysOrganization organization) {
		int i = oService.update(organization);
		return i == 1;
	}
	
	@ResponseBody
	@RequestMapping("/deleteById")
	public Object deleteById(Integer id) {
		List<SysOrganization> allSysOrganizations = oService.getAll();
		int i = oService.deleteById(id, allSysOrganizations);
		return i != 0;
	}

}
