<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn"     uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt"    uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		width: 600px;
		border-collapse: collapse;
	}
	
	th, td {
		border: 1px solid #ccc;
		padding: 5px;
		text-align: center;
	}
	
	.menu {
		width: 600px;
		margin-top: 5px;
		text-align: right;
	}
</style>
<script type="text/javascript">
	function checkDelete(code) {
		if(confirm("정말 삭제하시겠습니까?")) {
			location.href="codeDelete.do?code=" + code;
		}
	}
</script>
</head>
<body>
	<table>
		<caption>게시글 목록</caption>
		<colgroup>
			<col width="10%">
			<col width="30%">
			<col width="20%">
			<col width="30%">
			<col width="10%">
		</colgroup>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>등록일</th>
			<th>조회수</th>
		</tr>
		<c:forEach items="${ boards }" var="board">
			<tr>
				<td>${ board.unq }</td>
				<td>${ board.title }</td>
				<td>${ board.name }</td>
				<td><fmt:formatDate value="${ board.rdate }" pattern="yyyy-MM-dd"/></td>
				<td>${ board.hits }</td>
			</tr>
		</c:forEach>
	</table>
	<div class="menu">
		<button onclick="location.href='boardWrite.do'">글쓰기</button>
	</div>
</body>
</html>