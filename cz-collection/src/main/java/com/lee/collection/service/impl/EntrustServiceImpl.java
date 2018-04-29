package com.lee.collection.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.collection.entities.Entrust;
import com.lee.collection.mapper.EntrustMapper;
import com.lee.collection.service.EntrustService;

@Service
public class EntrustServiceImpl implements EntrustService
{
	
	@Autowired
	private EntrustMapper entrustMapper;

	@Override
	public List<Entrust> getAll()
	{
		return entrustMapper.getAll();
	}

	@Override
	public int insert(Entrust entrust)
	{
		entrust.setCooperateDate(new Date());
		return entrustMapper.insertSelective(entrust);
	}

	@Override
	public Entrust getById(Integer id)
	{
		return entrustMapper.selectByPrimaryKey(id);
	}

	@Override
	public int update(Entrust entrust)
	{
		return entrustMapper.updateByPrimaryKeySelective(entrust);
	}

	@Override
	public int deleteById(List<Entrust> list)
	{
		return entrustMapper.deleteByIds(list);
	}

	@Override
	public int batchUpdateState(List<Entrust> list)
	{
		return entrustMapper.batchUpdateState(list);
	}
	
	@Override
	public int batchUnableState(List<Entrust> list)
	{
		return entrustMapper.batchUnableState(list);
	}

	@Override
	public List<Entrust> queryEntrust(Map<Object, Object> map)
	{
		return entrustMapper.queryEntrust(map);
	}

}
