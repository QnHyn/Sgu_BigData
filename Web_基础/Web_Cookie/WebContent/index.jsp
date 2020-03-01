<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		Cookie的运行原理：
			1.第一次向服务器发送请求时在服务器端创建一个Cookie对象
			2.将Coolie对象发送给浏览器
			3.以后浏览器再发请求就会携带着该Cookie对象
			4.服务器根据不同的Cookie对象来区分不同的用户
	 -->
	 <a href="${pageContext.request.contextPath }/CreateCookie">创建Cookie对象</a><br>
	 <a href="${pageContext.request.contextPath }/GetCookie">获取Cookie对象</a><br>
	 <a href="${pageContext.request.contextPath }/PersistCookies">持久化Cookie对象</a><br>
</body>
</html>