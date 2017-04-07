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
<script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
	<div style="margin:20px 0;"></div>
		<div style="text-align:center;padding:5px">
		    <form id="ff" class="easyui-form" method="post" action="saveUser" data-options="novalidate:true">
		    	<table cellpadding="5">
		    	<input value="${user.id}" hidden="true"  type="text" name="id"></input>
		    		<tr>
		    			<td>userNo:</td>
		    			<td><input value="${user.userNo}" class="easyui-textbox" type="text" name="userNo" data-options="required:true"></input></td>
		    		</tr>
		    		<tr>
		    			<td>userName:</td>
		    			<td><input value="${user.userName}" class="easyui-textbox" type="text" name="userName" data-options="required:true"></input></td>
		    		</tr>
		    		<tr>
		    			<td>userPwd:</td>
		    			<td><input value="${user.userPwd}" class="easyui-textbox" type="text" name="userPwd" data-options="required:true"></input></td>
		    		</tr>
		    	</table>
		    </form>
		    <div style="text-align:center;padding:5px">
		    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">保存</a>
		    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">清空</a>
		    </div>
	    </div>
	<script>
	
		function submitForm(){
			$('#ff').form('submit',{
				onSubmit:function(){
					return $(this).form('enableValidation').form('validate');
				},success:function(data){
					//转换成json对象，一定要加括号由于json是以”{}”的方式来开始以及结束的，在JS中，它会被当成一个语句块来处理，所以必须强制性的将它转换成一种表达
					//或者用jQuery.parseJSON
					data=eval("("+data+")");
					if(data.type=="success"){
						window.parent.showSuccessMsg(data.data);
						window.parent.closeTab();
					}else{
						window.parent.$.messager.showErrorMsg(data.data);
					}
				},error:function(){
					window.parent.$.messager.showErrorMsg('提交失败!');
				}
			});
		}
		function clearForm(){
			$('#ff').form('clear');
		}
	</script>
</body>
</html>