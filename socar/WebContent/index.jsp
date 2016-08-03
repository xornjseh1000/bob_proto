<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String ctx = application.getContextPath(); %>

<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<style>
#img {background-image:url(<%=ctx %>/img/main1.png);

background-repeat: no-repeat;
width : 2200px; height : 600px;
}

.button {
    background-color: #008CBA;;
    border: none;
    color: white;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
	padding: 12px 28px;
}
.button:hover {
    background-color: #4CAF50;
    color: white;
}

</style>
<jsp:include page="/global/navi.jsp"/>
<body>
	
	
	<div class="text">
	<div id="img">
<br />
	<a href="<%=ctx %>/payment/payment.jsp"><button class="button">주행요금계산기</button></a><br />
	<a href="<%=ctx %>/booking/booking.jsp"><button class="button">편도예약하기</button></a><br />
		<a href="aaa.jsp"><button class="button">소카요금보기</button></a><br />
		<a href="<%=ctx %>/booking/booking.jsp.jsp"><button class="button">소카편도</button></a><br />
	
	
	<!--  <a href="<%=ctx %>/member/login.jsp"><button class="button">로그인</button></a><br />
	<a href="<%=ctx %>/member/regist.jsp"><button class="button">회원가입</button></a><br />
	<a href="<%=ctx %>/customer/customermain.jsp"><button class="button">고객센터</button></a><br />
	<a href="aaa.jsp"><button class="button">소카임팩트</button></a><br />
	<a href="aaa.jsp"><button class="button">법인혜택</button></a><br />
	<a href="aaa.jsp"><button class="button">쿠폰북</button></a><br />
	<a href="aaa.jsp"><button class="button">소카쿠폰혜택</button></a><br />
	<a href="aaa.jsp"><button class="button">소카존 신청하기</button></a><br />-->
	
</div>
</div>
	<br />
	

<!--  <a href="hosting.jsp"><button class="button">이전</button></a>
      <a href="hosting3.jsp"><button class="button">다음</button></a>-->

	
	
</body>
<jsp:include page="/global/footer.jsp"/>
</html>