<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		JSTL全称：JSP Standard Tag Library，JSP的标准标签库
	 -->
	 <!-- if标签：相当于Java中if条件判断 
	 	test属性：用来接收一个布尔类型的值，通常通过EL表达式获取该值，当值是true时才执行标签题中的内容
	 -->
	 <%
	 	int age = 86;
	 	pageContext.setAttribute("age", age);
	 %>
	 <c:if test="${age < 18 }">
	 	禁止未成年人入内！
	 </c:if>
	  <c:if test="${age > 18 }">
	 	请尽情浏览，注意身体！！！
	 </c:if>
	 <%
	 	List<String> list = new ArrayList();
 	 	list.add("吉沢明步");
 	 	list.add("蓝泽润");
	 	list.add("京香JULIA");
 	 	list.add("潘金莲");
 	 	list.add("文章");
 	 	list.add("白百何");
	 	list.add("李小璐");
	 	list.add("林丹");
 	 	list.add("吴秀波");
	 	//将list放到page域中
	 	pageContext.setAttribute("stars", list);
	 %>
	 <hr>
	 <!-- forEach标签：相当于Java中的for循环
	 	items属性：接收一个要遍历的集合
	 	var属性：设置一个遍历接收遍历到的值，同时会以变量值为key将遍历到的值放到page域中
	  -->
	  <c:forEach items="${stars}" var="star">
	  	<a href="#">${star}</a><br>
	  </c:forEach>
	  <!-- 
	  	empty运算符：主要用来判断一个字符串或一个集合是否为空
	   -->
	   <c:if test="${empty pageScope.stars }">
	   		世界很美好，没有人乱搞！！！
	   </c:if>
	   <c:if test="${!empty pageScope.stars }">
	   		世界很风骚，明星都耐不住寂寞！！！！
	   </c:if>
	   <c:if test="${not empty pageScope.stars }">
	   		世界很风骚，明星都耐不住寂寞！！！！
	   </c:if>
	 
</body>
</html>