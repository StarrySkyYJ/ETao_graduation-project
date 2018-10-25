<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- Boostrap style -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/stylesheets/bootstrap.min.css">

<!-- Theme style -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/stylesheets/style.css">

<!-- Reponsive -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/stylesheets/responsive.css">

<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/tether.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/waypoints.min.js"></script>
		<!-- <script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery.circlechart.js"></script> -->
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/easing.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery.flexslider-min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/owl.carousel.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/smoothscroll.js"></script>
		<!-- <script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery-ui.js"></script> -->
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery.mCustomScrollbar.js"></script>
		<script type="text/javascript" src="http://ditu.google.cn/maps/api/js?key=AIzaSyBtRmXKclfDp20TvfQnpgXSDPjut14x5wk&region=GB"></script>
	   	<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/gmap3.min.js"></script>
	   	<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/waves.min.js"></script> 
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery.countdown.js"></script>

		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/main.js"></script>


<div class="boxed">
	<section id="header" class="header">
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
				<!-- /.row -->
			</div>
			<!-- /.container -->
		</div>
		<!-- /.header-top -->
		<div class="header-middle">
			<div class="container">
				<div class="row">
					<div class="col-md-3">
						<div id="logo" class="logo">
							<a href="${pageContext.request.contextPath }/index.action"> <img
								src="${pageContext.request.contextPath }/images/logos/logo.png"
								>
							</a>
						</div>
						<!-- /#首页logo========================================== -->
					</div>
					<!-- /.col-md-3 -->
					<div class="col-md-6">
						<div class="top-search">
							<form action="${pageContext.request.contextPath }/search_menuSearch.action" method="post" class="form-search"
								accept-charset="utf-8">

								<div class="box-search">
									<input type="text" name="search" placeholder="搜索"> <span
										class="btn-search">
										<button type="submit" class="waves-effect">
											<img
												src="${pageContext.request.contextPath }/images/icons/search.png"
												alt="">
										</button>
									</span>

								</div>
								<!-- /.box-search -->
							</form>
							<!-- /.form-search -->
						</div>
						<!-- /.top-search -->
					</div>
					<!-- /.col-md-6 -->
					<div class="col-md-3">
						<div class="box-cart">
							
							<!-- /.inner-box -->
							<div class="inner-box">
								<a href="${pageContext.request.contextPath }/setting_allSetting.action" title="">
									<div class="icon-cart">
										<img
											src="${pageContext.request.contextPath }/images/icons/set_my_cart.png"
											> <span>我</span>
									</div>
									<div class="price">我的</div>
								</a>
								
							</div>
							<!-- /.inner-box -->
						</div>
						<!-- /.box-cart -->
					</div>
					<!-- /.col-md-3 -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.container -->
		</div>
		<!-- /.header-middle -->

		<!--====== 导航栏 ， 物品y======================================================================  -->
		<div class="header-bottom">
			<div class="container">
				<div class="row">
					<div class="col-md-3 col-2">
						<div id="mega-menu">
							<div class="btn-mega">
								<span></span>物品种类
							</div>
							<ul class="menu">
		<!-- ======= 一级分类 ============================================================= -->
								<s:iterator var="c" value="#session.cList">
									<li><a href="#" title="" class="dropdown"> <span
											class="menu-img"> <img src="images/icons/menu/02.png"
												alt="">
									<!--======= 一级分类值=============================================  -->
										</span> <span class="menu-title"> <s:property value="#c.id" />:<s:property
											value="#c.categories" /> </span>
									</a>
										<div class="drop-menu">
											<div class="one-third">
											<!--======= 二级分类值========================= -->
												<ul>
													<li><a href="#" title=""> <s:property value="#c.id" /></a></li>
												</ul>
												<div class="show">
													<a href="#" title=""><s:property
													value="#c.categories" /></a>
											<s:iterator var="cs" value="#c.categoriesInfo" >
												<ul>
													<li><a href="#" title=""><s:property value="#cs.cid" /></a></li>
												</ul>
												<div class="show">
													<a href="#" title=""><s:property
													value="#cs.cname" /></a>
												</div>
											</s:iterator>
											</div>											
										</div></li>
								</s:iterator>
		<!-- ======= 一级分类 ============================================================= -->
							</ul>
						</div>
					</div>
					<!-- /.col-md-3 -->
					<div class="col-md-9 col-10">
						<div class="today-deal">
							<a href="#" title="">出售商品</a>
						</div>
					</div>
					<!-- /.col-md-9 -->
				</div>
				<!-- /.row -->
			</div>
			<!-- /.container -->
		</div>
		<!-- /.header-bottom -->
	</section>
	<!-- /#header -->
	
	
</div>