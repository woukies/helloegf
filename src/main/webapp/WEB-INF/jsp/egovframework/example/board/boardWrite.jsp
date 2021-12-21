<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
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
	}
</style>
<script type="text/javascript" src="<c:url value='/js/jquery-1.12.4.js'/>"></script>
<script type="text/javascript" src="<c:url value='/js/jquery-ui.min.js'/>"></script>
<script type="text/javascript">
	function checkSubmit() {
		/*
		if (document.frm.title.value == "") {
			alert("제목을 입력해 주세요!");
			document.frm.title.focus();
			return false;
		}
		if (document.frm.pass.value == "") {
			alert("암호를 입력해 주세요!");
			document.frm.pass.focus();
			return false;
		}
		if (document.frm.name.value == "") {
			alert("글쓴이를 입력해 주세요!");
			document.frm.name.focus();
			return false;
		}
		if (document.frm.content.value == "") {
			alert("내용을 입력해 주세요!");
			document.frm.content.focus();
			return false;
		}
		
		document.frm.submit();
		*/
		
		
		if ($.trim($("#title").val()) == "") {
			alert("제목을 입력해 주세요!");
			$("#title").focus();
			return false;
		}
		if ($("#pass").val() == "") {
			alert("암호를 입력해 주세요!");
			$("#pass").focus();
			return false;
		}
		if ($("#name").val() == "") {
			alert("글쓴이를 입력해 주세요!");
			$("#name").focus();
			return false;
		}
		if ($("#content").val() == "") {
			alert("내용을 입력해 주세요!");
			$("#content").focus();
			return false;
		}
		
		var frmData = $("#frm").serialize();
		$.ajax({
			type: "POST",
			data: frmData,
			url: "boardWriteSave.do",
			dataType: "text",
			success: function (data) {
				if (data == "ok") {
					alert("저장 완료!");
					location="boardList.do";
				} else {
					alert("저장 실패...");
				}
			},
			error: function () {
				alert("오류 발생");
			}
		});
		
		//document.frm.submit();
	}
</script>
</head>
<body>
	<form name="frm" id="frm" method="post" action="boardWriteSave.do">
		<table>
			<caption>게시글 등록</caption>
			<tr>
				<th width="20%"><label for="title">제목</label></th>
				<td width="80%"><input type="text" name="title" id="title"></td>
			</tr>
			<tr>
				<th><label for="pass">암호</label></th>
				<td><input type="password" name="pass" id="pass"></td>
			</tr>
			<tr>
				<th><label for="name">글쓴이</label></th>
				<td><input type="text" name="name" id="name"></td>
			</tr>
			<tr>
				<th><label for="content">내용</label></th>
				<td><textarea name="content" id="content"></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<button type="button" onclick="checkSubmit()">저장</button>
					<button type="reset">취소</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>