<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String contextPath = request.getContextPath();
%>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>模块管理</title>
<script>
	function validatefunction() {
		if (document.form1.function_code.value == "") {
			window.alert("功能代码不能为空!");
			window.form1.function_code.focus();
			return false;
		}
	}
	
	var jsonStr = ${function_json};
	document.write(jsonStr);
	
</script>
</head>
<body>

	<h3>模块功能浏览</h3>

	<p>
		[<a href="listmodules.jspa">返回模块浏览</a>]
	</p>

</body>
</html>

