package com.lee.collection.service;

import java.util.List;

import com.lee.collection.entities.SysPosition;

public interface PositionService
{

	int insert(SysPosition position);

	SysPosition getById(Integer id);

	int update(SysPosition position);

	List<SysPosition> getAll();

	int deleteById(Integer id, List<SysPosition> allPositions);

}
