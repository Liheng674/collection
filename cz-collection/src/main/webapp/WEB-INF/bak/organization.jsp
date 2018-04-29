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
	        <div class="wu-toolbar">
	            <div class="wu-toolbar-button">
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="openAdd()">添加</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="openEdit()">修改</a>
	                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="remove()">删除</a>
	            </div>
	        </div>
	        <!-- End of toolbar -->
	        <table id="organization_datagrid" , toolbar="#wu-toolbar"></table>
	    </div>
	</div>
	<div id="organization-dialog" class="easyui-dialog" data-options="closed:true,iconCls:'icon-save'" style="width:400px; padding:10px;">
		<form id="organization-form" method="post">
	        <table>
	            <tr>
	                <td width="60" align="right">上级机构:</td>
	                <td><select name="parentId">
	                	<c:forEach items="${list_organization}" var="organization">
	                		<option value="${organization.id }">${organization.name }</option>
	                	</c:forEach>
	                </select></td>
	            </tr>
	            <tr>
	                <td width="60" align="right">机构类型:</td>
	                <td><select name="type">
	                		<option value="0">总公司</option>
	                		<option value="1">分公司</option>
	                </select></td>	            
	                </tr>
	            <tr>
	                <td width="60" align="right">负责人:</td>
	                <td><select name="principalId">
	                	<c:forEach items="${list_organization}" var="organization">
	                		<option value="${organization.principalId }">${organization.principalId }</option>
	                	</c:forEach>
	                </select></td>	            
	                </tr>
	            
	            <tr>
	                <td width="60" align="right">机构名称:</td>
	                <td><input type="text" name="name" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td width="60" align="right">地址:</td>
	                <td><input type="text" name="address" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td align="right">电话号码:</td>
	                <td><input type="text" name="phone" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td align="right">邮政编码:</td>
	                <td><input type="text" name="postCode" class="wu-text" /></td>
	            </tr>
	            <tr>
	                <td align="right">传真号:</td>
	                <td><input type="text" name="fax" class="wu-text" /></td>
	            </tr>
	            <tr>
	            	<td align="right">排序:</td>
	            	<td>
	            		<select name="orderNo">
	            			<option value="1">1</option>
	            			<option value="2">2</option>
	            			<option value="3">3</option>
	            			<option value="4">4</option>
	            			<option value="5">5</option>
	            		</select>
	            	</td>
	            </tr>
	        </table>
	    </form>
	</div>
<script type="text/javascript">

	$(function(){
		$('#organization_datagrid').treegrid({
			fitColumns:true,
			singleSelect:true,
			// 数据表格必须的两项
		    idField:'id',
		    treeField:'name',
			loadFilter:pagerFilter,	
		    
		    pagination:true,//如果表格需要支持分页，必须设置该选项为true
		    loadMsg:'数据正在努力加载，请稍后...',   //加载数据时显示提示信息
		    pageSize:2,   //表格中每页显示的行数
		    pageList:[2,10,15],
		    url:'load_organization.do',
		    // 行号列
		    rownumbers:true,
		    columns:[[    
		        {field:'name',title:'机构名称'},    
		        {field:'type',title:'机构类型',
		        	formatter: function(value,row,index){
		        		if(value=='0'){
		        			return "主公司";
		        		}else{
		        			return "分公司";
		        		}
		        	}
		        },
		        {field:'code',title:'机构编码',width:100},
		        {field:'principalId',title:'负责人'},
		        {field:'type',title:'业务覆盖区域',width:100},
		        {field:'address',title:'地址',width:100},
		        {field:'phone',title:'电话号码',width:100},
		        {field:'postCode',title:'邮政编码',width:100},
		        {field:'fax',title:'传真号',width:100},
		        {field:'createTime',title:'创建时间',width:150,
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
	
	/**
	* Name 分页过滤器
	*/
	function pagerFilter(data){
        if ($.isArray(data)){    // is array  
            data = {  
                total: data.length,  
                rows: data  
            }  
        }
        var dg = $(this);  
		var state = dg.data('treegrid');
        var opts = dg.treegrid('options');  
        var pager = dg.treegrid('getPager');  
        pager.pagination({  
            onSelectPage:function(pageNum, pageSize){  
                opts.pageNumber = pageNum;  
                opts.pageSize = pageSize;  
                pager.pagination('refresh',{  
                    pageNumber:pageNum,  
                    pageSize:pageSize  
                });  
                dg.treegrid('loadData',state.originalRows);  
            }  
        });  
        if (!state.originalRows){
        	state.originalRows = data.rows;
        }
        var topRows = [];
        var childRows = [];
        $.map(state.originalRows, function(row){
        	row._parentId ? childRows.push(row) : topRows.push(row);
        });
        data.total = topRows.length;
        var start = (opts.pageNumber-1)*parseInt(opts.pageSize);  
        var end = start + parseInt(opts.pageSize);  
		data.rows = $.extend(true,[],topRows.slice(start, end).concat(childRows));
		return data;
	}

	var appendMethod = $.fn.treegrid.methods.append;
	var loadDataMethod = $.fn.treegrid.methods.loadData;
	$.extend($.fn.treegrid.methods, {
		clientPaging: function(jq){
			return jq.each(function(){
				var state = $(this).data('treegrid');
				var opts = state.options;
				opts.loadFilter = pagerFilter;
				var onBeforeLoad = opts.onBeforeLoad;
				opts.onBeforeLoad = function(row,param){
					state.originalRows = null;
					onBeforeLoad.call(this, row, param);
				}
				$(this).treegrid('loadData', state.data);
				$(this).treegrid('reload');
			});
		},
		loadData: function(jq, data){
			jq.each(function(){
				$(this).data('treegrid').originalRows = null;
			});
			return loadDataMethod.call($.fn.treegrid.methods, jq, data);
		},
		append: function(jq, param){
			return jq.each(function(){
				var state = $(this).data('treegrid');
				if (state.options.loadFilter == pagerFilter){
					$.map(param.data, function(row){
						row._parentId = row._parentId || param.parent;
						state.originalRows.push(row);
					});
					$(this).treegrid('loadData', state.originalRows);
				} else {
					appendMethod.call($.fn.treegrid.methods, jq, param);
				}
			})
		}
	});
	})	
	/**
	* Name 打开添加窗口
	*/
	function openAdd(){
		$('#organization-form').form('clear');
		$('#organization-dialog').dialog({
			closed: false,
			modal:true,
            title: "添加信息",
            buttons: [{
                text: '提交',
                iconCls: 'icon-ok',
                handler: add
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                 handler: function () {
                    $('#organization-dialog').dialog('close');                    
                } 
            }]
        });
	}
	
	function add(){
		$('#organization-form').form('submit', {
			url:'add_organization.do',
			success:function(data){
				if(data){
					$.messager.alert('信息提示','提交成功！','info');
					$('#organization-dialog').dialog('close');
					//$('#organization_datagrid').datagrid('reload');
					var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
					tab.panel('refresh');
				}
				else
				{
					$.messager.alert('信息提示','提交失败！','info');
					$('#organization-dialog').dialog('close');
				}
			}
		});
	}
	
	/**
	* Name 打开修改窗口
	*/
	function openEdit(){
		//读取记录填充到表单中。
		$('#organization-form').form('clear');
		var item = $('#organization_datagrid').datagrid('getSelected');
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
			url:'getInfo.do',
			data:{id:id},
			success:function(result){
				//绑定值
				$('#organization-form').form('load', result);
			}	
		});
		$('#organization-dialog').dialog({
			closed: false,
			modal:true,
            title: "修改信息",
            buttons: [{
                text: '确定',
                iconCls: 'icon-ok',
                handler: edit
            }, {
                text: '取消',
                iconCls: 'icon-cancel',
                handler: function () {
                    $('#organization-dialog').dialog('close');                    
                }
            }]
        });
	}
	
	function edit(){
		var item = $('#organization_datagrid').datagrid('getSelected');
		var id = item.id;
		$('#organization-form').form('submit', {
			url:'edit_organization.do?id='+id,
			success:function(data){
				if(data){
					$.messager.alert('信息提示','修改成功！','info');
					// 关闭会话框
					$('#organization-dialog').dialog('close');
					// 刷新tab
					var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
					tab.panel('refresh');
				}
				else
				{
					$.messager.alert('信息提示','修改失败！','info');
					$('#organization-dialog').dialog('close');
				}
			}
		});
	}
	
	/*
	*删除
	*/
	function remove(){
		var item = $('#organization_datagrid').datagrid('getSelected');
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
		
		$.messager.confirm('确认对话框', '您确定要删除吗？删除后其子机构将一并删除。', function(r){
			if (r){
			    // 删除操作;
			    $.post("deleteById.do",{id:id},function(data){
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
</script>
</body>
</html>