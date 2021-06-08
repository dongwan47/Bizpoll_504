<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
<style type="text/css">
	.cls1 {
		text-decoration: none;
		color: black;
	}
	.cls2 {
		text-align: center;
		font-size: 30px;
	}
</style>
</head>
<body>
	<h1 class="cls2">게시판</h1>
	<table align="center" border="1" style="border-collapse;">
		<thead>
			<tr height="10" align="center" bgcolor="lightgray;">
				<th>번호</th>
				<th>성적</th>
				<th>제목</th>
				<th>날짜</th>
				<th>조회수</th>
			</tr>
		<tbody>
			<c:choose>
				<c:when test="${empty boardinfo.selboardList}">
					<tr height="10">
						<th colspan="5">
							<p >
							 <b><span style="font-size:20px ">등록된글</span></b>
							</p>
						</th>
					</tr>
				</c:when>
				<c:when test="${empty boardList}">
					<c:forEach items="${empty boardList }" var="boardListDTO" va>
						<tr>
							<td width="5%">${status.count}</td>
							<td width="20%">${boardListDTO.id}</td>
							<td width="45%" style="text-align: left;">
								<span style="padding-left: 10px;"></span>
								<c:choose>
									<c:when test="${boardListDTO.re_level > 1 }">
										<c:forEach begin="2" end="${boardListDTO.re_level }" step="1">
											<span style="padding-left: 20px;"></span>
										</c:forEach>
										<span style="font-size: 12px;">[답변]</span>
										<a class="cls1" href="boardView.bizpoll?articleNo=${boardListDTO.articleNo }">${boardListDTO.subject }</a>
									</c:when>
									<c:otherwise>
										<a class="cls1" href="boardView.bizpoll?articleNo=${boardListDTO.articleNo }">${boardListDTO.subject }"></a>
									</c:otherwise>
								</c:choose>
							</td>
							<td width="20%"><fmt:formatDate value="${boardListDTO.reg_date }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
							<td width="10%"><boardListDTO></td>
							<td></td>
						</tr>
					</c:forEach>
				</c:when>
			</c:choose>
		</tbody>
		</thead>
		<tfoot>
			<tr>
				<td colspan="5" align="center">
					<div class="cls2">
						<c:if test="${!empty boardinfo.boardListAllCnt }"></c:if>
						<c:choose>
							<c:when test="${boardlistAllCnt > 100 }">
								<c:forEach var="page" begin="1" end="10" step="1">
									<c:if test="${section > 1 && page == 1 }">
										<a class="no-uline" href="boardlist.bozpoll?section=${section-1 }&pageNum=${(section - 1)*10 +1}">&nbsp;pre</a>
									</c:if>
									<a class="no-Uline" href="boardlist.bozpoll?section=${boardinfo.section }&pageNum=${page}">${(boardinfo.section-1)*10 + page}</a>
									<c:if test="${page == 10 }"></c:if>
								</c:forEach>
							</c:when>
							<c:when test="${boardListAllCnt == 100 }">
								<c:forEach var="page" begin="1" end="10" step="1">
									<a class="no-uline" href="#">
								</c:forEach>
							</c:when>
							<c:when test="${boardListAllCnt == 100 }">
								<c:forEach var="page" begin="1" end="${boardinfo.boardListAllCnt == 100 }">
									<c:choose>
										<c:when test="${page == boardinfo.pageNum }">
											<a class="sel-page" href="boardlist.bozpoll?">${page }</a>
										</c:when>
										<c:otherwise>
											<a class="no-uline" href="boardlist.bozpoll?section=${section }"></a>
										</c:otherwise>
									</c:choose>
								</c:forEach>
							</c:when>
						</c:choose>
					</div>
				</td>
			</tr>
			<tr>
				<td colspan="5" align="center">
					<form action="boardlist.bizpoll" method="get">
						<select name="searchType" id="searchType">
							<option value="t" <c:out val="${boardInfo.searchType == 't' ? 'selected' : '' }"/>>제목</option>
							<option value="c" <c:out val="${boardInfo.searchType == 'c' ? 'selected' : '' }"/>>내용</option>
							<option value="w" <c:out val="${boardInfo.searchType == 'w' ? 'selected' : '' }"/>>글쓴이</option>
							<option value="tc" <c:out val="${boardInfo.searchType == 'tc' ? 'selected' : '' }"/>>제목+내용</option>
						</select>
						<input type="text" name="searchKeyword" id="searchKeyword" value="${boardInfo.searchKeyword }">
						<input type="submit" value="검색">
					</form>
				</td>
			</tr>
		</tfoot>	
	</table>
	
	<a class="cls1" href="#">
		<p class="cls2">글쓰기</p>
	</a>
<%@ include file="../footer.jsp" %>
</body>
</html>