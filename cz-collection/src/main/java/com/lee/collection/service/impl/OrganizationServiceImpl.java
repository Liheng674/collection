package com.lee.collection.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.collection.entities.SysOrganization;
import com.lee.collection.mapper.SysOrganizationMapper;
import com.lee.collection.service.OrganizationService;

@Service
public class OrganizationServiceImpl implements OrganizationService
{
	@Autowired
	private SysOrganizationMapper oMapper;

	@Override
	public SysOrganization getById(Integer id)
	{
		return oMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<SysOrganization> getAll()
	{
		return oMapper.selectAll();
	}

	@Override
	public int insert(SysOrganization organization)
	{
		organization.setCreateTime(new Date());
		return oMapper.insertSelective(organization);
	}

	@Override
	public int update(SysOrganization organization)
	{
		int i = oMapper.updateByPrimaryKeySelective(organization);
		return i;
	}

	@Override
	public int deleteById(Integer id, List<SysOrganization> allSysOrganizations)
	{
		int i = oMapper.deleteByPrimaryKey(id);
		
		for (SysOrganization organization : allSysOrganizations)
		{
			if(id.toString().equals(organization.getParentId())) {
				// 删除子节点
				oMapper.deleteByPrimaryKey(organization.getId());
			}
		}
		return i;
	}

	@Override
	public List<SysOrganization> getAllNotTree()
	{
		return oMapper.getAllNotTree();
	}

}
