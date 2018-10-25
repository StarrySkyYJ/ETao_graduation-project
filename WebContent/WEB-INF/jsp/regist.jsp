<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册</title>

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/stylesheets/login/style_login.css">
<script type="text/javascript">
	function checkFrom() {
		//校验用户名：
		//获取用户名文本框的值：
		var username = document.getElementById("username").value;
		if (username == null || username == '') {
			alert("用户名不能为空！");
			return false;
		}
	}

	//AJAX校验
	//传统AJAX校验
	function checkUsername() {
		//获取文件框值
		var username = document.getElementById("username").value;

		//1.创建异步交互对象
		var xhr = createXmlHttp();
		//2.设置监听
		xhr.onreadystatechange = function() {
			//配置dao,service, action后
			if (xhr.readyState == 4) {
				if (xhr.status == 200) {
					document.getElementById("span1").innerHTML = xhr.responseText;
				}
			}
		}
		//3.打开连接
		xhr.open("GET",
				"${pageContext.request.contextPath}/user_findByName.action?time="
						+ new Date().getTime() + "&username=" + username, true);
		//4.发送
		xhr.send(null);
	}
	function createXmlHttp() {
		var xmlHttp;
		try { //Firefox , Opera 8.0+ , safari
			xmlHttp = new XMLHttpRequest();
		} catch (e) {
			try {//Internet Explore
				XMLHttp = new ActiveXobject("Msxml2.XMLHTTP");
			} catch (e) {
				try {
					XMLHttp = new ActiveXobject("Microsoft.XMLHTTP");
				} catch (e) {
				}
			}
		}
		return xmlHttp;
	}
</script>

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
			<form action="${pageContext.request.contextPath }/user_regist.action" method="post" onsubmit="return checkFrom();">

				<fieldset>

					<legend>&nbsp&nbsp注&nbsp&nbsp&nbsp&nbsp册</legend>

					<label for="username" class="vhide">Username</label> 
					<span id="span1"></span> 
					<input id="username" name="username" type="text" placeholder="用户名 *" required minlength="2" onblur="checkUsername()"> 
					
					<label for="password" class="vhide">Password</label> 
					<input id="password" name="password" type="text" placeholder="密码 *" required 	minlength="4"> 
					<span><s:fielderror fieldName="password" /></span>
					
					<label for="phonenumber" class="vhide">phonenumber</label> 
					<input id="phonenumber" name="phonenumber" type="text" placeholder="联系方式 *" required 	minlength="11">
					
					<label for="email" class="vhide">email</label> 
					<input id="email" name="email" type="text" placeholder="电子邮箱" required >
					<span><s:fielderror	fieldName="email" /></span>
					
					<label for="studentid" class="vhide">studentid</label> 
					<input id="studentid" name="studentid" type="text" placeholder="学号"  >
					<label for="grade" class="vhide">grade</label> 
					<input id="grade" name="grade" type="text" placeholder="年级" >
					<label for="class" class="vhide">class</label> 
					<input id="class" name="class" type="text" placeholder="班级" >
					<label for="dormitory" class="vhide">dormitory</label> 
					<input id="dormitory" name="dormitory" type="text"  placeholder="宿舍" >
					
					<button class="signin">注&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp册</button>

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