package com.lee.collection.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.collection.entities.SysPosition;
import com.lee.collection.mapper.SysPositionMapper;
import com.lee.collection.service.PositionService;

@Service
public class PositionServiceImpl implements PositionService
{
	@Autowired
	private SysPositionMapper pMapper;

	@Override
	public int insert(SysPosition position)
	{
		position.setCreateTime(new Date());
		return pMapper.insertSelective(position);
	}

	@Override
	public SysPosition getById(Integer id)
	{
		return pMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(SysPosition position)
	{
		return pMapper.updateByPrimaryKeySelective(position);
	}

	@Override
	public List<SysPosition> getAll()
	{
		return pMapper.selectAll();
	}

	@Override
	public int deleteById(Integer id, List<SysPosition> allPositions)
	{
		int i = pMapper.deleteByPrimaryKey(id);
		
		for (SysPosition position : allPositions)
		{
			if(id.toString().equals(position.getParentId())) {
				// 删除子节点
				pMapper.deleteByPrimaryKey(position.getId());
			}
		}
		return i;
	}

}
