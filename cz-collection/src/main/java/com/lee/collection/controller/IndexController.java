package com.lee.collection.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lee.collection.entities.CaseInfo;
import com.lee.collection.entities.Entrust;
import com.lee.collection.entities.ObjectCaseBatch;
import com.lee.collection.entities.ObjectEmployee;
import com.lee.collection.entities.SysOrganization;
import com.lee.collection.entities.SysPosition;
import com.lee.collection.service.CaseBatchService;
import com.lee.collection.service.CaseInfoService;
import com.lee.collection.service.EmployeeService;
import com.lee.collection.service.EntrustService;
import com.lee.collection.service.OrganizationService;
import com.lee.collection.service.PositionService;

@Controller
public class IndexController
{
	@Autowired
	private CaseBatchService caseBatchService;
	@Autowired
	private EntrustService entrustService;
	@Autowired
	private OrganizationService oService;
	@Autowired
	private PositionService pService;
	@Autowired
	private CaseInfoService caseInfoService;
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/index.do")
	public String index(HttpSession session) {
		List<SysOrganization> list_organization = oService.getAll();
		List<SysPosition> list_pos = pService.getAll();
		List<Entrust> list_ent = entrustService.getAll();
		List<ObjectCaseBatch> caseBatchs = caseBatchService.getAll();
		List<CaseInfo> list_caseInfos =  caseInfoService.getAll();
		List<ObjectEmployee> list_emp = employeeService.getAll();
		session.setAttribute("list_organization", list_organization);
		session.setAttribute("list_pos", list_pos);
		session.setAttribute("list_case_info", caseBatchs);
		session.setAttribute("list_ent", list_ent);
		session.setAttribute("list_caseInfos", list_caseInfos);
		session.setAttribute("list_emp", list_emp);
		return "main";
	}
	
}
