<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>四个域对象</title>
</head>
<body>
	<h1>在Scope2.jsp页面中四个域中的属性值</h1>
	page域中的属性值: <%=pageContext.getAttribute("pageKey") %><br>
	request域中的属性值: <%=request.getAttribute("reqKey") %><br>
	session域中的属性值: <%=session.getAttribute("sessionKey") %><br>
	application域中的属性值: <%=application.getAttribute("applicationKey") %><br>
</body>
</html>