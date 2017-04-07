<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"
	isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dubbo</title>
<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="themes/icon.css">
<link rel="stylesheet" type="text/css" href="css/demo.css">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
<script type="text/javascript">

/**
 * 添加选项卡
 */
function addTab(title, url){
	if ($('#tt').tabs('exists', title)){
		$('#tt').tabs('select', title);
	} else {
		var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:99%;"></iframe>';
		$('#tt').tabs('add',{
			title:title,
			content:content,
			closable:true
		});
	}
}
/**
 * 打开菜单
 */
function openMenu(url,name){
	addTab(name,url);
	
}

/**
 * 关闭当前选项卡
 */
function closeTab(){
	var tab = $('#tt').tabs('getSelected');
	if (tab){
		var index = $('#tt').tabs('getTabIndex', tab);
		$('#tt').tabs('close', index);
	}
}

/**
 * 显示成功消息
 */
function showSuccessMsg(msg){
	$.messager.show({
		title:'',
		msg:"<span style='font-size: 2em'>"+msg+" </span>",
		timeout:3000,
		showType:'slide',
		/* timeout:0, */
		style:{
			'background':'linear-gradient(to bottom,#78D236 0,#78D236 20%)',
			'text-align':'center',
			'font-size': '15px',
			right:'',
			top:'60px',
			bottom:''
		}
	});
}
/**
 * 显示失败消息
 */
 function showErrorMsg(msg){
		$.messager.show({
			title:'',
			msg:"<span style='font-size: 2em'>"+msg+" </span>",
			timeout:3000,
			showType:'slide',
			/* timeout:0, */
			style:{
				'background':'linear-gradient(to bottom,red 0,red 20%)',
				'text-align':'center',
				'font-size': '15px',
				right:'',
				top:'60px',
				bottom:''
			}
		});
	}
</script>
<style type="text/css">
	html,body{
    height:100%
}
</style>
</head>

<body  class="easyui-layout">

    <div style="padding-left:30px; height:60px; " region="north"  ></div>  
     <div data-options="region:'west',split:true" style="width:200px;" title="菜单">
    	<ul>
			<li><a href="javaScript:openMenu('toUserList','菜单一');" >菜单一</a> </li>
			<li><a href="javaScript:openMenu('toUserList','菜单二');" >菜单二</a> </li>
		</ul>
	</div> 
    <div id="center" data-options="region:'center',split:true" >
		<div id="tt" class="easyui-tabs"  style="height:100%;">
				<div title="主页" style="padding:10px;height:100%; " >
					我是主页
				</div>
			</div>
	</div>  
   
</body>
</html>