package com.lee.collection.service;

import java.util.List;

import com.lee.collection.entities.CaseBatch;
import com.lee.collection.entities.ObjectCaseBatch;

public interface CaseBatchService
{

	List<ObjectCaseBatch> getAll();

	int updateCaseBatchState(Integer id);

	int update(CaseBatch batch);

	CaseBatch getCaseBatchById(Integer id);

	int insert(CaseBatch batch);

	List<ObjectCaseBatch> queryCaseBatch(CaseBatch caseBatch, String begin, String end);

}
