<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<article>
	<h1>로그인</h1>
	<form action="login.bizpoll" method="post"></form>
		<fieldset>
			<legend></legend>
			<label>User ID</label>
			<input name="id" type="text">
			<label>Password</label>
			<input name="pwd" type="password">
		</fieldset>
		<div id="buttons">
			<input type="submit" value="로그인" class="submit">
			<input type="button" value="회원가입" class="cancel"onclick="location='contract.bizpoll'">
			<input type="button" value="아이디 비밀번호 찾기" class="submit" onclick="location='find_id_form.bizpoll'">
		</div>
</article>
</body>
</html>
<%@ include file="../footer.jsp"%>