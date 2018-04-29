package com.lee.collection.entities;

import java.util.ArrayList;
import java.util.List;

public class ObjectCaseBatch extends CaseBatch
{
	private String caseInfoName;
	private String entrustName;

	public String getEntrustName()
	{
		return entrustName;
	}

	public void setEntrustName(String entrustName)
	{
		this.entrustName = entrustName;
	}

	public String getCaseInfoName()
	{
		return caseInfoName;
	}

	public void setCaseInfoName(String caseInfoName)
	{
		this.caseInfoName = caseInfoName;
	}

	private List<Entrust> list_ent = new ArrayList<>();

	private List<CaseInfo> list_case_info = new ArrayList<>();

	public List<Entrust> getList_ent()
	{
		return list_ent;
	}

	public void setList_ent(List<Entrust> list_ent)
	{
		this.list_ent = list_ent;
	}

	public List<CaseInfo> getList_case_info()
	{
		return list_case_info;
	}

	public void setList_case_info(List<CaseInfo> list_case_info)
	{
		this.list_case_info = list_case_info;
	}

}
