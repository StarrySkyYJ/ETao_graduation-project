<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	<%@taglib uri="/struts-tags" prefix="s" %>
 <link rel="stylesheet" href="${pageContext.request.contextPath }/stylesheets/style_etao_setting.css">

<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/stylesheets/login/style.css">
	
<div class="header-top">
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<ul class="flat-support">
					<li><a href="${pageContext.request.contextPath }/index.action">首页</a></li>
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

<div class="wrapper">
	<ul id="folding-menu">
		<li><a href="${pageContext.request.contextPath }/cart_myCart.action">购物车</a></li>
		<li><a href="${pageContext.request.contextPath }/setting_userInfo.action">我的信息</a></li>
		<li><a href="${pageContext.request.contextPath }/setting_userMassage.action">留言信息</a></li>
		
		<li><a href="javascript:void(0);">反馈</a></li>
		<li><a href="javascript:void(0);">...</a></li>
	</ul>

</div>

	<h1>厚德</h1>
	<h1>尚能</h1>
	<h1>博学</h1>
	<h1>笃行</h1>

