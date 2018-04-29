package com.lee.collection.util;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.tagext.PageData;

import org.springframework.web.multipart.MultipartFile;

import com.lee.collection.entities.CaseInfo;

public class ExcelController
{
	public void leadInExcel(MultipartFile file)
	{
		// 判断文件是否为空
		if (file == null)
		{
			return;
		}
		String name = file.getOriginalFilename();
		long size = file.getSize();
		if (name == null || ExcelUtil.EMPTY.equals(name) && size == 0)
		{
			return;
		}
		// 读取Excel数据到List中
		List<ArrayList<String>> list = null;
		try
		{
			list = new ExcelRead().readExcel(file);
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// list中存的就是excel中的数据，可以根据excel中每一列的值转换成你所需要的值（从0开始），如：
		CaseInfo caseInfo = null;
		List<CaseInfo> list_caseInfo = new ArrayList<>();
		for (ArrayList<String> arr : list)
		{
			caseInfo = new CaseInfo();
			int i = 0;
			// 每一行的第一个单元格
			caseInfo.setCaseCode(arr.get(i++));
			caseInfo.setState(Integer.valueOf(arr.get(i++)));
			caseInfo.setBatchId(arr.get(i++));
			caseInfo.setCusNo(arr.get(i++));
			caseInfo.setOrgName(arr.get(i++));
			caseInfo.setCaseAssignName(arr.get(i++));
			try
			{
				caseInfo.setCaseDate(new SimpleDateFormat("yyyy-MM-dd").parse(arr.get(i++).replace("/", "-")));
				caseInfo.setEndDate(new SimpleDateFormat("yyyy-MM-dd").parse(arr.get(i++).replace("/", "-")));
			} catch (ParseException e)
			{
				e.printStackTrace();
			}
			caseInfo.setCaseMoney(new BigDecimal(arr.get(i++)));
			caseInfo.setCaseName(arr.get(i++));
			list_caseInfo.add(caseInfo);
		}

		// 插入到case_info表
	}

	public <T> void export(List<T> list, HttpServletRequest request,HttpServletResponse response) throws Exception {
		String title = "案件信息";
		String[] rowsName = new String[]
		{ "ID", "案件序列号", "案件状态", "批次号", "委托方", "风控方", "风控员", "委案日期", "退案日期", "委案金额", "案件类型" };
		List<Object[]> dataList = new ArrayList<Object[]>();
        Object[] objs = null;
        for (int i = 0; i < list.size(); i++) {
            T man = list.get(i);
            objs = new Object[rowsName.length];
//            objs[1] = man.getTranNo();
//            objs[2] = man.getBillNo();
//            objs[3] = man.getStatusFlagCnName();
//            objs[4] = man.getLoginName();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//            String date = df.format(man.getModiDate());
//            objs[5] = date;
            dataList.add(objs);
        }
        ExcelWrite ex = new ExcelWrite("prefix", title, rowsName, dataList);
        ex.export(response);
	}
}
