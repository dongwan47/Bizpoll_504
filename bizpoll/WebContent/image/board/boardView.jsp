<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글보기</title>
<style type="text/css">
	#tr_btn_modify {
		display: none;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
	function backTolist(obj) {
		obj.action = "boardlist.bizpoll";
		obj.submit();
	}
	
	function fn_enable(obj) {
		var fileName = "${selBoardView.filename}";
		document.getElementById("i_subject").disabled = false;
		document.getElementById("i_content").disabled = false;
		
		if (fileName !="") {
			document.getElementById("i_fileName").disabled = false;
		}
		
		document.getElementById("tr_btn_modify").style.display = "block";
		document.getElementById("tr_btn").style.display = "none";
	}
	
	function fn_modify_article(obj) {
		obj.action = "boardModify.bizpoll";
		obj.submit();
	}	
	// 숙제
	function fn_remove_article(url,articleNO) {
		
	}
	
	function fn_reply_form(url, articleNO, ref, re_step, re_level) {
		var form = document.createElement("form");
		var parentNoInput = document.createElement("input");
		
		form.setAttribute("method", "post");
		form.setAttribute("action", url);
		
		parentNoInput = document.createElement("input");
		parentNoInput.setAttribute("type", "hidden");
		parentNoInput.setAttribute("name", "articleNo");
		parentNoInput.setAttribute("value", articleNo);
		form.appendChild(parentNoInput);
		
		parentNoInput = document.createElement("input");
		parentNoInput.setAttribute("type", "hidden");
		parentNoInput.setAttribute("name", "ref");
		parentNoInput.setAttribute("value", ref);
		form.appendChild(parentNoInput);
		
		parentNoInput = document.createElement("input");
		parentNoInput.setAttribute("type", "hidden");
		parentNoInput.setAttribute("name", "re_step");
		parentNoInput.setAttribute("value", re_step);
		form.appendChild(parentNoInput);
		
		parentNoInput = document.createElement("input");
		parentNoInput.setAttribute("type", "hidden");
		parentNoInput.setAttribute("name", "re_level");
		parentNoInput.setAttribute("value", re_level);
		form.appendChild(parentNoInput);
	
		document.body.appendChild(form);
		
		form.submit();
	}
	
	function readURL(input) {
		if (input.files && input.files[0]) {
			var rader = new FileReader();
			reader.onload = function(e) {
				$("#preview"src).attr("src", e.target.result);
			}
			reader.readAsDataURL(input.files[0]);
		}
	}
</script>
</head>
<body>
	<form name="frm" method="post" enctype="multipart/form-data">
		<table border="0" align="center">
			<tr>
				<td width="150" align="center" bgcolor="#FF993">글번호</td>
				<td>
					<input type="text" value="${selBoardView.articleNo}" disabled="disabled"/>
					<input type="hidden" name="articleNo" value="${selBoardView.articleNo}"/>
				</td>
			</tr>
			<tr>
				<td width="150" align="center" bgcolor="#FF993">작성자아이디</td>
				<td>
					<input type="text" value=" ${selBoardView.id}" name="id" disabled="disabled"/>
				</td>
			</tr>
			<tr>
				<td width="150" align="center" bgcolor="#FF993">제목</td>
				<td>
					<input type="text" value=" ${selBoardView.subject}" name="subject" id="i_subject" disabled="disabled"/>
				</td>
			</tr>
			<tr>
				<td width="150" align="center" bgcolor="#FF993">내용</td>
				<td>
					<textarea rows="20" cols="60" name="content" id="i_content" disabled="disabled">${selBoardView.content}</textarea>
				</td>
			</tr>
			<c:if test="${not empty selBoardView.fileName && selBoardView.fileName!='null'}">
				<tr>
					<td width="150" align="center" bgcolor="#FF993" rowspan="2">이미지</td>
					<td>
						<input type="hidden" name="originalFileName" value="${selBoardView.fileName}">
						<img alt="image_preview" src="imagePreView.bizpoll?articleNo="${selBoardView.articleNo} & fileName="${selBoardView.fileName}" id="preview" style="width: 100px" height="100px;"><br>
					</td>
				</tr>
				<tr>
					<td>
						<input type="file" name="FileName" id="i_fileName" disabled="disabled" onchange="readURL(this);">
					</td>
				</tr>
			</c:if>
			<tr>
				<td width="150" align="center" bgcolor="#FF993"></td>
				<td>
					<input type="text" value= '<fmt:formatDate value="${selBoardView.reg_date}" pattern="yyyy-MM-dd HH:mm:ss"/>'disabled="disabled">
				</td>
			</tr>
			<tr id="tr_btn_modify">
			<td colspan="2" align="center">
				<input type="button" value="수정반영하기" onclick="fn_modify_article(frm)">
				<input type="button" value="취소" onclick="backTolist(frm)">
			</td>
			<tr id="tr_btn">
				<td colspan="2" align="center">
					<input type="button" value="수정하기" onclick="fn_enable(this.form)">
					<input type="button" value="삭제하기" onclick="fn_remove_article('removeBoard.bizpoll', ${selBoardView.articleNo})">
					<input type="button" value="목록보기" onclick="backTolist(this.form)">
					<input type="button" value="댓글쓰기" onclick="fn_reply_form('boardReplyForm.bizpoll')", ${selBoardView.articleNo}, ${selBoardView.ref}, ${selBoardView.re_step}, ${selBoardView.re_level}">
				</td>
			</tr>
		</table>
	</form>
<%@ include file="../footer.jsp" %>
</body>
</html>

<!--  <form action="" method="post">
	<input type="hidden" name="articleNo" value="${}">
</form>
${selBoardView.articleNo}<br>
${selBoardView.id}<br>
${selBoardView.subject}<br>
${selBoardView.content}-->