<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${cp}/resources/css/signup.css">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp" />

<section>
<% 
	Enumeration<String> attributeNames = session.getAttributeNames();
	while(attributeNames.hasMoreElements()){
		
		String key = (String)attributeNames.nextElement();
		String value = (String)session.getAttribute(key);
		out.println(key+" : " + value + "<br/>");	
	}
%>
<div class=registerbox>
<h2><b>회원가입</b></h2>
    <div class="innerform">
    <form name="signup" method="post" action="dosignup">
    	
    	<label for="id"><b>아이디: </b></label><input type="text" id="id" name="id"><br />
        <label for="name"><b>이름:</b> </label><input type="text" id="name" name="name"><br />
        <label for="password"><b>비밀번호: </b></label><input type="password" id="password" name="pwd"><br />
        <label for="email"><b>이메일주소: </b></label><input type="email" id="email" name="email"><br />
       
        <input type="submit" id="submit" value="회원가입" onclick="">
        <input type="reset" id="reset" value="재입력">
    </form>
    </div>
    </div>
   </section>
   
<jsp:include page="footer.jsp" />   
</body>
</html>