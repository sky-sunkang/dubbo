<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="themes/icon.css">
<link rel="stylesheet" type="text/css" href="css/demo.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<!-- 提示为中文 -->
<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">
		$(function() {
			var pager = $('#dg').datagrid().datagrid('getPager'); // get the pager of datagrid
			pager.pagination({
				buttons : [ {
					iconCls : 'icon-search',
					handler : function() {
						$('#dg').datagrid('load',{
							userNo: $('#userNo').val(),
							productid: $('#productid').val()
						});
					}
				}, {
					iconCls : 'icon-add',
					handler : function() {
						var url="addUser";
						window.parent.addTab("新增用户",url);
					}
				}, {
					iconCls : 'icon-edit',
					handler : function() {
						//拿到选择的那行数据
						var row = $('#dg').datagrid('getSelected');
						if(row==null){
							alert("请选择要修改的数据！");
						}else{
							console.log(row);
							var url="addUser?id="+row.id;
							window.parent.addTab("修改用户",url);
						}
					}
				} ]
			});
		})
		
		function doSearch(){
			
			$('#dg').datagrid('load',{
				userNo: $('#userNo').val(),
				productid: $('#productid').val()
			});
		}
		//装换时间
		function formatTime(val,row){
				return formatDateTime(new Date(val));
		}
		
		/* 装换格式 yyyy-MM-dd HH:mm:ss */
		var formatDateTime = function (date) {  
		    var y = date.getFullYear();  
		    var m = date.getMonth() + 1;  
		    m = m < 10 ? ('0' + m) : m;  
		    var d = date.getDate();  
		    d = d < 10 ? ('0' + d) : d;  
		    var h = date.getHours();  
		    h = h < 10 ? ('0' + h) : h;
		    var minute = date.getMinutes();  
		    minute = minute < 10 ? ('0' + minute) : minute;
		    var seconds = date.getSeconds()
		    seconds = seconds < 10 ? ('0' + seconds) : seconds; 
		    return y + '-' + m + '-' + d+' '+h+':'+minute+':'+seconds;  
		};  
		
		/* 转换用户类型 */
		function formatUserType(val,row){
			console.log(val);
			switch (val) {
			case "1":
				return "超级管理员";
				break;
			case "2":
				return "普通管理员";
				break;
			case "3":
				return "用户主帐号";
				break;
			case "4":
				return "用户子帐号";
				break;
			default:
				return "黑号";
				break;
			}
		}
		
		/* 转换用户状态 */
		function formatStatus(val,row){
			switch (val) {
			case 100:
				return "可用";
				break;
			case 101:
				return "不可用";
				break;
			default:
				return "不存在";
				break;
			}
		}
	</script>
<style type="text/css">
html,body{
    height:96%
}
</style>
</head>

<body >
	<div id="tb" style="padding:3px;height:20%">
		<span>用户号:</span>
		<input id="userNo" style="line-height:26px;border:1px solid #ccc">
		<a href="#" class="easyui-linkbutton" plain="true" onclick="doSearch()">查询</a>
	</div>
	<table id="dg" style="width:100%;height:80%"
		data-options="fitColumns:true,rownumbers:true,singleSelect:true,pagination:true,url:'selectUser',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'id'" width="15%" hidden="true">id</th>
				<th data-options="field:'userNo'" width="10%">用户账号</th>
				<th data-options="field:'userType'" width="5%" formatter="formatUserType">用户类型</th>
				<th data-options="field:'userName'" width="10%">姓名</th>
				<th data-options="field:'mobileNo'" width="15%">手机号</th>
				<th data-options="field:'email'" width="15%">邮箱</th>
				<th data-options="field:'status'" width="5%" formatter="formatStatus">状态</th>
				<th data-options="field:'lastLoginTime'" width="15%" formatter="formatTime">最后登录时间</th>
				<th data-options="field:'remark'" width="25%">备注</th>
			</tr>
		</thead>
	</table>
</body>
</html>