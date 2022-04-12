<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, me.spring.beans.MemberVO"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>버블리 로그인</title>

<link rel="stylesheet" href="${cp}/resources/css/login.css">
</head>
<body>
	<jsp:include page="header.jsp" />
	<section>
		<div class=wrapper>
			<div class="main-inner">
				<h1>Bubbly에 로그인</h1>
				<br>

				<!-- Create a form container -->
				<div class="container">
					<div class="innerform">
					<form name="login" method="post" action="${cp}/doLogin">
						<!-- Username -->
						<label for="uname"><b>아이디</b></label> <input type="text"
							placeholder="아이디" name="id" id="id"> <br>
						<!-- Password -->
						<label for="pwd"><b>비밀번호</b></label> <input type="password"
							placeholder="비밀번호를 입력하세요" name="pwd" id="password">
						<!-- Submit Button -->
						<br>
						<button type="submit" id="submit">로그인</button>
						<label>
					</form>
					</div>
					<b>회원가입이 필요하다면?</b></label> <span class="register"><a
						href="${cp}/signup">회원가입</a></span> <br />
				</div>
			</div>
		</div>
	</section>
	<jsp:include page="footer.jsp" />
</body>
</html>