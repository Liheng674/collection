package com.lee.collection.entities;

import java.util.ArrayList;
import java.util.List;

public class ObjectEmployee extends EmployeeInfo
{
	List<EmployeeInfo> listEmployee = new ArrayList<>();

	private String orgName;

	private String posName;

	public List<EmployeeInfo> getListEmployee()
	{
		return listEmployee;
	}

	public void setListEmployee(List<EmployeeInfo> listEmployee)
	{
		this.listEmployee = listEmployee;
	}

	public String getOrgName()
	{
		return orgName;
	}

	public void setOrgName(String orgName)
	{
		this.orgName = orgName;
	}

	public String getPosName()
	{
		return posName;
	}

	public void setPosName(String posName)
	{
		this.posName = posName;
	}

}
