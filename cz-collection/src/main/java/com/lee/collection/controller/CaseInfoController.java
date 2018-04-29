package com.lee.collection.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lee.collection.entities.CaseInfo;
import com.lee.collection.service.CaseInfoService;

@Controller
public class CaseInfoController
{
	@Autowired
	private CaseInfoService caseInfoService;

	@RequestMapping("/case_info")
	public String case_info(HttpSession session)
	{
		return "case_info";
	}

	@ResponseBody
	@RequestMapping("/loadCaseInfo")
	public Object loadCaseInfo()
	{
		List<CaseInfo> list_caseInfo = caseInfoService.getAll();
		return list_caseInfo;
	}

}
