<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*, me.spring.beans.MemberVO"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>A Simple Login Form</title>

<script>
	// Get the modal
	var modal = document.getElementById('id01');
	// When the user clicks anywhere outside of the modal, close it
	window.onclick = function(event) {
		if (event.target == modal) {
			modal.style.display = "none";
		}
	}
</script>


<link rel="stylesheet" href="${cp}/resources/css/login.css">
</head>
<body>
	<jsp:include page="header.jsp" />
	<section>
		<div class="container" margin="0 auto">
			<h1>Bubbly에 로그인</h1>
			<br>
			<form>
				<!-- Create a form container -->
				<div class="container">
					<!-- Username -->
					<label for="uname"><b>아이디</b></label> <input type="text"
						placeholder="이메일주소" name="uname" required> <br>
					<!-- Password -->
					<label for="psw"><b>비밀번호</b></label> <input type="password"
						placeholder="" name="" required>
					<!-- Submit Button -->
					<br>
					<button type="submit">Login</button>
					<label>
				</div>


				<br> <span class="psw"> <a href="#">비밀번호 찾기</a></span> <br>
				<label for="text"><b>회원가입이 필요하다면?</b></label> <span class="register"><a
					href="#">회원가입</a></span> </br>

			</form>
		</div>
	</section>
	<jsp:include page="footer.jsp" />
</body>
</html>