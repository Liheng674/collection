package com.lee.collection.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.lee.collection.entities.CaseInfo;

public interface CaseInfoService
{

	void leadInExcel(MultipartFile batchXls);

	List<CaseInfo> getAll();

	List<CaseInfo> selectInfosByBatchCode(String batchCode);

}
