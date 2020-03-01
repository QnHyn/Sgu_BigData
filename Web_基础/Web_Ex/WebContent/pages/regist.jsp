<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<script type="text/javascript" src="../script/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	$(function(){
		//$("#username").focus(function(){	
		//	$("#msgSpan").html("<font color='red'>请输入注册用户名</font>");		
		//});
		//给注册按钮绑定事件
		$("#sub").click(function(){
			var username = $("#username").val();
			var useReg = /^[a-zA-Z0-9_-]{3,16}$/;
			var flag = useReg.test(username)
			if(!flag){
				//不符合规则
				alert("用户名不合法，请输入3-16位的字母数字下划线！")
				return false;
			};
			// 验证密码规则的表达式
			var pwdReg = /^[a-z0-9_-]{6,18}$/;
			var password = $("#password").val();
			// 判断密码是否符合规则
			if(!pwdReg.test(password)){
				//不符合规则
				alert("密码不合法，请输入6-18位的字母数字下划线！")
				return false;
			};
			var rePwd = $("#rePwd").val();
			if(password != rePwd){
				// 两次输入密码不一致
				$("#rePwd").val("");
				$("#password").val("");
				alert("两次输入密码不一致");
				return false;
			};
			var email = $("#email").val();
			var emailReg = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
			if(!emailReg.test(email)){
				//不符合规则
				alert("邮箱格式不正确！")
				return false;
			};
		});
		// 给文本框绑定一个change事件
		$("#username").change(function(){
			//alert("看我好哈");
			var username = $(this).val();
			// 发送Ajax请求
			// 设置请求地址
			var url = "CheckUsernameServlet";
			// 设置请求参数
			var params = "username="+username;
			// 发送Ajax请求
			$.get(url, params, function(res){
				//alert(res);
				$("#msgSpan").html(res);
			}, "text");
		});
	});	
</script>
<base href="http://Localhost:8080/Web_Ex/">
<style type="text/css">
	body {
		background-color:#bbffaa
	}
</style>
</head>
<body>
	<h1>欢迎注册</h1>
	<form action="RegistServlet" method="post">
		<!-- value="abc" -->
		用户账号 : <input type="text" name="username" id="username"><span style="color:red" id="msgSpan"><%=request.getAttribute("msg")==null?"":request.getAttribute("msg") %></span><br>
		用户密码 : <input type="password" name="password" id="password"><br>
		确认密码 : <input type="password" name="rePwd" id="rePwd"><br>
		用户邮箱 : <input type="text" name="email" id="email"><br>
		<input type="submit" value="注册" id="sub"><br>
	</form>
</body>
</html>