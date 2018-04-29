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
	        <div id="employee-toolbar">
			    <div id="aa" class="easyui-accordion">   
				    <div title="过滤条件" style="padding: 10px!important">
				    <form id="employeeQuery">
				    	<label>员工状态：</label>
				    	<select id="status" class="class="easyui-combobox"">
					    	<option value="-1">全部</option>
					    	<option value="0">停用</option>
					    	<option value="1">启用</option>
				    	</select>
				    	<label>机构：</label><select id="orgId" class="class="easyui-combobox"">
				    		<option value="">全部</option>
				    		<c:forEach items="${list_organization }" var="org">
				    			<option value=${org.id }>${org.name }</option>
				    		</c:forEach>
				    	</select>
				    	<label>账号：</label><input id="number" name="number" class="wu-text" style="width:100px"/>
				    	<label>姓名：</label><input id="userName" name="userName" class="wu-text" style="width:100px"/>
			            <a onclick="queryEmployee()" style="margin-left: 10px;background-color:#62C3EA;border-radius:5px" class="wu-text" href="javascript:;"><font color="#fff">查询</font></a>
			            <a onclick="resetEmployee()" style="margin-left: 10px;background-color:#62C3EA;border-radius:5px" class="wu-text" href="javascript:;"><font color="#fff">重置查询</font></a>
				    </form>
				    </div>   
				</div>
	            <div class="wu-toolbar-button">
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="openAddEmployee()">添加</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="openEditEmployee()">修改</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="enableEmployee()">启用</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="unableEmployee()">停用</a>
	            </div>
	        </div>
	        <!-- End of toolbar -->
	        <table id="employee_datagrid", toolbar="#employee-toolbar">
	        </table>
	    </div>
	</div>
	<div id="employee-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:450px; padding:10px;">
		<form id="employee-form" method="post">
	        <table>
	            <tr>
	                <td width="60" align="right">账号:</td>
	                <td><input type="text" name="number" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td width="60" align="right">初始密码:</td>
	                <td><input type="password" name="salt" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td width="60" align="right">姓名:</td>
	                <td><input type="text" name="userName" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td valign="top" align="right">性别:</td>
	                <td>
		                <input type="radio" name="sex" value='false'/>男
		                <input type="radio" name="sex" value='true'/>女
	                </td>
	            </tr>
	            <tr>
	                <td width="60" align="right">联系方式:</td>
	                <td><input type="text" name="contactMode" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td width="60" align="right">入职日期:</td>
	                <td><input type="text" name="joinTime" class="easyui-datebox" /></td>
	            </tr>
	            <tr>
	                <td valign="top" align="right">坐席用户:</td>
	                <td><input type="text" name="ccLogin" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td valign="top" align="right">坐席密码:</td>
	                <td><input type="password" name="ccPwd" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td valign="top" align="right">服务地址:</td>
	                <td><input type="text" name="ccServer" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td valign="top" align="right">坐席号:</td>
	                <td><input type="text" name="ccPhone" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td valign="top" align="right">所属机构:</td>
	                <td>
	                	<select name="orgId" class="easyui-combobox">
		                	<c:forEach items="${list_organization }" var="org">
				    			<option value='${org.id }'>${org.name }</option>
				    		</c:forEach>
	                	</select>
	                </td>
	            </tr>
	            <tr>
	                <td valign="top" align="right">岗位:</td>
	                <td>
	                	<select name="positionId" class="easyui-combobox">
		                	<c:forEach items="${list_pos }" var="pos">
				    			<option value='${pos.id }'>${pos.name }</option>
				    		</c:forEach>
	                	</select>
	                </td>
	            </tr>
	            <tr>
	                <td valign="top" align="right">附加机构:</td>
	                <td><select class="easyui-combobox" multiple="multiple"></select></td>
	            </tr>
	            <tr>
	                <td valign="top" align="right">关联角色:</td>
	                <td><select class="easyui-combobox"></select></td>
	            </tr>
	            <tr>
	                <td valign="top" align="right">委托方:</td>
	                <td><select name="attachEntrustId" class="easyui-combobox">
	                		<c:forEach items="${list_ent }" var="ent">
				    			<option value='${ent.id }'>${ent.name }</option>
				    		</c:forEach>
	                </select></td>
	            </tr>    
	        </table>
	    </form>
	</div>
<script type="text/javascript">
	// 查询
	function queryEmployee(){
		var status = $("#status").val();
		var orgId = $("#orgId").val();
		var number = $("#number").val();
		var userName = $("#userName").val();
		var json = {status:status,
				number:number,
				orgId:orgId,
				userName:userName};
		console.log(json);
	 	$('#employee_datagrid').datagrid({
		    url:'queryEmployee.do',
			fitColumns:true,
			selectOnCheck:false,
			loadFilter:pagerFilter,
		    
		    pagination:true,//如果表格需要支持分页，必须设置该选项为true
		    pageSize:5,   //表格中每页显示的行数
		    loadMsg:'数据正在努力加载，请稍后...',   //加载数据时显示提示信息
		    pageList:[5,10,15],
		    queryParams:json,
		    // 行号列
		    rownumbers:true,
		    columns:[[
		    	// 复选框
		    	{checkbox:true},
		    	// column里面作if判断
		        {field:'status',title:'客户状态',
		    		formatter: function(value,row,index){
						if (value == 0){
							return "已停用";
						} else {
							return "启用";
						}
					}
				},    
		        {field:'number',title:'账号'},
		        {field:'userName',title:'姓名'},
		        {field:'sex',title:'性别',
		        	formatter: function(value,row,index){
						if (value){
							return "女";
						} else {
							return "男";
						}
		        	}
				},
		        {field:'joinTime',title:'入职时间',
		        	formatter: function(value,row,index){
		        		var date = new Date(value);
		                pattern = "yyyy-MM-dd hh:mm:ss";  
		                return date.format(pattern);
					}
		        },
		        {field:'posName',title:'岗位'},
		        {field:'orgName',title:'机构'},
		        {field:'createTime',title:'录入时间',width:150,
		        	formatter: function(value,row,index){
		        		var date = new Date(value);
		                pattern = "yyyy-MM-dd hh:mm:ss";  
		                return date.format(pattern);
					}
		        },
		        {field:'modifyTime',title:'修改时间',width:150,
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
	function resetEmployee(){
		$("#employeeQuery")[0].reset();
	}
	$(function(){
		$('#employee_datagrid').datagrid({
			fitColumns:true,
			selectOnCheck:false,
			loadFilter:pagerFilter,
		    
		    pagination:true,//如果表格需要支持分页，必须设置该选项为true
		    pageSize:5,   //表格中每页显示的行数
		    loadMsg:'数据正在努力加载，请稍后...',   //加载数据时显示提示信息
		    pageList:[5,10,15],
		    url:'load_employee.do',
		    // 行号列
		    rownumbers:true,
		    columns:[[
		    	// 复选框
		    	{checkbox:true},
		    	// column里面作if判断
		        {field:'status',title:'客户状态',
		    		formatter: function(value,row,index){
						if (value == 0){
							return "已停用";
						} else {
							return "启用";
						}
					}
				},    
		        {field:'number',title:'账号'},
		        {field:'userName',title:'姓名'},
		        {field:'sex',title:'性别',
		        	formatter: function(value,row,index){
						if (value){
							return "女";
						} else {
							return "男";
						}
		        	}
				},
		        {field:'joinTime',title:'入职时间',
		        	formatter: function(value,row,index){
		        		var date = new Date(value);
		                pattern = "yyyy-MM-dd hh:mm:ss";  
		                return date.format(pattern);
					}
		        },
		        {field:'posName',title:'岗位'},
		        {field:'orgName',title:'机构'},
		        {field:'createTime',title:'录入时间',width:150,
		        	formatter: function(value,row,index){
		        		var date = new Date(value);
		                pattern = "yyyy-MM-dd hh:mm:ss";  
		                return date.format(pattern);
					}
		        },
		        {field:'modifyTime',title:'修改时间',width:150,
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
	function openAddEmployee(){
		$('#employee-form').form('clear');
		$('#employee-dialog').dialog({
			closed: false,
			modal:true,
            title: "添加信息",
            buttons: [{
                text: '提交',
                iconCls: 'icon-ok',
                handler: addEmployee
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                 handler: function () {
                    $('#employee-dialog').dialog('close');                    
                } 
            }]
        });
	}
	
	function addEmployee(){
		$('#employee-form').form('submit', {
			url:'add_employee.do',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#employee-dialog').dialog('close');
					var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
					tab.panel('refresh');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
					$('#employee-dialog').dialog('close');
				}
			}
		});
	}
	
	/**
	* Name 打开修改窗口
	*/
	function openEditEmployee(){
		//读取记录填充到表单中。
		$('#employee-form').form('clear');
		var item = $('#employee_datagrid').datagrid('getSelected');
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
			url:'getEmployeeById.do',
			data:{id:id},
			success:function(result){
               var joinTime = new Date(result.joinTime).toLocaleDateString();
               result.joinTime = joinTime;
				//绑定值
				$('#employee-form').form('load', result);
			}	
		});
		$('#employee-dialog').dialog({
			closed: false,
			modal:true,
            title: "修改信息",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: editEmployee
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#employee-dialog').dialog('close');                    
                }
            }]
        });
	}
	
	function editEmployee(){
		var item = $('#employee_datagrid').datagrid('getSelected');
		var id = item.id;
		$('#employee-form').form('submit', {
			url:'edit_employee.do?id='+id,
			success:function(data){
				if(data){
					$.messager.alert('信息提示','修改成功！','info');
					// 关闭会话框
					$('#employee-dialog').dialog('close');
					// 刷新tab
					var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
					tab.panel('refresh');
				}
				else
				{
					$.messager.alert('信息提示','修改失败！','info');
					$('#employee-dialog').dialog('close');
				}
			}
		});
	}
	
	function enableEmployee(){
		// 获取所有选中的复选框
		var item = $('#employee_datagrid').datagrid('getChecked');
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
			json_param["listEmployee["+i+"].id"] = item[i].id;
			json_param["listEmployee["+i+"].status"] = item[i].status;
		}
		// ajax异步刷新客户状态
		$.post("enableEmployee.do",json_param,function(data){
			if(data){
				$.messager.alert('信息提示','更新状态成功！','info');
				// 刷新tab
				var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
				tab.panel('refresh');
				// 刷新, 全选框仍然在勾选着
				//$('#employee_datagrid').datagrid('reload');
	    	}else{
				$.messager.alert('信息提示','更新状态失败！','info');
			}
		}); 
	}
	
	function unableEmployee(){
		// 获取所有选中的复选框
		var item = $('#employee_datagrid').datagrid('getChecked');
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
			json_param["listEmployee["+i+"].id"] = item[i].id;
			json_param["listEmployee["+i+"].status"] = item[i].status;
		}
		// ajax异步刷新客户状态
		$.post("unableEmployee.do",json_param,function(data){
			if(data){
				$.messager.alert('信息提示','更新状态成功！','info');
				// 刷新tab
				var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
				tab.panel('refresh');
				// 刷新, 全选框仍然在勾选着
				//$('#employee_datagrid').datagrid('reload');
	    	}else{
				$.messager.alert('信息提示','更新状态失败！','info');
			}
		}); 
	}
	
</script>
</body>
</html>