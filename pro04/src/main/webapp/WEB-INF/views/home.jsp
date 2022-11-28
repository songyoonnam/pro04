<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<title>LOTTE</title>
</head>
<body>

<c:if test= "${empty sid }">
<form action="${path1 }/member/loginCheck.do" method="post" name="loginForm">
<div class="grid-x">
<div class="small-12 cell">
<label>login ID
<input type="text" name="id" id="id" size="100" class="single100" placeholder="아이디 입력" required>
</label>
</div>
<div class="small-12 cell">
<label>login PW
<input type="password" name="pw" id="pw" class="single100" placeholder="비밀번호 입력" required>
</label>
<button type="submit" class="button">LOGIN</button>
<a href="${path2 }/member/agree.do" class="button" style="float:right;">회원가입</a>
</div>

</div>
</form>
<script>
function loginFailure(){
	alert("로그인 실패");
}

</script>
</c:if>
<c:if test="${not empty sid }">
	<div class="grid-x" style="height:218px">
		<div class="small-12 cell">
		<label><strong>
		${sid }
		</strong>님</label>
		</div>
		<div class="small-12 cell">
			<label>&nbsp;&nbsp;</label>
		</div>
		<div class="small-12 cell">
		<label>
		<c:set var="now" value="<%new java.util.Date() %>">
		<fmt:formatDate value="${now }" pattern="yyyy년 MM월 dd일" type="date" /></label>
		</div>
		<div class="small-12 cell">
		<label>
		<span style="display:none">${serverTime }</span>
		</label>
		</div>
		<div class="small-12 cell">
			<label>&nbsp;</label>
		</div>

</body>
</html>
