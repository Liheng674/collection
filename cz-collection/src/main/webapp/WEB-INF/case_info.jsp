<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#mybutton{ 
    border:1px solid #ccc; 
    background:#fff; 
    color:#000; 
    padding:5px 15px;
    height:30px;
}
</style>
<base href="<%=basePath %>">
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	
</script>
<title>Title</title>
</head>
<body>
	<div class="easyui-layout" data-options="fit:true">
	    <div data-options="region:'center',border:false">
	    	<!-- Begin of toolbar -->
	        <div id="caseInfo-toolbar">
			    <div id="aa" class="easyui-accordion">   
				    <div title="过滤条件" style="padding: 10px!important">
				    <form id="caseInfoQuery">
				    	<table>
				    		<tr>
				    			<td>委托方：</td>
				    			<td>
				    				<select class="easyui-combobox" id="cusNo">
							    		<option value="">全部</option>
							    		<c:forEach items="${list_ent }" var="ent">
				        					<option>${ent.name }</option>
				        				</c:forEach>
				    				</select>
				    			</td>
				    			<td>风控方：</td>
				    			<td>
				    				<select class="easyui-combobox" id="orgName">
							    		<option value="">全部</option>
							    		<c:forEach items="${list_organization }" var="org">
							    			<option>${org.name }</option>
							    		</c:forEach>
				    				</select>
				    			</td>
				    			<td>委案日期：</td>
				    			<td>
				    				<input id="caseDate" class="easyui-datebox" style="width:100px">
				    			</td>
				    			<td>至：</td>
				    			<td>
				    				<input id="caseDateEnd" class="easyui-datebox" style="width:100px">
				    			</td>
				    			<td>
				    				<select class="easyui-combobox" id="caseCode">
				    					<option value="">案件序列号</option>
					    				<c:forEach items="${list_caseInfos }" var="info">
			        						<option>${info.caseName }</option>
		        						</c:forEach>
				    				</select>
				    			</td>
				    		</tr>
				    		<tr>
				    			<td>风控员：</td>
				    			<td>
				    				<select class="easyui-combobox" id="caseAssignName">
							    		<option value="">全部</option>
							    		<c:forEach items="${list_emp }" var="emp">
				        					<option>${emp.userName }</option>
				        				</c:forEach>
				    				</select>
				    			</td>
				    			<td>分案状态：</td>
				    			<td>
				    				<select class="easyui-combobox" id="">
							    		<option value=-1>全部</option>
				    				</select>
				    			</td>
				    			<td>还款日期：</td>
				    			<td>
				    				<input id="repayDate" class="easyui-datebox" style="width:100px">
				    			</td>
				    			<td>至：</td>
				    			<td>
				    				<input id="repayDateEnd" class="easyui-datebox" style="width:100px">
				    			</td>
				    			<td>
				    				<textarea cols="20" name=""></textarea>
				    			</td>
				    		</tr>
				    		<tr>
				    			<td>还款情况：</td>
				    			<td>
				    				<select class="easyui-combobox" id="caseAssignName">
							    		<option value="">全部</option>
				    				</select>
				    			</td>
				    			<td>案件状态：</td>
				    			<td>
				    				<select class="easyui-combobox" id="state">
							    		<option value=-1>全部</option>
							    		<option value=0>恢复</option>
							    		<option value=1>暂停</option>
							    		<option value=4>结清</option>
							    		<option value=5>撤回</option>
				    				</select>
				    			</td>
				    			<td>退款日期：</td>
				    			<td>
				    				<input id="endDate" class="easyui-datebox" style="width:100px">
				    			</td>
				    			<td>至：</td>
				    			<td>
				    				<input id="endDateEnd" class="easyui-datebox" style="width:100px">
				    			</td>
				    		</tr>
				    		<tr>
				    			<td>批次号：</td>
				    			<td>
				    				<select class="easyui-combobox" id="batchId">
							    		<option value="">全部</option>
							    		<c:forEach items="${list_emp }" var="emp">
				        					<option>${emp.userName }</option>
				        				</c:forEach>
				    				</select>
				    			</td>
				    			<td>逾期账龄：</td>
				    			<td>
				    				<select class="easyui-combobox" id="overdueAge">
							    		<option value=-1>全部</option>
				    				</select>
				    			</td>
				    			<td>委案金额：</td>
				    			<td>
				    				<input id="caseMoney" type="text" style="width:100px">
				    			</td>
				    			<td>至：</td>
				    			<td>
				    				<input id="caseMoneyEnd" type="text" style="width:100px">
				    			</td>
				    		</tr>
				    		<tr>
				    			<td>案件类型：</td>
				    			<td>
				    				<select class="easyui-combobox" id="caseName">
							    		<option value="">全部</option>
							    		<c:forEach items="${list_caseInfos }" var="info">
					        				<option>${info.caseName }</option>
				        				</c:forEach>
							    	</select>
				    			</td>
				    			<td>风控状态：</td>
				    			<td>
				    				<select class="easyui-combobox" id="">
							    		<option value=-1>全部</option>
				    				</select>
				    			</td>
				    			<td>客户号：</td>
				    			<td colspan="3">
				    				<input id="userId" type="text" style="width:100px">
				    			</td>
				    		</tr>
				    		<tr>
				    			<td>手机号：</td>
				    			<td>
				    				<input id="userId" type="text" style="width:100px">
				    			</td>
				    			<td>姓名：</td>
				    			<td>
				    				<input id="accountName" type="text" style="width:100px">
				    			</td>
				    			<td>案件标色：</td>
				    			<td>
				    				<select class="easyui-combobox" id="">
							    		<option value=-1>全部</option>
				    				</select>
				    			</td>
				    			<td></td>
				    			<td>
					    			<a onclick="querycaseInfo()" style="margin-left: 10px;background-color:#62C3EA;border-radius:5px" class="wu-text" href="javascript:;"><font color="#fff">查询</font></a>
				            		<a onclick="resetcaseInfo()" style="margin-left: 10px;background-color:#62C3EA;border-radius:5px" class="wu-text" href="javascript:;"><font color="#fff">重置查询</font></a>
				    			</td>
				    		</tr>
				    	</table>
				    </form>
				    </div>   
				</div>
	            <div class="wu-toolbar-button">
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="pauseCaseInfo()">暂停案件</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="recallCaseInfo()">撤回案件</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="recoverCaseInfo()">恢复案件</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="endCaseInfo()">结清案件</a>
	                <a id="outExcel" href="javascript:void(0)" class="easyui-linkbutton" onclick="outSelected()">导出所选案件</a>
	                <a id="outExcel" href="javascript:void(0)" class="easyui-linkbutton" onclick="outQuery()">导出所查案件</a>
	            </div>
	        </div>
	        <!-- End of toolbar -->
	        <table id="caseInfo_datagrid", toolbar="#caseInfo-toolbar">
	        </table>
	    </div>
	</div>
	<div id="caseInfo-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:450px; padding:10px;">
	</div>
<script type="text/javascript">
	// 查询
	function querycaseInfo(){
		
	}
	//重置
	function resetcaseInfo(){
		$("#caseInfoQuery")[0].reset();
	}
	$(function(){
		$('#caseInfo_datagrid').datagrid({
	        toolbar: "#caseInfo_datagrid",
		    url:'loadCaseInfo.do',
			loadFilter:pagerFilter,
			singleSelect:true,

		    pagination:true,//如果表格需要支持分页，必须设置该选项为true
	
	        rownumbers: true,
	        fitColumns: true,
	        remoteSort: false,
	        autoRowHeight: true,
	        collapsible: true,
	        striped: true,
	        pageSize:5,
	        pageList:[5,10,15,20],
			fitColumns:true,
			selectOnCheck:false,
		    
		    loadMsg:'数据正在努力加载，请稍后...',   //加载数据时显示提示信息
		    columns:[[
		    	// 复选框
		    	{checkbox:true},
		    	{field:'',title:'操作',
		    		formatter: function (value,row,index){
		    			return "<a style='color: blue;' href='javascript:;'>附件</a>";
		    		}
			    },
		    	{field:'caseCode',title:'案件序列号'},
		    	{field:'state',title:'案件状态',
		    		formatter: function(value,row,index){
						if (value == 0){
							return "恢复";
						} 
						if(value == 1){
							return "暂停";
						}
						if(value == 4){
							return "结清";
						}
						if(value == 5){
							return "撤回";
						}
					}
				},
		    	{field:'batchId',title:'批次号'},
		    	{field:'cusNo',title:'委托方'},
		    	{field:'orgName',title:'风控方'},
		    	{field:'caseAssignName',title:'风控员'},
		    	{field:'caseDate',title:'委案日期',
		        	formatter: function(value,row,index){
		        		var date = new Date(value);
		                pattern = "yyyy-MM-dd";  
		                return date.format(pattern);
					}
		        },
		    	{field:'endDate',title:'退案日期',
		        	formatter: function(value,row,index){
		        		var date = new Date(value);
		                pattern = "yyyy-MM-dd";  
		                return date.format(pattern);
					}
		        },
		        {field:'caseMoney',title:'委案金额'}
		        
		    ]]

		});
	})
	
	/**
	* Name 分页过滤器
	*/
	function pagerFilter(data){            
		if (typeof data.length == 'number' && typeof data.splice == 'function'){// is array                
			data = {                   
				total: data.length,                   
				rows: data               
			}            
		}        
		var dg = $(this);         
		var opts = dg.datagrid('options');          
		var pager = dg.datagrid('getPager');          
		pager.pagination({                
			onSelectPage:function(pageNum, pageSize){                 
				opts.pageNumber = pageNum;                   
				opts.pageSize = pageSize;                
				pager.pagination('refresh',{pageNumber:pageNum,pageSize:pageSize});                  
				dg.datagrid('loadData',data);                
			}          
		});           
		if (!data.originalRows){               
			data.originalRows = (data.rows);       
		}         
		var start = (opts.pageNumber-1)*parseInt(opts.pageSize);          
		var end = start + parseInt(opts.pageSize);        
		data.rows = (data.originalRows.slice(start, end));         
		return data;       
	}
	
</script>
</body>
</html>