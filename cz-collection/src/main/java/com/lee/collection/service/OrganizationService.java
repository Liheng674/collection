package com.lee.collection.service;

import java.util.List;

import com.lee.collection.entities.SysOrganization;

public interface OrganizationService
{
	public SysOrganization getById(Integer id);

	public List<SysOrganization> getAll();

	public int insert(SysOrganization organization);

	public int update(SysOrganization organization);

	public int deleteById(Integer id, List<SysOrganization> allSysOrganizations);

	public List<SysOrganization> getAllNotTree();
}
