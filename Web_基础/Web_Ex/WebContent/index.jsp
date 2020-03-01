<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- base标签中的href属性可以让当前页面中的相对路径变为绝对路径 -->
<base href="http://Localhost:8080/Web_Ex/">
</head>
<body>
	<!-- 
	 以/开头的路径即为绝对路径   绝对路径中的/代表什么?
		- 如果路径由浏览器解析，那么/就代表http://locahost:8080/ 
		- 如果路径由服务器解析，那么/就代表http://locahost:8080/Web_Ex/
	那些路径由浏览器解析?
   		-  HTML标签中的路径。如a标签中的href属性中的路径、form标签中的act i on属性中的路径等
   		- 重定向中的路径
	那些路径服务器解析?
   		- web.xml配置文件中ur1- pattern标签中的路径
   		- 转发中的路径	
	 -->
	<a href="pages/login.jsp">我要登录</a><br><br>
	<a href="pages/regist.jsp">我要注册</a>
</body>
</html>