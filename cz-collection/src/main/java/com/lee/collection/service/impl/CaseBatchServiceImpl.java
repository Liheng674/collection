package com.lee.collection.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.collection.entities.CaseBatch;
import com.lee.collection.entities.ObjectCaseBatch;
import com.lee.collection.mapper.CaseBatchMapper;
import com.lee.collection.service.CaseBatchService;
import com.lee.collection.util.MyDateUtil;

@Service
public class CaseBatchServiceImpl implements CaseBatchService
{
	@Autowired
	private CaseBatchMapper caseBatchMapper;

	@Override
	public List<ObjectCaseBatch> getAll()
	{
		return caseBatchMapper.getAll();
	}

	@Override
	public int updateCaseBatchState(Integer id)
	{
		// 更新批次
		int i = caseBatchMapper.updateCaseBatchState(id);
		// 更新案件
		
		return i;
	}

	@Override
	public int update(CaseBatch batch)
	{
		return caseBatchMapper.updateByPrimaryKeySelective(batch);
	}

	@Override
	public CaseBatch getCaseBatchById(Integer id)
	{
		return caseBatchMapper.selectByPrimaryKey(id);
	}

	@Override
	public int insert(CaseBatch batch)
	{
		// 存入的文件名
		batch.setBatchXls(MyDateUtil.getMyDateString() + "_" + batch.getBatchXls());
		return caseBatchMapper.insertSelective(batch);
	}

	@Override
	public List<ObjectCaseBatch> queryCaseBatch(CaseBatch caseBatch, String begin, String end)
	{
		Map<String, Object> map = new HashMap<>();
		map.put("begin", MyDateUtil.dateFormatUtils(begin));
		map.put("end", MyDateUtil.dateFormatUtils(end));
		map.put("batchCode", caseBatch.getBatchCode());
		map.put("typeId", caseBatch.getTypeId());
		map.put("entrustId", caseBatch.getEntrustId());
		map.put("state", caseBatch.getState());
		return caseBatchMapper.selectCaseBatch(map);
	}

}
