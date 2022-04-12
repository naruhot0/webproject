<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.Timestamp" %>    
<%@ page import="me.spring.bbs.beans.*" %>
<%@ page import="me.spring.bbs.dao.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자유게시판</title>
</head>
<body>
	<jsp:include page="header.jsp"/>
	
	<section>
		<div class="wrapper">
		<div class=container style="margin: 0 auto;text-align: center;">
			<h2>자유게시판 입니다</h2>
			<table style="margin: 0 auto;text-align: center;">
				<thead>
				<tr>
					<th>게시물번호</th>
					<th>카테고리</th>
					<th>제목</th>
					<!--<th>내용</th>-->
					<th>작성자</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
				</thead>
				<tbody>
				<c:forEach items="${boardlist}" var="list">
				<tr>
					<td>${list.num}</td>
					<td>${list.category}</td>
					<td><b><a href="doViewContent?bbsID=${list.num}">${list.title}</a></b></td>
					<td>${list.write}</td>
					<td>${list.regdate}</td>
					<td>${list.hit}</td>

				</tr>	
				</c:forEach>	
				</tbody>		
			</table>
			<div>
				<a href="${cp}/bbsPost">새글작성</a>
			
			</div>
		</div>
		</div>
	</section>
	<jsp:include page="footer.jsp"/>
</body>
</html>