package com.lee.collection.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lee.collection.entities.CaseBatch;
import com.lee.collection.entities.CaseInfo;
import com.lee.collection.entities.Entrust;
import com.lee.collection.entities.ObjectCaseBatch;
import com.lee.collection.service.CaseBatchService;
import com.lee.collection.service.CaseInfoService;
import com.lee.collection.service.EntrustService;
import com.lee.collection.util.ExcelWrite;
import com.lee.collection.util.MyFileUpload;

@Controller
public class CaseBatchController
{
	@Autowired
	private CaseBatchService caseBatchService;
	@Autowired
	private EntrustService entrustService;
	@Autowired
	private CaseInfoService caseInfoService;
	
	@RequestMapping("/case_batch")
	public String case_batch(HttpSession session) {
		List<Entrust> list_ent = entrustService.getAll();
		List<ObjectCaseBatch> caseBatchs = caseBatchService.getAll();
		List<CaseInfo> list_caseInfos =  caseInfoService.getAll();
		session.setAttribute("list_case_batch", caseBatchs);
		session.setAttribute("list_ent", list_ent);
		session.setAttribute("list_caseInfos", list_caseInfos);
		return "case_batch";
	}
	
	@RequestMapping("/queryCaseBatch")
	@ResponseBody
	public List<ObjectCaseBatch> queryCaseBatch(CaseBatch caseBatch, String begin, String end){
		List<ObjectCaseBatch> caseBatchs = caseBatchService.queryCaseBatch(caseBatch, begin, end);
		return caseBatchs;
	}
	
	/**
	* @Title: loadCaseBatch
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @return    参数
	* @return List<CaseBatch>    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/loadCaseBatch")
	public List<ObjectCaseBatch> loadCaseBatch(){
		List<ObjectCaseBatch> caseBatchs = caseBatchService.getAll();
		return caseBatchs;
	}
	
	@ResponseBody
	@RequestMapping("/addCaseBatch")
	public Object addCaseBatch(CaseBatch batch)
	{
		int i = caseBatchService.insert(batch);
		return i == 1;
	}
	
	/**
	* @Title: leadInExcel
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param batchXls
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	*/
	@ResponseBody
	@RequestMapping("/leadInExcel")
	public Object leadInExcel(@RequestParam(value="file") MultipartFile batchXls) {
		MyFileUpload.myUpload(batchXls);
		// 导入案件xls
		caseInfoService.leadInExcel(batchXls);
		return true;
	}
	
	
	@ResponseBody
	@RequestMapping("/getCaseBatchById")
	public CaseBatch getCaseBatchById(Integer id)
	{
		CaseBatch caseBatch = caseBatchService.getCaseBatchById(id);
		return caseBatch;
	}
	
	@ResponseBody
	@RequestMapping("/editCaseBatch")
	public Object editCaseBatch(CaseBatch batch)
	{
		int i = caseBatchService.update(batch);
		return i == 1;
	}
	
	/**
	* @Title: updateCaseBatchState
	* @Description: TODO(软删除， 设置批次和案件类型状态为1)
	* @param @param id
	* @param @return    参数
	* @return Object    返回类型
	* @throws
	 */
	@ResponseBody
	@RequestMapping("/updateCaseBatchState")
	public Object updateCaseBatchState(Integer id) {
		int i = caseBatchService.updateCaseBatchState(id);
		return i == 1;
	}
	
	/**
	* @Title: outCaseBatch
	* @Description: TODO(查询该批次下所有的案件)
	* @param @return    参数
	* @return List<CaseInfo>    返回类型
	* @throws
	 */
	@RequestMapping("/outCaseBatch")
	public void outCaseBatch(String batchCode, HttpServletResponse response){
		List<CaseInfo> outCaseBatchs =  caseInfoService.selectInfosByBatchCode(batchCode);
		// 用batchCode当生成的xls文件名前缀
		String prefix = batchCode;
		String title = "案件信息";
		String[] rowsName = new String[]
		{ "ID", "案件序列号", "案件状态", "批次号", "委托方", "风控方", "风控员", "委案日期", "退案日期", "委案金额", "案件类型" };
		List<Object[]> dataList = new ArrayList<Object[]>();
		// 列
        Object[] objs = null;
        for (int i = 0; i < outCaseBatchs.size(); i++) {
            CaseInfo caseInfo = outCaseBatchs.get(i);
            objs = new Object[rowsName.length];
            int j = 0;
            objs[j++] = caseInfo.getId();
            objs[j++] = caseInfo.getCaseCode();
            objs[j++] = caseInfo.getState();
            objs[j++] = caseInfo.getBatchId();
            objs[j++] = caseInfo.getCusNo();
            objs[j++] = caseInfo.getOrgName();
            objs[j++] = caseInfo.getCaseAssignName();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String caseDate = df.format(caseInfo.getCaseDate());
            objs[j++] = caseDate;
            String endDate = df.format(caseInfo.getEndDate());
            objs[j++] = endDate;
            objs[j++] = caseInfo.getCaseMoney();
            objs[j++] = caseInfo.getCaseName();
            dataList.add(objs);
        }
        ExcelWrite ex = new ExcelWrite(prefix, title, rowsName, dataList);
        try
		{
			ex.export(response);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
