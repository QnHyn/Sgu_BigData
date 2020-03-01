<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<script type="text/javascript" src="../script/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	/*  
		text( )方法:用来获取或设置成对出现的标签中的文本值
		对象.text():获取文本值
		对象.text("new value"): 设置文本值
		html()方法与text()方法唯一的区别是html()方法可以解析html标签
	*/
	//给文本框绑定focus事件
	$(function(){
		$("#username").focus(function(){
			//将显示文本span标签内容置空
			//$("#msgSpan").text("")		
			$("#msgSpan").html("<font color='green'>我要变绿</font>");		
		});
		//给登录按钮获取绑定时间
		$("#sub").click(function(){
			/*
				val()方法:获取或设置input标签中的value属性值
				对象.val( )获取value属性值
				对象.val("new value"): 设置value属性值
			*/
			//获取用户输入的用户名
			var username = $("#username").val();
			var password = $("#password").val();
			//alert(username);
			//alert(password);
			//判断用户名是否为空
			if(username == "" || password == ""){
				alert("用户名或密码不能为空!");
				// 取消默认行为
				return false;
			};
		});
	});	
</script>
<base href="http://Localhost:8080/Web_Ex/">
<style type="text/css">
	body {
		background-color:pink
	}
</style>
</head>
<body>
	<h1>登录页面</h1>
	<form action="LoginServlet" method="post">
		<!-- value="abc" -->
		用户账号: <input type="text" name="username" id="username"><span style="color:red" id="msgSpan"><%=request.getAttribute("msg")==null?"":request.getAttribute("msg") %></span><br>
		用户密码: <input type="password" name="password" id="password"><br>
		<input type="submit" value="登录" id="sub"><br>
	</form>
</body>
</html>