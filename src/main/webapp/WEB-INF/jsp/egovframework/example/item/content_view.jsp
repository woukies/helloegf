<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="500" border="1" border-spacing="0">
		<tr>
			<th>이름</th>
			<th>가격</th>
			<th>설명</th>
		</tr>
		<c:forEach items="${resultList}" var="vo">
		<tr>
			<td>${vo.name}</td>
			<td>${vo.price}</td>
			<td>${vo.description}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>