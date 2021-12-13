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
<script>
	function check_submit() {
		if (document.frm.name.value == "") {
			alert("코드명을 입력해 주세요.");
			document.frm.name.focus();
			return;
		}
		document.frm.submit();
		
	}
</script>
</head>
<body>
	<form name="frm" method="post" action="codeWriteSave.do">
		<table>
			<tr>
				<th>분류</th>
				<td align="left">
					<select name="gid">
						<option value="1">Job(업무)</option>
						<option value="2">Hobby(취미)</option>
					</select>
				</td>
			</tr>
			<tr>
				<th>코드명</th>
				<td align="left"><input type="text" name="name"></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="button" onclick="check_submit()">저장</button>
					<button type="reset">취소</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>