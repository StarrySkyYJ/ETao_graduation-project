<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>hello world</title>
</head>
<body class="header_sticky">
	<%@ include file="menu.jsp"%>

	<section class="flat-row flat-slider">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="slider owl-carousel">
<!-- ======热门商品滚动 ===============================-->
				<s:iterator var="i" value="hlist">
					<div class="slider-item">
						<div class="item-text">
							<div class="header-item">
								<p><s:property value="#i.id"/></p>
								<h2 class="name">
									<s:property value="#i.itemsname"/>
								</h2>
								<p><s:property value="#i.describes"/></p>
							</div>
							<div class="divider65"></div>
							<div class="content-item">
								<div class="price">
									<span class="sale">￥:<s:property value="#i.price"/></span> <span class="btn-shop">
										<a href="${pageContext.request.contextPath }/items_findById.action?id=<s:property value="#i.id"/>" target="_blank">点击查看 <img
											src="images/icons/right-2.png" alt=""></a>
									</span>
									<div class="clearfix"></div>
								</div>
							</div>
						</div>
						<div class="item-image">
							<a
								href="${pageContext.request.contextPath }/items_findById.action?id=<s:property value="#i.id"/>"
								target="_blank"> <img
								src="${pageContext.request.contextPath }/<s:property value="#i.image"/>">
							</a>
						</div>
						<div class="clearfix"></div>
					</div>
					<!-- /.slider -->
					</s:iterator>
<!-- ========热门商品滚动======================================== -->
				</div>
				<!-- /.slider -->
			</div>
			<!-- /.slider -->
		</div>
		<!-- /.col-md-12 -->
	</div>
	<!-- /.row -->
	<!-- /.container --> 
</section>
	<!-- /.flat-slider -->


</body>
</html>