<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Insert title here</title>
<link rel="stylesheet" href="${path1 }/include/foundation.css">
<link rel="stylesheet" href="${path1 }/include/app.css">
</head>
<body>

<script src="${path1 }/include/jquery.js"></script>
<script src="${path1 }/include/foundation.js"></script>


<div>
<table>
	<thead>
		<tr>
			<th width="70">No</th>
			<th width="100">ID</th>
			<th width="100">NAME</th>
			<th>RegDate</th>
			<th>Point</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${memberList }" var="mem" varStatus="status">
		<tr>
			<td>${status.count }</td>
			<td>${mem.id }</td>
			<td>${mem.name }</td>
			<td>${mem.regdate }</td>
			<td>${mem.pt }</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</div>

</body>
</html>