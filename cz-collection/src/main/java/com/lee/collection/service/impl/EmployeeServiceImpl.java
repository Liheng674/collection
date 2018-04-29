package com.lee.collection.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.collection.entities.EmployeeInfo;
import com.lee.collection.entities.ObjectEmployee;
import com.lee.collection.mapper.EmployeeInfoMapper;

@Service
public class EmployeeServiceImpl implements com.lee.collection.service.EmployeeService
{
	@Autowired
	private EmployeeInfoMapper employeeMapper;

	@Override
	public List<ObjectEmployee> getAll()
	{
		return employeeMapper.getAll();
	}

	@Override
	public int insert(EmployeeInfo employee)
	{
		employee.setCreateTime(new Date());
		return employeeMapper.insertSelective(employee);
	}

	@Override
	public EmployeeInfo getById(Integer id)
	{
		return employeeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(EmployeeInfo employee)
	{
		return employeeMapper.updateByPrimaryKeySelective(employee);
	}

	@Override
	public int deleteById(List<EmployeeInfo> list)
	{
		return employeeMapper.deleteEmployees(list);
	}

	@Override
	public int batchEnableState(List<EmployeeInfo> list)
	{
		return employeeMapper.batchEnablestatus(list);
	}

	@Override
	public int batchUnableState(List<EmployeeInfo> list)
	{
		return employeeMapper.batchUnablestatus(list);
	}

	@Override
	public List<EmployeeInfo> queryEmployee(EmployeeInfo employee)
	{
		return employeeMapper.queryEmployee(employee);
	}

}
