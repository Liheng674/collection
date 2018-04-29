<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/";%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
	        <div id="entrust-toolbar">
			    <div id="aa" class="easyui-accordion">   
				    <div title="过滤条件" style="padding: 10px!important">
				    	<form id="entrustQuery">
				    	<label>委托方名称：</label><input id="nameEntrust" class="wu-text" style="width:100px"/>
				    	<label>合作日期：</label><input id="begin_entrust" class="easyui-datebox" style="width:100px">
			            <label>至：</label><input id="end_entrust" class="easyui-datebox" style="width:100px">
			            <a style="margin-left: 10px;background-color:#62C3EA;border-radius:5px" class="wu-text" href="javascript:;" onclick="queryEntrust()"><font color="#fff">查询</font></a>
			            <a style="margin-left: 10px;background-color:#62C3EA;border-radius:5px" class="wu-text" href="javascript:;" onclick="resetEntrust()"><font color="#fff">重置查询</font></a>
				    	</form>
				    </div>   
				</div>
	            <div class="wu-toolbar-button">
	                <a  href="javascript:void(0)" class="easyui-linkbutton" onclick="openAddEntrust()">添加</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="openEditEntrust()">修改</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="removeEntrust()">删除</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="enableEntrust()">启用</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="unableEntrust()">停用</a>
	            </div>
	        </div>
	        <!-- End of toolbar -->
	        <table id="entrust_datagrid", toolbar="#entrust-toolbar">
	        </table>
	    </div>
	</div>
	<div id="entrust-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:450px; padding:10px;">
		<form id="entrust-form" method="post">
	        <table>
	        	<tr>
	        		<td valign="top" align="right">是否启用</td>
	        		<td>
	        		<input type="radio" name="state" value="1">启用
	        		<input type="radio" name="state" value="0">停用
	        		</td>
	        	</tr>
	            <tr>
	                <td width="80" align="right">委托方名称:</td>
	                <td><input type="text" name="name" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td width="80" align="right">委托方简码:</td>
	                <td><input type="text" name="code" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td valign="top" align="right">案件类型:</td>
	                <td><input type="text" name="caseTypeId" class="wu-text" /></td>
	            </tr>
	        </table>
	    </form>
	</div>
<script type="text/javascript">
	function queryEntrust(){
		var name = $("#nameEntrust").val();
		var begin_entrust = $("#begin_entrust").datebox('getValue');
		var end_entrust = $("#end_entrust").datebox('getValue');
		var json = {name:name,
					begin_entrust:begin_entrust,
					end_entrust:end_entrust};
		$('#entrust_datagrid').datagrid({
	        toolbar: "#entrust_datagrid",
		    url:'queryEntrust.do',
		    queryParams:json,
			loadFilter:pagerFilter,

		    pagination:true,//如果表格需要支持分页，必须设置该选项为true
	
	        rownumbers: true,
	        fitColumns: true,
	        remoteSort: false,
	        autoRowHeight: true,
	        collapsible: true,
	        striped: true,
	        pageSize:5,
	        pageList:[2,10,15,20],
			fitColumns:true,
			selectOnCheck:false,
		    
		    loadMsg:'数据正在努力加载，请稍后...',   //加载数据时显示提示信息
		    columns:[[
		    	// 复选框
		    	{checkbox:true},
		    	// column里面作if判断
		        {field:'state',title:'客户状态',
		    		formatter: function(value,row,index){
						if (value == 0){
							return "已停用";
						} else {
							return "启用";
						}
					}
				},    
		        {field:'name',title:'委托方名称'},
		        {field:'code',title:'委托方简码'},
		        {field:'cooperateDate',title:'合作日期',
		        	formatter: function(value,row,index){
		        		var date = new Date(value);
		                pattern = "yyyy-MM-dd";  
		                return date.format(pattern);
					}
		        },
		        {field:'caseTypeId',title:'案件类型'},
		        {field:'modifyTime',title:'修改时间',
		        	formatter: function(value,row,index){
		        		var date = new Date(value);
		                pattern = "yyyy-MM-dd hh:mm:ss";  
		                return date.format(pattern);
					}
		        }
		    ]]

		});
	}
	
	//重置
	function resetEntrust(){
		$("#entrustQuery")[0].reset();
	}

	$(function(){
		$('#entrust_datagrid').datagrid({
	        toolbar: "#entrust_datagrid",
		    url:'load_entrust.do',
			loadFilter:pagerFilter,

		    pagination:true,//如果表格需要支持分页，必须设置该选项为true
	
	        rownumbers: true,
	        fitColumns: true,
	        remoteSort: false,
	        autoRowHeight: true,
	        collapsible: true,
	        striped: true,
	        pageSize:5,
	        pageList:[2,10,15,20],
			fitColumns:true,
			selectOnCheck:false,
		    
		    loadMsg:'数据正在努力加载，请稍后...',   //加载数据时显示提示信息
		    columns:[[
		    	// 复选框
		    	{checkbox:true},
		    	// column里面作if判断
		        {field:'state',title:'客户状态',
		    		formatter: function(value,row,index){
						if (value == 0){
							return "已停用";
						} else {
							return "启用";
						}
					}
				},    
		        {field:'name',title:'委托方名称'},
		        {field:'code',title:'委托方简码'},
		        {field:'cooperateDate',title:'合作日期',
		        	formatter: function(value,row,index){
		        		var date = new Date(value);
		                pattern = "yyyy-MM-dd";  
		                return date.format(pattern);
					}
		        },
		        {field:'caseTypeId',title:'案件类型'},
		        {field:'modifyTime',title:'修改时间',
		        	formatter: function(value,row,index){
		        		var date = new Date(value);
		                pattern = "yyyy-MM-dd hh:mm:ss";  
		                return date.format(pattern);
					}
		        }
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
	
	/**
	* Name 打开添加窗口
	*/
	function openAddEntrust(){
		$('#entrust-form').form('clear');
		$('#entrust-dialog').dialog({
			closed: false,
			modal:true,
            title: "添加信息",
            buttons: [{
                text: '提交',
                iconCls: 'icon-ok',
                handler: addEntrust
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                 handler: function () {
                    $('#entrust-dialog').dialog('close');                    
                } 
            }]
        });
	}
	
	function addEntrust(){
		$('#entrust-form').form('submit', {
			url:'add_entrust.do',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#entrust-dialog').dialog('close');
					var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
					tab.panel('refresh');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
					$('#entrust-dialog').dialog('close');
				}
			}
		});
	}
	
	/**
	* Name 打开修改窗口
	*/
	function openEditEntrust(){
		//读取记录填充到表单中。
		$('#entrust-form').form('clear');
		var item = $('#entrust_datagrid').datagrid('getSelected');
		// 没选
		if(item == null || id == ""){
			$.messager.show({
				title:'message',
				msg:'请点击需要修改的行',
				timeout:2000,
				showType:'fade',
				style:{
					right:'',
					top:document.body.scrollTop+document.documentElement.scrollTop,
					bottom:''
				}
			});
			return;
		}
		var id = item.id;
		$.ajax({
			url:'getEntrustById.do',
			data:{id:id},
			success:function(result){
				// 返回数据把时间格式修改一下
        		var date = new Date(result.cooperateDate);
                pattern = "yyyy-MM-dd";  
                result.cooperateDate = date.format(pattern);
                
				//绑定值
				$('#entrust-form').form('load', result);
			}	
		});
		$('#entrust-dialog').dialog({
			closed: false,
			modal:true,
            title: "修改信息",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: editEntrust
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#entrust-dialog').dialog('close');                    
                }
            }]
        });
	}
	
	function editEntrust(){
		var item = $('#entrust_datagrid').datagrid('getSelected');
		var id = item.id;
		$('#entrust-form').form('submit', {
			url:'edit_entrust.do?id='+id,
			success:function(data){
				if(data){
					$.messager.alert('信息提示','修改成功！','info');
					// 关闭会话框
					$('#entrust-dialog').dialog('close');
					// 刷新tab
					var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
					tab.panel('refresh');
				}
				else
				{
					$.messager.alert('信息提示','修改失败！','info');
					$('#entrust-dialog').dialog('close');
				}
			}
		});
	}
	
	/*
	*删除
	*/
	function removeEntrust(){
		var item = $('#entrust_datagrid').datagrid('getSelected');
		if(item == null || id == ""){
			$.messager.show({
				title:'message',
				msg:'请点击需要修改的行',
				timeout:2000,
				showType:'fade',
				style:{
					right:'',
					top:document.body.scrollTop+document.documentElement.scrollTop,
					bottom:''
				}
			});
			return;
		}
		var json_param = {};
		for(var i=0;i<item.length;i++){
			json_param["listEntrust["+i+"].id"] = item[i].id;
		}
		
		$.messager.confirm('确认对话框', '您确定要删除勾选项吗？', function(r){
			if (r){
			    // 删除操作;
			    $.post("deleteEntrust.do",json_param,function(data){
			    	if(data){
						$.messager.alert('信息提示','删除成功！','info');
						// 刷新tab
						var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
						tab.panel('refresh');
			    	}else{
						$.messager.alert('信息提示','删除失败！','info');
					}
			    });
			}
		});
	}
	
	function enableEntrust(){
		// 获取所有选中的复选框
		var item = $('#entrust_datagrid').datagrid('getChecked');
		if(item.length == 0){
			$.messager.show({
				title:'message',
				msg:'请点击需要修改的行',
				timeout:2000,
				showType:'fade',
				style:{
					right:'',
					top:document.body.scrollTop+document.documentElement.scrollTop,
					bottom:''
				}
			});
			return;
		}
		var json_param = {};
		for(var i=0;i<item.length;i++){
			json_param["listEntrust["+i+"].id"] = item[i].id;
			json_param["listEntrust["+i+"].state"] = item[i].state;
		}
		// ajax异步刷新客户状态
		$.post("enableEntrust.do",json_param,function(data){
			if(data){
				$.messager.alert('信息提示','更新状态成功！','info');
				// 刷新tab
				var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
				tab.panel('refresh');
				// 刷新, 全选框仍然在勾选着
				//$('#entrust_datagrid').datagrid('reload');
	    	}else{
				$.messager.alert('信息提示','更新状态失败！','info');
			}
		}); 
	}
	
	function unableEntrust(){
		// 获取所有选中的复选框
		var item = $('#entrust_datagrid').datagrid('getChecked');
		if(item.length == 0){
			$.messager.show({
				title:'message',
				msg:'请点击需要修改的行',
				timeout:2000,
				showType:'fade',
				style:{
					right:'',
					top:document.body.scrollTop+document.documentElement.scrollTop,
					bottom:''
				}
			});
			return;
		}
		var json_param = {};
		for(var i=0;i<item.length;i++){
			json_param["listEntrust["+i+"].id"] = item[i].id;
			json_param["listEntrust["+i+"].state"] = item[i].state;
		}
		// ajax异步刷新客户状态
		$.post("unableEntrust.do",json_param,function(data){
			if(data){
				$.messager.alert('信息提示','更新状态成功！','info');
				// 刷新tab
				var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
				tab.panel('refresh');
				// 刷新, 全选框仍然在勾选着
				//$('#entrust_datagrid').datagrid('reload');
	    	}else{
				$.messager.alert('信息提示','更新状态失败！','info');
			}
		}); 
	}
	
</script>
</body>
</html>