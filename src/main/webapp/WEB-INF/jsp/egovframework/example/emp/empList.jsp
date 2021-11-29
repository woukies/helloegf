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
		<caption>직원목록</caption>
		<tr>
			<th>직원번호</th>
			<th>직원이름</th>
			<th>부서벊 </th>
		</tr>
		<!-- resultList: 참조값 -->
		<c:forEach items="${ resultList }" var="result">
			<tr>
				<td>${ result.empno }</td>
				<td>${ result.ename }</td>
				<td>${ result.deptno }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>