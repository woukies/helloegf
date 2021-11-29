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
	<form method="post" action="empWriteSave.do">
		<table>
			<tr>
				<th>사원번호</th>
				<td><input type="text" name="empno"></td>
			</tr>
			<tr>
				<th>사원이름</th>
				<td><input type="text" name="ename"></td>
			</tr>
			<tr>
				<th>부서번호</th>
				<td><input type="text" name="deptno"></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="submit">저장</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>