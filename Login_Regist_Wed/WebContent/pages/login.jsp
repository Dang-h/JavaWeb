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
</head>
<body>
<!-- 	欢迎登录 -->
	<h1>欢迎登录</h1>
<!-- 	登录信息录入 -->
	<form action="LoginServlet" method = "post">
	用户名称：<input type = "text" name = "username"> <br>
	用户密码：<input type = "password" name = "password">
	
<!-- 	登录按钮 -->
	<input type ="submit" value = "登录">
	</form>
	<br><br> <a href = "index.jsp"> 返回首页</a>
</body>
</html>