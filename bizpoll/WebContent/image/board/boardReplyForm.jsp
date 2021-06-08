<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	function backToList(obj) {
		obj.action = "boardList.bizpoll";
		obj.submit();
	}
	
	function readURL(input) {
		if (input.files && input.files[0]) {
			var reader = new FileReader();
			raeder.onload = function(e) {
				$("#preview").attr("src", e.target.result);
			}
		
			reader.readAsDataURL(input.files[0]);
		}
	}
</script>
</head>
<body>
	<h1 style="text-align: center;">댓글쓰기</h1>
	<form action="boardReply.bizpoll" name="frm" method="post" enctype="multipart/form-data">
		<input type="hidden" name="articleNo" value="${replyInfo, articleNo }">
		<input type="hidden" name="articleNo" value="${replyInfo, ref }">
		<input type="hidden" name="articleNo" value="${replyInfo, re_step }">
		<input type="hidden" name="articleNo" value="${replyInfo, re_level }">
		<input type="hidden" name="articleNo" value="${sessionScope, loginUser }">
		
		<table align="center">
			<tr>
				<td align="right">글쓴이 &nbsp;</td>
				<td><input type="text" size="5" value="${sessionScope, loginUser}" name="subject"></td>
			</tr>
			<tr>
				<td align="right">글제목 &nbsp;</td>
				<td><input type="text" size="67" maxlength="100" name="subject"></td>
			</tr>
			<tr>
				<td align="right">글내용 &nbsp;</td>
				<td><textarea name="content" rows="10" maxlength="100" name="subject"></td>
			</tr>
			<tr>
				<td align="right">이미지파일 첨부 : </td>
				<td><input type="file" name="fileName" onclick="readURL"></td>
				<td><img alt="attach" src="#" width="200" height="200"></td>
			</tr>
			<tr>
				<td align="right"></td>
				<td>
					<input type="submit" value="댓글반영하기">
					<input type="button" value="취소" onclick="backToList(this.form);">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>