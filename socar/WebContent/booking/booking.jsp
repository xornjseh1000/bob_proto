<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>소카예약</title>
</head>
<jsp:include page="/global/navi.jsp"/>
<body>
	<br />
	<h3> 실시간예약 </h3>
	
	
	
	<span>여정</span>&nbsp<span>왕복</span><input type="radio" name="treval" value="왕복"/>
	<span>편도</span><input type="radio" name="treval" value="편도"/><br />
	<span>대여일</span><input type="text" name="rentDate"/>&nbsp<input type="text" name="rentDateTime"/><br />
	<span>반납일</span><input type="text" name="returnDate"/>&nbsp<input type="text" name="returnDateTime"/><br />
	<span>지역</span><input type="text" name="local"/><br />
	<span>차종</span><input type="text" name="carModel"/><br />
	<input type="submit" value ="소카찾기"/>
	<br /><br />
	
	
	
</body>
<jsp:include page="/global/footer.jsp"/>
</html>