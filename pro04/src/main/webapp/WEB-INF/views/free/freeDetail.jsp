<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
    
<c:set var="path1" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>자유게시판 상세보기</title>
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
			<th width="70">Bno</th>
			<th width="100">Title</th>
			<th width="100">Content</th>
			<th>Nickname</th>
			<th>Regdate</th>
			<th>visited</th>
			<th>Rec</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach items="${freeList }" var="free" varStatus="status">
		<tr>
			<td>${status.bno }</td>
			<td>${free.title }</td>
			<td>${free.content }</td>
			<td>${free.nickname }</td>
			<td>${free.regdate }</td>
			<td>${free.visited }</td>
			<td>${free.rec }</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</div>

</body>
</html>