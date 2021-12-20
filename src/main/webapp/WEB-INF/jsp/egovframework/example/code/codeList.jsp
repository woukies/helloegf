<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn"     uri="http://java.sun.com/jsp/jstl/functions" %>

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
	<!-- Total: ${ resultList.size() } 개  -->
	<div>Total: ${ resultCount } 개</div>
	
	<table>
		<caption>코드목록</caption>
		<tr>
			<th>번호</th>
			<th>그룹명</th>
			<th>코드명</th>
			<th>구분</th>
		</tr>
		<!-- resultList: 참조값 -->
		<c:set var="num" value="1"></c:set>
		<c:forEach items="${ resultList }" var="result">
			<tr>
				<!-- <td>${ result.code }</td> -->
				<td><c:out value="${ num }"></c:out> </td>
				<c:set var="num" value="${ num + 1 }"></c:set>
				<td>${ result.gid }</td>
				<td>${ result.name }</td>
				<td>
					<button onclick="location.href='codeModify.do?code=${ result.code }'">수정</button>&nbsp;
					<button onclick="checkDelete('${ result.code }')">삭제</button>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>