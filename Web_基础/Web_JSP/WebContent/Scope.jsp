<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>四个域对象</title>
</head>
<body>
	<!-- 在当前页面分别向四个域中添加四个属性 -->
	<%
		pageContext.setAttribute("pageKey", "pageValue");
		request.setAttribute("reqKey", "reqValue");
		session.setAttribute("sessionKey", "sessionValue");
		application.setAttribute("applicationKey", "applicationValue");
	%>
	<h1>在当前页面中四个域中的属性值</h1>
	page域中的属性值: <%=pageContext.getAttribute("pageKey") %><br>
	request域中的属性值: <%=request.getAttribute("reqKey") %><br>
	session域中的属性值: <%=session.getAttribute("sessionKey") %><br>
	application域中的属性值: <%=application.getAttribute("applicationKey") %><br>
	<!-- 转发到Scope2.jsp页面, page的东西取不到了 -->
	<%-- <jsp:forward page="/Scope2.jsp"></jsp:forward> --%>
	<!-- 超链接,page的东西取不到, request取不到 -->
	<a href="/Web_JSP/Scope2.jsp">Scope2.jsp页面</a>
	<!-- 关闭浏览器直接输入http://localhost:8080/Web_JSP/Scope2.jsp -->
	<!-- page的东西取不到, request取不到，session取不到 -->
	<!-- 重启服务器输入http://localhost:8080/Web_JSP/Scope2.jsp所有都取不到 -->
</body>
</html>