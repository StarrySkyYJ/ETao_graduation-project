<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">
	function addCart() {
		document.getElementById("cartForm").submit();
	}
</script>

<title>商品具体信息</title>
</head>
<body>

	<%@ include file="menu.jsp"%>
	<div class="boxed">

		<section class="flat-breadcrumb">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<ul class="breadcrumbs">

						<li class="trail-end"><a href="#" title="">商品详情</a></li>
					</ul>
					<!-- /.breacrumbs -->
				</div>
				<!-- /.col-md-12 -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container --> </section>
		<!-- /.flat-breadcrumb -->

		<section class="flat-product-detail">
		<div class="container">
			<div class="row">
				<div class="col-md-6">
					<div class="flexslider">
						<ul class="slides">
							<li data-thumb="${pageContext.request.contextPath }/<s:property value="model.image"/>"><img
								src="${pageContext.request.contextPath }/<s:property value="model.image"/>" alt="image slider" /> <span>NEW</span>
							</li>
														
						</ul>
						<!-- /.slides -->
					</div>
					<!-- /.flexslider -->
				</div>
				<!-- /.col-md-6 -->
				<div class="col-md-6">
					<div class="product-detail">
						<div class="header-detail">
							<h4 class="name">商品名称：<s:property value="model.itemsname" /></h4>
							<div class="category">发布时间：<s:property value="model.times" /></div>
							<div class="reviewed">
								<div class="review">
									<div class="queue">
										<i class="fa fa-star" aria-hidden="true"></i> <i
											class="fa fa-star" aria-hidden="true"></i> <i
											class="fa fa-star" aria-hidden="true"></i> <i
											class="fa fa-star" aria-hidden="true"></i> <i
											class="fa fa-star" aria-hidden="true"></i>
									</div>
									<div class="text">
										<span>剩余数量:</span> 
										<span class="add-review"><s:property value="model.num" /></span>
									</div>
								</div>
								<!-- /.review -->
								<div class="status-product">
									出售方式: <span><s:property value="model.ioinfo" /></span>
								</div>
							</div>
							<!-- /.reviewed -->
						</div>
						<!-- /.header-detail -->
						<div class="content-detail">
							<div class="price">

								<div class="sale">价格:￥ <s:property value="model.price" /></div>
							</div>
							<div class="info-text">商品描述:<s:property value="model.describes" /></div>
							<div class="product-id">
								商品编号: <span class="id"><s:property value="model.id" /></span>
							</div>
						</div>
						<!-- /.content-detail -->
						<div class="footer-detail">

				<!-- ======== 添加购物车  =========================================================== -->
							<div class="box-cart style2">
								<div class="btn-add-cart">
								<form id="cartForm" action="${pageContext.request.contextPath }/cart_addCart.action" method="post">
									<input type="hidden" name="id" value="<s:property value="model.id" />" />
									<input type="hidden" name="count" value="1" />
									<a title="" onclick="addCart()"><img src="images/icons/add-cart.png"
										alt="">添加到购物车</a>
								</form>
								</div>
								<div class="compare-wishlist">

									<label>&nbsp&nbsp</label>
								</div>
								<!-- <div class="btn-add-cart">
									<a href="#" class="wishlist" title=""><img
										src="images/icons/wishlist.png" alt="">添加到收藏</a>

								</div> -->
								<div class="compare-wishlist"></div>
							</div>
							<!-- /.box-cart -->

						</div>
						<!-- /.footer-detail -->
					</div>
					<!-- /.product-detail -->
				</div>
				<!-- /.col-md-6 -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /.container --> </section>
		<!-- /.flat-product-detail -->



		
		<!-- /.flat-imagebox style4 -->
</body>
</html>