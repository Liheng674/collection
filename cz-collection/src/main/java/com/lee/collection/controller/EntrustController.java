package com.lee.collection.controller;

import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lee.collection.entities.Entrust;
import com.lee.collection.entities.ObjectEntrust;
import com.lee.collection.service.EntrustService;
import com.lee.collection.util.MyDateUtil;

@Controller
public class EntrustController
{
	public static String DATE_FORMAT = "yyyy-MM-dd";
	
	@Autowired
	private EntrustService entrustService;

	@RequestMapping("/entrust")
	public String entrust()
	{
		return "entrust";
	}
	
	/**
	* @throws ParseException 
	* @Title: queryEntrust
	* @Description: TODO(模糊查询)
	* @param @param name
	* @param @param begin_entrust
	* @param @param end_entrust
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	*/
	@RequestMapping("/queryEntrust")
	@ResponseBody
	public Object queryEntrust(String name, String begin_entrust, String end_entrust) throws ParseException {
		String begin = MyDateUtil.dateFormatUtils(begin_entrust);
		String end = MyDateUtil.dateFormatUtils(end_entrust);
		Map<Object, Object> map = new HashMap<>();
		StringBuilder s = new StringBuilder();
		s.append(" date(cooperate_date) between '").append(begin)
				.append("' and '").append(end).append("'");
		map.put("param", s);
		map.put("name", name);
		List<Entrust> entrusts = entrustService.queryEntrust(map);
		return entrusts;
	}

	@ResponseBody
	@RequestMapping("/load_entrust")
	public List<Entrust> getAll()
	{
		List<Entrust> allEntrust = entrustService.getAll();
		return allEntrust;
	}

	/**
	* @Title: add_entrust
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param entrust
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/add_entrust")
	public Object add_entrust(Entrust entrust)
	{
		int i = entrustService.insert(entrust);
		return i == 1;
	}

	/**
	* @Title: getentrustById
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param id
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/getEntrustById")
	public Object getEntrustById(Integer id)
	{
		Entrust entrust = entrustService.getById(id);
		return entrust;
	}

	/**
	* @Title: edit_entrust
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param entrust
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/edit_entrust")
	public Object edit_entrust(Entrust entrust)
	{
		int i = entrustService.update(entrust);
		return i == 1;
	}

	@ResponseBody
	@RequestMapping("/deleteEntrust")
	public Object deleteById(ObjectEntrust entrusts)
	{
		int i = entrustService.deleteById(entrusts.getListEntrust());
		return i != 0;
	}
	
	/**
	* @Title: enableEntrust
	* @Description: TODO(修改状态是否启用)
	* @param @param objectEntrust
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/enableEntrust")
	public Object enableEntrust(ObjectEntrust objectEntrust) {
		int i = entrustService.batchUpdateState(objectEntrust.getListEntrust());
		return i > 0;
	}
	
	@ResponseBody
	@RequestMapping("/unableEntrust")
	public Object unableEntrust(ObjectEntrust objectEntrust) {
		int i = entrustService.batchUnableState(objectEntrust.getListEntrust());
		return i > 0;
	}
}
