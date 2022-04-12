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
<title>게시글</title>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<section>
			<div class="wrapper">
         
                <div>
                	<h2>게시글</h2></div>
				
					<table style="margin: 0 auto;text-align: center;">
						<tr>
							<th colspan="3" align="left"><h3>${page.title}</h3></th>
						</tr>
						<tr>
							<td>카테고리 : ${page.category}</td>
							<td>작성자 : ${page.write}</td>
							<td>작성일자 : ${page.regdate}</td>
						</tr>	
						<tr id="contentbox" valign="top" style="border-top-color: rgb(100,100,100); border-top-width: 1px">
							<td colspan="3">${page.content}</td>
						</tr>
						<tr>
							<td colspan="3">조회수 ${page.hit}</td>
						</tr>
					</table>
					</div>
            </div>
 
        </section>
	<jsp:include page="footer.jsp"/>
</body>
</html>