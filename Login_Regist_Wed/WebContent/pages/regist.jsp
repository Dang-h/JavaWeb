<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎注册</title>
<base href = "http://localhost:8080/Login_Regist_Wed/">
<style type="text/css">
body {
	background-color: #D9AB42
}
</style>
<!-- 错误处理 -->
</head>
<body>
<!-- 欢迎注册 -->
<h1>欢迎注册！！来吧~</h1>
<!-- 注册信息录入 -->
<form action="RegistServlet" method = "post">
	用户名称：<input type = "text" name = "uesrname"><br>
	用户密码：<input type = "password" name = "password"><br>
	用户邮箱：<input type = "text" name = "email"><br>
<!-- 	注册按钮 -->
	<input type = "submit" value = "注册">
	<br> <br><a href = "index.jsp"> 返回首页</a>
</form>
</body>
</html>