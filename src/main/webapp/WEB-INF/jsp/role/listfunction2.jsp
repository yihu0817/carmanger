<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.ittx.car.model.Function" %>
<%@ page import="java.util.*" %>
<%
	String contextPath = request.getContextPath();
%>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>模块管理</title>
<script>
	function selectAll(form, elementName) {
		for (var i = 0; i < form.elements.length; i++) {
			var e = form.elements[i];
			if (e.name == elementName) {
				e.checked = form.chkall.checked;
			}
		}
	}
</script>
</head>
<body>
	<h3>权限管理 &gt; 角色管理 &gt; 管理角色功能</h3>
	<p>
		[<a href="listroles.jspa">返回</a>]
	</p>

	<p>角色名称：${roles.name}</p>
	<form id="form1" name="form1" method="post"
		action="<%=contextPath%>/role/submitfunction.do">
		<table width="100%" border="0" cellpadding="2" cellspacing="2"
			bgcolor="#cccccc">
			<tr>
				<td width="4%"><label> <input name="chkall"
						type="checkbox" id="chkall" value=""
						onclick="javascript:selectAll(form1,'selectId')" />
				</label></td>
				<!-- <td width="24%"><div align="center">模块</div></td> -->
				<td width="38%"><div align="center">功能</div></td>
				<td width="34%"><div align="center">功能描述</div></td>
			</tr>
			<c:forEach items="${functionAllLists}" var="x"> 
				<tr>
					<% int z = 0; %>
					<c:forEach items="${functionLists}" var="y">
					
						<c:if test="${y.fId eq x.fId} ">
							<% 
							   z = 1;
							%>
						</c:if>
					</c:forEach> 
					<br>
					<%
						if (z == 1) {
					%>
					<td bgcolor="#ffffff"><input name="selectId" type="checkbox" value="${x.fId}" checked="checked" /></td>
					<%
						} else {
					%>
					<td bgcolor="#ffffff"><input name="selectId" type="checkbox" value="${x.fId}" /></td>
					<%
						}
					%>

					<%-- <td bgcolor="<%=color%>"><div align="center">${x.module.name}</div></td> --%>
					<td bgcolor="#ffffff"><div align="center">${x.code}</div></td>
					<td bgcolor="#ffffff" style="word-break: break-all;">${x.description}</td>
				</tr>
			</c:forEach> 
			<tr>
				<td>&nbsp;</td>
				<td colspan="3"><input name="submit1" type="submit" value="提交" />
					<input name="submit2" type="reset" value="重置" /></td>
			</tr>
		</table>
	</form>
</body>
</html>
