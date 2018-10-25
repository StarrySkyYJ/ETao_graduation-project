<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN</title>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/stylesheets/login/style_login.css">



</head>
<body>
	<div class="header-top">
		<div class="container">
			<div class="row">
				<div class="col-md-4">
					<ul class="flat-support">
						<li><a
							href="${pageContext.request.contextPath }/index.action">首页</a></li>
						<s:if test="#session.existUser == null ">
							<!-- actiont跳转注册页面 -->
							<li><a
								href="${pageContext.request.contextPath }/user_loginPage.action">登录</a></li>
							<li><a
								href="${pageContext.request.contextPath }/user_registPage.action">注册</a></li>
						</s:if>
						<s:else>
							<li><a href="#"><s:property
										value="#session.existUser.username" /></a></li>
							<li><a href="#"><s:property
										value="#session.existUser.password" /></a></li>
							<li><a
								href="${pageContext.request.contextPath }/user_quit.action">退出</a></li>
						</s:else>
					</ul>
					<!-- /.flat-support -->
				</div>
				<!-- /.col-md-4 -->
			</div>
		</div>
	</div>
	<div>
		<form action="${pageContext.request.contextPath }/user_login.action">

			<fieldset>

				<legend>&nbsp&nbsp登&nbsp&nbsp&nbsp&nbsp录</legend>

				<label for="username" class="vhide">Username</label> <input
					id="username" name="username" type="text" placeholder="用户名"
					required minlength="2"> <label for="password" class="vhide">Password</label>
				<input id="password" name="password" type="text" placeholder="密码"
					required minlength="4"> <label><s:actionerror /></label>
				<!--  <input type="checkbox" name="remember" id="remember" class="vhide"> -->
				<!-- <label for="remember">
      <i class="octicon octicon-check"></i> Remember all the things
    </label> -->

				<button class="signin">登&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp录</button>

			</fieldset>

		</form>
	</div>
	<script
		src='${pageContext.request.contextPath }/stylesheets/login/jquery.min.js'></script>
	<script
		src='${pageContext.request.contextPath }/stylesheets/login/jquery.validate.min.js'></script>

	<script
		src="${pageContext.request.contextPath }/stylesheets/login/index.js"></script>

</body>
</html>