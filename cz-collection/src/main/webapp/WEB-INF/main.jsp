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
<script type="text/javascript" src="js/jquery.form.js"></script>
<link rel="stylesheet" type="text/css" href="js/easyui/themes/bootstrap/easyui.css">
<link rel="stylesheet" type="text/css" href="css/sty.css" />
<link rel="stylesheet" type="text/css" href="js/easyui/themes/icon.css">
<script type="text/javascript" src="js/easyui/jquery.easyui.min.js"></script>
<!-- <script type="text/javascript" src="js/easyui/locale/easyui-lang-zh_CN.js"></script> -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
	function add_tab(url,title){
		// 判断选项卡是否存在
		var b = $('#tt').tabs('exists',title);
		if(!b){
			// add a new tab panel    
			$('#tt').tabs('add',{    
			    title:title,
			    // 远程加载url地址jsp页面的body部分
			    href: url,    
			    closable:true,    
			    tools:[{    
			        iconCls:'icon-mini-refresh',    
			        handler:function(){    
			            //alert('refresh');
			        	var tab = $('#tt').tabs('getSelected');  // 获取选择的面板
			        	tab.panel('refresh');
			        }    
			    }]    
			}); 
		}else{
			$('#tt').tabs('select',title);
		}
	}
	
	//为Date原型添加如下的方法：
	Date.prototype.format = function(fmt) { 
	    var o = { 
	       "M+" : this.getMonth()+1,                 //月份 
	       "d+" : this.getDate(),                    //日 
	       "h+" : this.getHours(),                   //小时 
	       "m+" : this.getMinutes(),                 //分 
	       "s+" : this.getSeconds(),                 //秒 
	       "q+" : Math.floor((this.getMonth()+3)/3), //季度 
	       "S"  : this.getMilliseconds()             //毫秒 
	   }; 
	   if(/(y+)/.test(fmt)) {
	           fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length)); 
	   }
	    for(var k in o) {
	       if(new RegExp("("+ k +")").test(fmt)){
	            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));
	        }
	    }
	   return fmt; 
	}
</script>
<title>后台管理系统</title>
</head>
<body class="easyui-layout">
    <div class="wu-header" data-options="region:'north',border:false,split:true">
    	<div class="wu-header-left">
        	<h1>后台管理</h1>
        </div>
        <div class="wu-header-right">
        	<p><strong class="easyui-tooltip" title="2条未读消息">admin</strong>，欢迎您！</p>
            <p><a href="#">网站首页</a>|<a href="#">支持论坛</a>|<a href="#">帮助中心</a>|<a href="#">安全退出</a></p>
        </div>
    </div>   
    <div data-options="region:'west',title:'导航菜单',split:true" style="width:160px;">
		<ul class="easyui-tree">
		    <li>   
		        <span>系统管理</span>   
		        <ul>   
		            <li>
		                <span><a href="javascript:add_tab('organization.do','组织机构')">组织机构</a></span>   
		            </li>   
		            <li>   
		                <span><a href="javascript:add_tab('position.do','职位管理')" >职位管理</a></span>   
		            </li>   
		            <li>   
		                <span><a href="javascript:add_tab('entrust.do','委托方管理')" >委托方管理</a></span>   
		            </li>   
		            <li>   
		                <span><a href="javascript:add_tab('employee.do','员工管理')" >员工管理</a></span>   
		            </li>   
		            <li>   
		                <span><a href="javascript:add_tab('case_batch.do','批次管理')" >批次管理</a></span>   
		            </li>   
		            <li>   
		                <span><a href="javascript:add_tab('case_info.do','案件管理')">案件管理</a></span>   
		            </li>   
		            <li>   
		                <span><a href="javascript:add_tab('case_paid.do','还款管理')">还款管理</a></span>   
		            </li>   
		        </ul>   
		    </li>   
		</ul>
	</div>

    <div data-options="region:'center'" style="padding:5px;background:#eee;">
    	<div id="tt" class="easyui-tabs" style="height: 500px">
	        <!-- <div title="首页" data-options="href:'temp/layout-1.html',closable:false,iconCls:'icon-tip',cls:'pd3'"></div> -->
	        <div title="首页"></div>
		</div>
    </div> 
<script type="text/javascript">

</script>
</body>
</html>