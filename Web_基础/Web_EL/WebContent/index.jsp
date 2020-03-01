<%@page import="com.hynqn.bean.Department"%>
<%@page import="com.hynqn.bean.Employee"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
		EL全称：Expression Language(表达式语言)
		作用: 主要用来输出域对象的属性值。
		EL表达式查询的规则: 
		先从page域中开始查找，找到后直接返回，不再向其他域中查找，如果找不到再去request域中查找，以此类推。. .
		如果在application域中仍找不到则返回空串
		E1给我们提供了四个Scope对象，用来精确获取指定域中的属性值
	 -->
	 <% 
	 	Date date = new Date();
	 	// 把date放在page域中，供EL输出
	 	pageContext.setAttribute("time", date+"-");
	 	request.setAttribute("time", date+"--");
	 	session.setAttribute("time", date+"---");
	 	application.setAttribute("time", date+"----");
	 	// 创建Employee对象
	 	Employee employee = new Employee(1,"吴秀波",new Department(1001,"出轨风波")); 
	 	//将employe对象放到page域中
	 	pageContext.setAttribute("star", employee);
	 %>
	   通过JSP表达式输出当前的时间: <%=date %><br>
	   通过EL表达式输出当前的时间: ${time}<br>
	   通过EL表达式输出request域中当前的时间: ${requestScope.time}<br>
	 <!-- pageScope.star.lastName 实际上调用getlastName方法 -->
	  通过EL表达式获取Employee对象的lastName: ${pageScope.star.lastName}<br>
	  通过EL表达式获取Employee对象的dept的name值: ${pageScope.star.dept.name}<br>
	 <!-- 只要定义了get方法， 获取值时注意get去掉首字母小写-->
	  通过EL表达式获取自定义函数getOutName的返回值: ${pageScope.star.outName}<br>
	  <!--pageContext比较特殊,它可以获取其他八个隐藏对象-->
	  通过JSP表达式获取项目的虚拟路径:<%=request.getContextPath() %><br>
	  通过EL表达式获取项目的虚拟路径:${pageContext.request.contextPath}
</body>
</html>