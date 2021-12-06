<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="ui"     uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		width: 400px;
		border-collapse: collapse;
	}
	
	th, td {
		border: 1px solid #ccc;
		padding: 5px;
		text-align: center;
	}
</style>
</head>
<body>
	<table>
		<tr>
			<th>부서번호</th>
			<td>${ deptVO.deptno }</td>
		</tr>
		<tr>
			<th>부서이름</th>
			<td>${ deptVO.dname }</td>
		</tr>
		<tr>
			<th>부서위치</th>
			<td>${ deptVO.loc }</td>
		</tr>
		<tr>
			<td colspan="2">
				<button type="button">수정</button>
				<button type="button">삭제</button>
			</td>
		</tr>
	</table>
</body>
</html>