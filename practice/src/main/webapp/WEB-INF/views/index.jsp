<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page import="java.util.*, me.spring.beans.MemberVO"%>
<!-- trim-directive-whitespace
		true: 
		브라우저에서 '소스보기'를 할 경우 스크립트 코드로 인한 공백을 제거 
		JSP 를 사용하다보면 java이 있던 자리가 servlet로 변경되고 나서 빈줄 (whitespace)로 남아있는 것을 보게 됨
		크게 문제는 없지만 깔끔해 보이지도 않고 파일의 용량도 늘어나게 되니 없애고 싶을 때 선택할 수 있는 방법!
-->

<html>
<head>
	<title>버블리 메인페이지</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<% 
	String loginState = (String)session.getAttribute("loginstate");
	String sessionID =(String)session.getAttribute("sessionID");
%>
<section>
	<div class="wrapper">
	<div class="main-inner">

	<h3>안녕하세요 ${sessionID}님</h3>
	
	<div class="main-view-poster">
		<ul style="display:flex;">
		<li><img alt="그림1" src="${cp}/resources/img/event/${mainGamelist[0].game}0.jpg"/></li>
		<li><img alt="그림2" src="${cp}/resources/img/event/${mainGamelist[1].game}0.jpg"/></li>
		<li><img alt="그림3" src="${cp}/resources/img/event/${mainGamelist[2].game}0.jpg"/></li>
		</ul>
	</div>

	</div>	
	</div>
</section>
<jsp:include page="footer.jsp"/>
</body>
</html>
