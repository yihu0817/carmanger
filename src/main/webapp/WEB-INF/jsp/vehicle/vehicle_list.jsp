<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>车辆信息列表</title>
</head>
<body>
	<div>
		<form action="vehicle_search.do">
			<select name="searchSelect">
				<option value="all">全部</option>
				<option value="number">车牌号</option>
				<option value="telephone">电话号码</option>
				<option value="hostName">车主姓名</option>
			</select>
			<input type="text" name="keyword" /> 
			<input type="submit"
				value="查询" />
		</form>
	</div>
	<div>
		<table width="100%" border="0" bgcolor="#cccccc">
			<tr>
				<td>图片</td>
				<td>车牌号</td>
				<td>生产厂家</td>
				<td>车型</td>
				<td>颜色</td>
				<td>机动车号</td>
				<td>车主</td>
				<td>联系电话</td>
				<td>车主类型</td>
				<td>备注</td>

				<td colspan="2">操作</td>
			</tr>

			<%
				String color = "";
				int c = 1;
			%>
			<c:forEach items="${vehicleList}" var="vehicle">

				<%
					if (c == 1) {
							color = "#ffffff";
							c = 0;
						} else {
							color = "#f5f5f5";
							c = 1;
						}
				%>

				<tr bgcolor="<%=color%>">
					<td><c:if test="${empty vehicle.vehicleImg}">
							<img src="${pageContext.request.contextPath}/images/y.jpg" width="60px" height="60px" />
						</c:if>
						 <c:if test="${!empty vehicle.vehicleImg}">
							<a href="${pageContext.request.contextPath}${vehicle.vehicleImg}"><img
								src="${pageContext.request.contextPath}${vehicle.vehicleImg}"
								width="60px" height="60px" /></a>
						</c:if></td>
                    <td>${vehicle.vehicleNumber}</td>
					<td>${vehicle.productFactor}</td>
					<td>${vehicle.vehicleType}</td>
					<td>${vehicle.vehicleColor}</td>
					<td>${vehicle.engineNumber}</td>
					<td>${vehicle.vehicleHost}</td>
					<td>${vehicle.telephone}</td>
					<td>${vehicle.hostType}</td>
					<td>${vehicle.remark}</td>


					<td><a href="./vehicle_delete.do?id=${vehicle.id}">删除</a></td>
					<td><a href="./vehicle_update.do?id=${vehicle.id}">修改</a></td>
				</tr>


			</c:forEach>
		</table>
	</div>
	<div>${url}</div>

</body>
</html>