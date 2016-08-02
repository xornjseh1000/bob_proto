<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>

<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<style>
#img {background-image:url(<%=ctx %>/img/main.png) ;
background-repeat: no-repeat;
width : 2000px; height : 700px;

 }
</style>
<jsp:include page="/global/navi.jsp"/>
<body>
	
	
		<div class="text">
	<div id="img">
	<br /><br />
	<a href="<%=ctx %>/payment/payment.jsp">주행요금계산기</a><br />
	<a href="<%=ctx %>/booking/booking.jsp">편도예약하기</a><br />
	<a href="<%=ctx %>/member/login.jsp">로그인</a><br />
<h5>---------------------------------------------------</h5>
	<a href="regist.jsp">회원가입</a><br />
	<a href="aaa.jsp">이용방법</a><br />
	<a href="aaa.jsp">소카임팩트</a><br />
	
	<h5>---------------------------------------------------</h5>
	<a href="aaa.jsp">법인/단체안내</a><br />

	<a href="aaa.jsp">소카쿠폰혜택</a><br />

	<a href="aaa.jsp">소카요금보기</a><br />
	
	<a href="aaa.jsp">다양한차종둘러보기</a><br />
	
	 
	<a href="aaa.jsp">법인혜택</a><br />

	<a href="aaa.jsp">쿠폰북</a><br />

	<a href="<%=ctx %>/booking/booking.jsp.jsp">소카편도</a><br />
	<a href="aaa.jsp">소카존신청하기</a><br />
	
</div>
		
</div>
	<br /><br />
	

	

</body>
<jsp:include page="/global/footer.jsp"/>	
</html>