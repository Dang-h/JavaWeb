<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎登录</title>
<!-- 设置绝对路径 -->
<base href = "http://localhost:8080/Login_Regist_Wed/">
<!-- 设置登录界面风格 -->
<style type="text/css">

body {
	background-color: #D9AB42
}
</style>
<!-- 登录错误处理 -->
<script type="text/javascript" src = "script/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		//给文本绑定获取焦点的事件
		$("#username").focus(function(){
			//将span标签内容置空
			$("#msgSpan").text("");
		});
		//给按钮绑定单击事件
		$("#sub").click(function(){
			//获取用户输入姓名
			var username = $("#username").val();
			//判断用户名是否为空
			if (username == "") {
				alert("用户名不能为空！");
				return false;
			}
			//获取用户密码
			var password = $("#password").val();
			//判断用户密码是否为空
			if (password == "") {
				alert("密码不能为空！");
				return false;
			}
		});
	});
</script>
</head>
<body>
<!-- 	欢迎登录 -->
	<h1>欢迎登录</h1>
<!-- 	登录信息录入 -->
	<form action="LoginServlet" method = "post">
	用户名称：<input type = "text" name = "username" id = "username">
		<span style = "color: red" id = "msgSpan"> ${requestScope.msg} </span> <br>
	用户密码：<input type = "password" name = "password" id = "password">
	
<!-- 	登录按钮 -->
	<input type ="submit" value = "登录" id = "sub">
	</form>
	<br><br> <a href = "index.jsp"> 返回首页</a>
</body>
</html>