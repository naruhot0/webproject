<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ page import="java.util.*, me.spring.beans.MemberVO"%>
<%@ page session="false" %>
<!-- trim-directive-whitespace
		true: 
		브라우저에서 '소스보기'를 할 경우 스크립트 코드로 인한 공백을 제거 
		JSP 를 사용하다보면 java이 있던 자리가 servlet로 변경되고 나서 빈줄 (whitespace)로 남아있는 것을 보게 됨
		크게 문제는 없지만 깔끔해 보이지도 않고 파일의 용량도 늘어나게 되니 없애고 싶을 때 선택할 수 있는 방법!
-->

<html>
<head>
	<title>index</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<section>
	<h1>홈화면 입니다.</h1>
	<h3>안녕하세요 ${sessionID}님</h3>
	
	<a href="${cp}/update">정보수정</a><br/>
	<a href="${cp}/delete">계정삭제</a><br/>
	<a href="#"id=logout><button>로그아웃</button></a>
	

</section>
<jsp:include page="footer.jsp"/>
</body>
</html>
