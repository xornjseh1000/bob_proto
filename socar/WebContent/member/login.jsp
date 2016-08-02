<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>로그인</title>
</head>
<jsp:include page="/global/navi.jsp"/>
<body>
	<h3>로그인페이지</h3>
	<form action="<%= ctx %>/index.jsp" method="post">
	<span>ID</span> <input type="text" name="id"/><br />
	<span>비밀번호</span> <input type="password" name="pw"/>
	<br /><br /><br />
	<input type="submit" value="로그인"/>
	<input type="reset" value="취소"/>
		</form>
	
	

	
</body>
<jsp:include page="/global/footer.jsp"/>
</html>