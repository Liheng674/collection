package com.lee.collection.service;

import java.util.List;
import java.util.Map;

import com.lee.collection.entities.Entrust;

public interface EntrustService
{

	List<Entrust> getAll();

	int insert(Entrust entrust);

	Entrust getById(Integer id);

	int update(Entrust entrust);

	int deleteById(List<Entrust> allentrusts);

	int batchUpdateState(List<Entrust> list);
	
	int batchUnableState(List<Entrust> list);

	List<Entrust> queryEntrust(Map<Object, Object> map);

}
