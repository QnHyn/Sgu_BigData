<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- html5会报警告不建议使用,html4正常 -->
	<center>
		<h1>欢迎<span style="color: bLue">${sessionScope.user.username}</span>登录,  当前在线<span style="color: red">${applicationScope.count}</span>人, <a href="${pageContext.request.contextPath}/logoutServlet">注销</a></h1>
		<c:if test="${empty requestScope.users}">
			<h1>不存在用户</h1>
		</c:if>
		<c:if test="${! empty requestScope.users}">
		<h1>用户列表</h1>
		<!-- cellpadding:单元格大小  cellspacing:单元格间隙 -->
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>ID</th>
				<th>UserName</th>
				<th>Password</th>
				<th>Email</th>
				<th colspan="2">Operate</th>
			</tr>
			<c:forEach items="${requestScope.users}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.password}</td>
				<td>${user.email}</td>
				<td><a href="#">Edit</a></td>
				<td><a href="#">Delete</a></td>
			</tr>
			</c:forEach>
		</table>
		</c:if>
	</center>
	
</body>
</html>