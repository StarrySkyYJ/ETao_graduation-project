<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cart</title>

<!-- Basic Page Needs -->
	<meta charset="UTF-8">
	<!--[if IE]><meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'><![endif]-->
	<title>Shop Cart</title>

	<!-- Mobile Specific Metas -->
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

	<!-- Boostrap style -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/stylesheets/bootstrap.min.css">

	<!-- Theme style -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/stylesheets/style.css">

	<!-- Reponsive -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/stylesheets/responsive.css">
</head>
<body class="header_sticky">
	<%@ include file="menu.jsp"%>
	
	<s:if test="#session.cart.cartItems.size() != 0">
	<section class="flat-breadcrumb">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<ul class="breadcrumbs">
							
							<li class="trail-end">
								<a href="#" title="">购物车</a>
							</li>
						</ul><!-- /.breacrumbs -->
					</div><!-- /.col-md-12 -->
				</div><!-- /.row -->
			</div><!-- /.container -->
		</section><!-- /.flat-breadcrumb -->
		
	
		<section class="flat-shop-cart">
			<div class="container">
				<div class="row">
					<div class="col-lg-8">
						<div class="flat-row-title style1">
							
						</div>
						<div class="table-cart">
							<table>
								<thead>
									<tr>
										<th>商品</th>
										<th>数量</th>
										<th>小计</th>
										<th></th>
									</tr>
								</thead>
								<tbody>
					<!-- =========购物项=============================================== -->
								<s:iterator var="cartItems" value="#session.cart.cartItems">
									<tr>
										<td>
											<div class="img-product">
												<img src="${pageContext.request.contextPath }/<s:property value="#cartItems.items.image" />" alt="">
											</div>
											<div class="name-product">
												<s:property value="#cartItems.items.itemsname" /> <br />编号：<s:property value="#cartItems.items.id" />
											</div>
											<div class="price">
												￥:<s:property value="#cartItems.items.price" />
											</div>
											<div class="clearfix"></div>
										</td>
										<td>
											<div class="quanlity">
												<h4>&nbsp <s:property value="#cartItems.count" /></h4>
											</div>
										</td>
										<td>
											<div class="total">
												<s:property value="#cartItems.subtotal" />
											</div>
										</td>
										<td>
											<a href="#" title="">
												<img src="images/icons/delete.png" alt="">
											</a>
										</td>
									</tr>
								</s:iterator>
								</tbody>
							</table>
							
						</div><!-- /.table-cart -->
					</div><!-- /.col-lg-8 -->
					<div class="col-lg-4">
						<div class="cart-totals">
							<h3>购物车总计</h3>
							<form action="#" method="get" accept-charset="utf-8">
								<table>
									<tbody>
										<tr>
											
										</tr>
										<tr>
											
										</tr>
										<tr>
											<td>总金额：</td>
											<td class="price-total"><s:property value="#session.cart.total" /></td>
										</tr>
									</tbody>
								</table>
								<div class="btn-cart-totals">
									<a href="#" class="update" title="">留言</a>
									<a href="${pageContext.request.contextPath }/cart_clearCart.action" class="checkout" title="">清空购物车</a>
								</div><!-- /.btn-cart-totals -->
							</form><!-- /form -->
						</div><!-- /.cart-totals -->
					</div><!-- /.col-lg-4 -->
				</div><!-- /.row -->
			</div><!-- /.container -->
		</section><!-- /.flat-shop-cart -->
	</s:if>
	<s:else>
		<section class="flat-breadcrumb">
			<div class="container">
				<div class="row">
					<div class="col-md-12">
						<ul class="breadcrumbs">
							
							<li class="trail-end">
								<a href="#" title="">购物车</a>
							</li>
						</ul><!-- /.breacrumbs -->
					</div><!-- /.col-md-12 -->
				</div><!-- /.row -->
			</div><!-- /.container -->
		</section><!-- /.flat-breadcrumb -->
		
		<div align="center">
			<h3 ></h3>
		</div>
		
		<div align="center" >
			<h3 >购物车为空！</h3>
		</div>
	</s:else>
	
	<!-- Javascript -->
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/tether.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/bootstrap.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/waypoints.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery.circlechart.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/easing.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery.flexslider-min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/owl.carousel.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/smoothscroll.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery-ui.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery.mCustomScrollbar.js"></script>
		<script type="text/javascript" src="http://ditu.google.cn/maps/api/js?key=AIzaSyBtRmXKclfDp20TvfQnpgXSDPjut14x5wk&region=GB"></script>
	   	<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/gmap3.min.js"></script>
	   	<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/waves.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/jquery.countdown.js"></script>

		<script type="text/javascript" src="${pageContext.request.contextPath }/javascript/main.js"></script>
</body>
</html>