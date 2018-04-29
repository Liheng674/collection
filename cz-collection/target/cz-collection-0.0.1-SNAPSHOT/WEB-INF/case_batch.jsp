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
	        <div id="caseBatch-toolbar">
			    <div id="aa" class="easyui-accordion">   
				    <div title="过滤条件" style="padding: 10px!important">
				    <form id="caseBatchQuery">
				    	<label>批次号：</label>
				    	<select class="easyui-combobox" id="batchCode">
				    		<option value="">全部</option>
				    		<c:forEach items="${list_case_batch }" var="cb">
	        					<option value="${cb.batchCode }">${cb.batchCode }</option>
	        				</c:forEach>
				    	</select>
				    	<label>案件类型：</label>
				    	<select class="easyui-combobox" id="typeId">
				    		<option value="">全部</option>
				    		<c:forEach items="${list_caseInfos }" var="info">
		        				<option value="${info.id }">${info.caseName }</option>
	        				</c:forEach>
				    	</select>
				    	<label>委托方：</label>
				    	<select class="easyui-combobox" id="entrustId">
				    		<option value="">全部</option>
				    		<c:forEach items="${list_ent }" var="ent">
	        					<option value="${ent.id }">${ent.name }</option>
	        				</c:forEach>
				    	</select>
				    	<label>委案日期：</label><input id="begin_case_batch" class="easyui-datebox" style="width:100px">
			            <label>至：</label><input id="end_case_batch" class="easyui-datebox" style="width:100px">
			            <label>批次状态：</label>
			            <select class="easyui-combobox" id="state">
			            	<option value="-1">全部</option>
			            	<option value="0">未导入</option>
			            	<option value="1">已导入未退案</option>
			            	<option value="2">已导入已退案</option>
			            </select>
			            <a onclick="queryCaseBatch()" style="margin-left: 10px;background-color:#62C3EA;border-radius:5px" class="wu-text" href="javascript:;"><font color="#fff">查询</font></a>
			            <a onclick="resetCaseBatch()" style="margin-left: 10px;background-color:#62C3EA;border-radius:5px" class="wu-text" href="javascript:;"><font color="#fff">重置查询</font></a>
				    </form>
				    </div>   
				</div>
	            <div class="wu-toolbar-button">
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="openAddCaseBatch()">添加</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="openEditCaseBatch()">修改</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="removeCaseBatch()">删除</a>
	                <a id="outExcel" href="javascript:void(0)" class="easyui-linkbutton" onclick="outCaseBatch()">导出批次</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="updateCaseBatch()">更新批次</a>
	            </div>
	        </div>
	        <!-- End of toolbar -->
	        <table id="caseBatch_datagrid", toolbar="#caseBatch-toolbar">
	        </table>
	    </div>
	</div>
	<div id="caseBatch-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:450px; padding:10px;">
		<form id="caseBatch-form" method="post">
	        <table>
	        	<tr>
	        		<td width="60" align="right">案件类型：</td>
	        		<td><select class="easyui-combobox" name="typeId">
	        			<c:forEach items="${list_caseInfos }" var="info">
		        			<option value="${info.id }">${info.caseName }</option>
	        			</c:forEach>
			    	</select></td>
			    </tr>
			    <tr>
			    	<td width="60" align="right">委托方：</td>
			    	<td><select class="easyui-combobox" name="entrustId">
			    		<c:forEach items="${list_ent }" var="ent">
	        				<option value="${ent.id }">${ent.name }</option>
	        			</c:forEach>
			    	</select></td>
	        	</tr>
	        	<tr>
	                <td width="60" align="right">委案日期:</td>
	                <td><input type="text" name="beginDate" class="easyui-datebox" /></td>
	            </tr>
	            <tr>
	                <td width="60" align="right">退案日期:</td>
	                <td><input type="text" name="endDate" class="easyui-datebox" /></td>
	            </tr>
	            <tr>
	                <td width="80" align="right">目标回款率:</td>
	                <td><input type="text" name="target" />%</td>
	            </tr>
	            <tr>
	                <td width="80" align="right">批次号:</td>
	                <td><input type="text" name="batchCode" /></td>
	            </tr>
	            <tr>
			    	<td width="60" align="right">手次：</td>
			    	<td><select name="handle" class="easyui-combobox">
			    		<option>一手</option>
			    		<option>二手</option>
			    		<option>三手</option>
			    	</select></td>
	        	</tr>
	        	<tr>
			    	<td width="60" align="right">模板类型：</td>
			    	<td><select class="easyui-combobox" name="template_type">
			    		<option value="1">p2p</option>
			    		<option value="2">银行</option>
			    		<option value="3">车贷</option>
			    	</select></td>
	        	</tr>
	        	<tr>
	                <td width="60" align="right">导入文件</td>
	                <td><input name="batchXls" id="photoCover" type="text">
               			<a onclick="$('input[id=batchXls]').click();" style="margin-left: 10px;background-color:#62C3EA;border-radius:5px" class="wu-text" href="javascript:;">
               			<font color="#fff">选择案件excel文件</font></a>
               		</td>
                </tr>
	        </table>
	    </form>
	    <form action="leadInExcel.do" id="leadInExcel" method="post" enctype="multipart/form-data">
	    	<input type="file" name="file" id="batchXls" onchange="doChange(this)" style="display:none;"/>
		</form>
	</div>
	<div id="caseBatch-dialog_update" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:450px; padding:10px;">
		<form id="caseBatch-form-update" method="post">
	        <table>
	        	<tr>
	        		<td width="60" align="right">案件类型：</td>
	        		<td><select class="easyui-combobox" name="typeId">
	        			<c:forEach items="${list_caseInfos }" var="info">
		        			<option value="${info.id }">${info.caseName }</option>
	        			</c:forEach>
			    	</select></td>
			    </tr>
			    <tr>
			    	<td width="60" align="right">委托方：</td>
			    	<td><select class="easyui-combobox" name="entrustId">
			    		<c:forEach items="${list_ent }" var="ent">
	        				<option value="${ent.id }">${ent.name }</option>
	        			</c:forEach>
			    	</select></td>
	        	</tr>
	        	<tr>
	                <td width="60" align="right">委案日期:</td>
	                <td><input type="text" name="beginDate" class="easyui-datebox" /></td>
	            </tr>
	            <tr>
	                <td width="60" align="right">退案日期:</td>
	                <td><input type="text" name="endDate" class="easyui-datebox" /></td>
	            </tr>
	            <tr>
	                <td width="80" align="right">目标回款率:</td>
	                <td><input type="text" name="target" class="wu-text" />%</td>
	            </tr>
	            <tr>
	                <td width="80" align="right">批次号:</td>
	                <td><input readonly="readonly" type="text" name="batchCode" class="wu-text"/></td>
	            </tr>
	            <tr>
			    	<td width="60" align="right">手次：</td>
			    	<td><select name="handle" class="easyui-combobox">
			    		<option>一手</option>
			    		<option>二手</option>
			    		<option>三手</option>
			    	</select></td>
	        	</tr>
	            <tr>
			    	<td width="60" align="right">备注：</td>
			    	<td><textarea name="remark" rows="" cols=""></textarea></td>
	        	</tr>
	        </table>
	    </form>
	    
	</div>
<script type="text/javascript">
//浏览按钮上的onclick事件即为触发原<input type="file">选择上传文件的事件
	function doChange(file){
	    var upload_file = $.trim($("#batchXls").val());    //获取上传文件
	    var file_name = upload_file.substring(upload_file.lastIndexOf("\\") + 1);
	    $('#photoCover').val(file_name);     //赋值给自定义input框
	}

	// 查询
	function queryCaseBatch(){
		var batchCode = $("#batchCode").combobox("getValue");
		var typeId = $("#typeId").combobox("getValue");
		var entrustId = $("#entrustId").combobox("getValue");
		var begin_case_batch = $("#begin_case_batch").datebox('getValue');
		var end_case_batch = $("#end_case_batch").datebox('getValue');
		var state = $("#state").combobox("getValue");
		var json = {state:state,
				batchCode:batchCode,
				typeId:typeId,
				entrustId:entrustId,
				begin:begin_case_batch,
				end:end_case_batch
				};
		console.log(json);
		$('#caseBatch_datagrid').datagrid({
	        toolbar: "#caseBatch_datagrid",
		    url:'queryCaseBatch.do',
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
	        pageList:[5,10,15,20],
			fitColumns:true,
			selectOnCheck:false,
		    
		    loadMsg:'数据正在努力加载，请稍后...',   //加载数据时显示提示信息
		    columns:[[
		    	// 复选框
		    	{checkbox:true},
		    	{field:'batchCode',title:'批次号',
		    		formatter: function (value,row,index){
		    			return "<a style='color: blue;' href='upload/"+row.batchXls+"'>"+value+"</a>";
		    		}
			    },
		    	{field:'entrustName',title:'委托方'},
		    	{field:'totalNumber',title:'总户数'},
		    	{field:'totalMoney',title:'总金额'},
		    	{field:'caseInfoName',title:'案件类型'},
		    	{field:'beginDate',title:'委案日期',
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
		    	// column里面作if判断
		        {field:'state',title:'批次状态',
		    		formatter: function(value,row,index){
						if (value == 0){
							return "未导入";
						} 
						if(value == 1){
							return "已导入未退案";
						}
						if(value == 2){
							return "已导入已退案";
						}
					}
				},    
		        {field:'remark',title:'备注'},
		        
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
	function resetCaseBatch(){
		$("#caseBatchQuery")[0].reset();
	}
	$(function(){
		$('#caseBatch_datagrid').datagrid({
	        toolbar: "#caseBatch_datagrid",
		    url:'loadCaseBatch.do',
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
		    	{field:'batchCode',title:'批次号',
		    		// 批次号绑定案件excel超链接
		    		formatter: function (value,row,index){
		    			return "<a style='color: blue;' href='upload/"+row.batchXls+"'>"+value+"</a>";
		    		}
		    	},
		    	{field:'entrustName',title:'委托方'},
		    	{field:'totalNumber',title:'总户数'},
		    	{field:'totalMoney',title:'总金额'},
		    	{field:'caseInfoName',title:'案件类型'},
		    	{field:'beginDate',title:'委案日期',
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
		    	// column里面作if判断
		        {field:'state',title:'批次状态',
		    		formatter: function(value,row,index){
						if (value == 0){
							return "未导入";
						} 
						if(value == 1){
							return "已导入未退案";
						}
						if(value == 2){
							return "已导入已退案";
						}
					}
				},    
		        {field:'remark',title:'备注'},
		        
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
	function openAddCaseBatch(){
		$('#caseBatch-form').form('clear');
		$('#caseBatch-dialog').dialog({
			closed: false,
			modal:true,
            title: "添加信息",
            buttons: [{
                text: '提交',
                iconCls: 'icon-ok',
                handler: addCaseBatch
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                 handler: function () {
                    $('#caseBatch-dialog').dialog('close');                    
                } 
            }]
        });
	}
	
	function addCaseBatch(){
		$('#caseBatch-form').form('submit', {
			url:'addCaseBatch.do',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#caseBatch-dialog').dialog('close');
					var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
					tab.panel('refresh');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
					$('#caseBatch-dialog').dialog('close');
				}

			}
		});
		// 上传xls
		// 用到jquery.form.js插件
		$("#leadInExcel").ajaxSubmit({
            beforeSubmit:function(){
            }
        });
	}
	
	/**
	* Name 打开修改窗口
	*/
	function openEditCaseBatch(){
		//读取记录填充到表单中。
		$('#caseBatch-form-update').form('clear');
		var item = $('#caseBatch_datagrid').datagrid('getSelected');
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
			url:'getCaseBatchById.do',
			data:{id:id},
			success:function(result){
				// 返回数据把时间格式修改一下
        		var date1 = new Date(result.beginDate).toLocaleDateString();
        		var date2 = new Date(result.endDate).toLocaleDateString();
                result.beginDate = date1;
                result.endDate = date2;
                
				//绑定值
				$('#caseBatch-form-update').form('load', result);
			}	
		});
		$('#caseBatch-dialog_update').dialog({
			closed: false,
			modal:true,
            title: "修改信息",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: editCaseBatch
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#caseBatch-dialog_update').dialog('close');                    
                }
            }]
        });
	}
	
	function editCaseBatch(){
		var item = $('#caseBatch_datagrid').datagrid('getSelected');
		var id = item.id;
		$('#caseBatch-form-update').form('submit', {
			url:'editCaseBatch.do?id='+id,
			success:function(data){
				if(data){
					$.messager.alert('信息提示','修改成功！','info');
					// 关闭会话框
					$('#caseBatch-dialog_update').dialog('close');
					// 刷新tab
					var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
					tab.panel('refresh');
				}
				else
				{
					$.messager.alert('信息提示','修改失败！','info');
					$('#caseBatch-dialog_update').dialog('close');
				}
			}
		});
	}
	
	/*
	*删除
	*/
	function removeCaseBatch(){
		var item = $('#caseBatch_datagrid').datagrid('getSelected');
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
		$.messager.confirm('确认对话框', '您确定要删除【'+item.batchCode+'】吗？', function(r){
			if (r){
			    // 删除操作;
			    $.post("updateCaseBatchState.do",{id:id},function(data){
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
	
	// 导出批次
	function outCaseBatch(){
		var item = $('#caseBatch_datagrid').datagrid('getSelected');
		// 没选
		if(item == null){
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
		//var id = item.id;
		var batchCode = item.batchCode;
		$("#outExcel").attr("href","outCaseBatch.do?batchCode="+batchCode);
	}
</script>
</body>
</html>