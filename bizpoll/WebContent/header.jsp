<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bizpoll Shop</title>
<link href = "css/shopping.css" rel="stylesheet">
<script type="text/javascript" src="js/member.js"></script>
<!-- <script type="text/javascript" src="js/mypage.js"></script> -->
</head>
<body>
	<div id="wrap">
		<header>
			<div id="Logo">
				<a href="index.bizpoll">
					<img alt="Logo" src="image/product_img/w-05.jpg" width="100" height="80">
				</a>
			</div>
			<nav id="catagory_menu">
				<ul>
					<c:choose>
						<c:when test="${empty sessionScope.loginUser}">
							<li><a href="login_form.bizpoll">LOGIN</a></li>
							<li>|</li>
							<li><a href="contract.bizpoll">JOIN</a></li>
						</c:when>
						<c:otherwise>
							<li style="color: orange">
								${sessionScope.loginUser.name }(${sessionScope.loginUser.name });
							</li>
							<li><a href="loout.bizpoll">LOGOUT</a></li>
						</c:otherwise>
					</c:choose>
					<li><a>LOGOUT</a></li>
					<li>|</li>
					<li><a>CART</a></li>
					<li>|</li>
					<li><a>MY PAGE</a></li>
					<li>|</li>
					<li><a>Q&amp;A(1:1)</a></li>
					<li>|</li>
					<li><a>APP</a></li>
					<li>|</li>
					<li><a href="boardList.bizpoll">Board</a></li>
				</ul>
			</nav>
		</header>
	</div>
</body>
</html>