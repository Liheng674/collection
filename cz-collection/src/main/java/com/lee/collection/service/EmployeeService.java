package com.lee.collection.service;

import java.util.List;

import com.lee.collection.entities.EmployeeInfo;
import com.lee.collection.entities.ObjectEmployee;

public interface EmployeeService
{

	List<ObjectEmployee> getAll();

	int insert(EmployeeInfo employee);

	EmployeeInfo getById(Integer id);

	int update(EmployeeInfo employee);

	int deleteById(List<EmployeeInfo> listEmployee);

	int batchEnableState(List<EmployeeInfo> listEmployee);

	int batchUnableState(List<EmployeeInfo> listEmployee);

	List<EmployeeInfo> queryEmployee(EmployeeInfo employee);

}
