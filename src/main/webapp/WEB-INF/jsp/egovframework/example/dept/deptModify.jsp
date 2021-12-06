<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<form method="post" action="deptModifySave.do">
		<table>
			<tr>
				<th>부서번호</th>
				<td><input type="text" name="deptno" value="${ deptVO.deptno }" readonly></td>
			</tr>
			<tr>
				<th>부서이름</th>
				<td><input type="text" name="dname" value="${ deptVO.dname }"></td>
			</tr>
			<tr>
				<th>부서위치</th>
				<td><input type="text" name="loc" value="${ deptVO.loc }"></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit">수정</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>