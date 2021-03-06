
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>


<!-- BAR -->
<div class="bar-wrap">
	<div class="container">
		<div class="row">
			<div class="span12">
				<div class="title-bar">
					<h1>ADMIN</h1>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- BAR -->

<br/>

<div class="container">
	<c:if test="${not empty noproduct}">
		<div class="alert alert-success">
			<spring:message code="NoProductstobeApproved" />
			<br />
		</div>
	</c:if>
</div>

<!-- PRODUCT-OFFER -->
<div class="product_wrap">
	<div class="container">
		<div class="row heading-wrap">
			<div class="span12 heading">
				<h2>
					Products <span></span>
				</h2>
			</div>
		</div>
		<div class="row">
			<c:forEach items="${products}" var="product">
				<div class="span3 product">

					<div>
						<figure>
							<a
								href="<spring:url value="/product?id=${product.productId}" />">
								<img src="<c:url value="${product.productPath}"></c:url>" alt="">
							</a>

						</figure>
						<div class="detail">
							<span>$244.00</span> <a
								href="<spring:url value="/product?id=${product.productId}" />">
								<h4>${product.productName}</h4>
							</a>
							<div class="buttons">
								<a
									href="<spring:url value="/approveProducts?id=${product.productId}" />"
									class="wish big-button">Approve</a> <a
									href="<spring:url value="/disapproveProduct?id=${product.productId}" />"
									class="compare big-button">Disapprove</a>
							</div>

						</div>
					</div>

				</div>

			</c:forEach>
		</div>
	</div>
</div>
<!-- PRODUCT-OFFER -->