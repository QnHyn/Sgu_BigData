<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/script/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	$(function(){
		// 给按钮绑定单击事件
		$("#btnId").click(function(){
			//通过$.Ajax()方法发送Ajax请求
			//alert("绑定成功");
			/*
				url是必需的, 用来设置请求地址。默认发送的是get请求
				type: 可选的 一般为post或get 默认为get请求
				data: 可选的, 用来设置请求参数
				success: 可选的, 用来设置回调函数, 响应成功之后系统会自动调用该函数,响应数据会以参数形式传到该函数中。
				dataType: 可选的, 用来设置响应数据的类型，默认是text,也可以是xml,json。
			*/
			$.ajax({
				url:"${pageContext.request.contextPath}/AjaxServlet",
				type: "get",
				data:"username=admin&password=123456",
				success: function(res){
					//alert(res);
					$("#span").text(res)
				},
				dataType: "text",
			});
		});
	});
	/* $(function(){
		// 给按钮绑定单击事件
		$("#btnId1").click(function(){
			var url ="${pageContext.request.contextPath}/AjaxServlet";
			var params = "username=admin&password=123456"
			$.get(url,params,function(res){
				alert(res);
			}, "text");
		});
	}); */
	$(function(){
		// 给按钮绑定单击事件
		$("#btnId1").click(function(){
			var url ="${pageContext.request.contextPath}/AjaxServlet";
			var params = "username=admin&password=123456"
			$.post(url,params,function(res){
				alert(res);
			}, "text");
		});
	});
</script>
</head>
<body>
<h1><%=new Date() %></h1>
<button id="btnId">通过$.Ajax()方法发送Ajax</button><span style="color:red" id="span"></span><br>
<button id="btnId1">通过$.get/post()方法发送Ajax</button><span style="color:red" id="span1"></span>
</body>
</html>