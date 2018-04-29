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

import com.lee.collection.entities.SysPosition;
import com.lee.collection.service.PositionService;

@Controller
public class PositionController
{
	@Autowired
	private PositionService pService;
	
	@RequestMapping("/position")
	public String  position(HttpSession session) {
		return "position";
	}
	
	@ResponseBody
	@RequestMapping("/load_position")
	public List<SysPosition> getAll(Model model){
		// 临时数据, 用于返回
		List<SysPosition> positions = new ArrayList<>();
		// 从数据库中一次查询出所有的Sysposition
		List<SysPosition> allPositions = pService.getAll();
		// 使用Map提高效率
		Map<Integer, SysPosition> map = new HashMap<>();
		for (SysPosition position : allPositions) {
			// 放入map中
			map.put(position.getId(), position);
		}
		for (SysPosition position : allPositions) {
			// 集合中所有的元素都是子节点
			SysPosition child = position;
			if ("0".equals(child.getParentId())) {
				// 根节点
				positions.add(position);
			} else {
				// 获取父节点
				SysPosition parent = map.get(Integer.valueOf(child.getParentId()));
				// 整合父子关系
				parent.getChildren().add(child);
			}
		}
		// 返回data
		return positions;
	}
	
	/**
	* @Title: add_position
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param position
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/add_position")
	public Object add_position(SysPosition position) {
		int i = pService.insert(position);
		return i == 1;
	}
	
	/**
	* @Title: getPositionById
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param id
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/getPositionById")
	public SysPosition getPositionById(Integer id) {
		return pService.getById(id);
	}
	
	/**
	* @Title: edit_position
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param position
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/edit_position")
	public Object edit_position(SysPosition position) {
		int i = pService.update(position);
		return i == 1;
	}
	
	@ResponseBody
	@RequestMapping("/deletePosition")
	public Object deleteById(Integer id) {
		List<SysPosition> allPositions = pService.getAll();
		int i = pService.deleteById(id, allPositions);
		return i != 0;
	}
}
