<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 1. JSP脚本片段
		作用： 用来写java代码
	 -->
	 <%-- exception.getMessage();--%>	
	 <% 
	 	for(int i=0;i<10;i++){
	 		out.print("今天天气真好!!");
	 	}
	 %>
	 
	 <%-- 循环html语句 --%>
	 <% 
	 	for(int i=0;i<10;i++){
	 %>
	 	<h2>"今天天气真好!!"</h2>
	 <%
	 }
	 %>
	 
	 <!-- 2. JSP表达式
		作用： 用来向浏览器输出对象
	 -->
	 <%="我是通过JSP表达式输出的!" %>
	 <%-- http://localhost:8080/Web_JSP/grammar.jsp?username=admin --%>
	 <h1>欢迎您, <%=request.getParameter("username") %></h1>
	 
</body>
</html>