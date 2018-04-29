package com.lee.collection.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lee.collection.entities.EmployeeInfo;
import com.lee.collection.entities.ObjectEmployee;
import com.lee.collection.service.EmployeeService;

@Controller
public class EmployeeController
{
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employee")
	public String employee(HttpSession session)
	{
		return "employee";
	}
	
	/**
	* @Title: queryEmployee
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param employee
	* @param @return    参数
	* @return List<EmployeeInfo>    返回类型
	* @throws
	*/
	@RequestMapping("/queryEmployee")
	@ResponseBody
	public List<EmployeeInfo> queryEmployee(ObjectEmployee employee){
		List<EmployeeInfo> emps = employeeService.queryEmployee(employee);
		return emps;
	}

	@ResponseBody
	@RequestMapping("/load_employee")
	public List<ObjectEmployee> getAll()
	{
		List<ObjectEmployee> allEmployee = employeeService.getAll();
		return allEmployee;
	}

	/**
	* @Title: add_Employee
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param Employee
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/add_employee")
	public Object add_Employee(EmployeeInfo employee)
	{
		int i = employeeService.insert(employee);
		return i == 1;
	}

	/**
	* @Title: getEmployeeById
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param id
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/getEmployeeById")
	public Object getEmployeeById(Integer id)
	{
		EmployeeInfo employee = employeeService.getById(id);
		return employee;
	}

	/**
	* @Title: edit_Employee
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param Employee
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/edit_employee")
	public Object edit_employee(EmployeeInfo employee)
	{
		int i = employeeService.update(employee);
		return i == 1;
	}

	@ResponseBody
	@RequestMapping("/deleteEmployee")
	public Object deleteById(ObjectEmployee employees)
	{
		int i = employeeService.deleteById(employees.getListEmployee());
		return i != 0;
	}

	/**
	* @Title: enableEmployee
	* @Description: TODO(修改状态是否启用)
	* @param @param objectEmployee
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/enableEmployee")
	public Object enableEmployee(ObjectEmployee objectEmployee)
	{
		int i = employeeService.batchEnableState(objectEmployee.getListEmployee());
		return i > 0;
	}

	@ResponseBody
	@RequestMapping("/unableEmployee")
	public Object unableEmployee(ObjectEmployee objectEmployee)
	{
		int i = employeeService.batchUnableState(objectEmployee.getListEmployee());
		return i > 0;
	}
}
