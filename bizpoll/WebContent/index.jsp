<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Bizpoll Shop</title>
</head>
<body>
<%@ include file="../header.jsp" %>
<div id="main_img">
	<img alt="main_img" src="image/product_img/w-28.jpg">
</div>
<div id="front">
	<h2>New Item</h2>
	<div id="bestProduct">
		<c:forEach items="${newProductList}" var="newProductDto">
		<div id="item">
			<a href="product_detail.bizpoll?p_code=${newProductDto.p_code}">
				<img alt="" src="image/product_img/${newProductDto.p_img}">
				<h3>${newProductDto.p_name}</h3>
				<p><fmt:formatNumber value="${bestProductDto.p_price2}" type="currency"/> </p>
			</a>
		</div>
		</c:forEach>
	</div>
</div>

<%@ include file="../footer.jsp" %>
</body>
</html>