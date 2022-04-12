<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>
</head>
<body>
<% 
	String loginState = (String)session.getAttribute("loginstate");
	String sessionID =(String)session.getAttribute("sessionID");
	out.println(loginState);
	out.println(sessionID);
%>
	<jsp:include page="header.jsp"/>
	<section>
			<div class="wrapper">
            <div class="container" style="margin: 0 auto;text-align: center;">
                <div><h2>게시판 글작성</h2></div>


                <form action="doBBSPost" method="post">
                    <table style="margin: 0 auto;text-align: center;">
                        <tr>
                            <td>카테고리</td>
                            <td><select name="category">
                                    <option>잡담</option>
                                    <option>Java</option>
                                    <option>Python</option>
                                    <option>SQL</option>
                                    <option>HTML/CSS</option>
                                    <option>JSP/SPRING</option>
                                    <option>기타</option>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>제목</td>
                            <td><input type="text" name="title" /></td>
                        </tr>
                        <tr>
                            <td colspan="2"><textarea rows="20" cols="50" name="content"
                                    style="resize: none;"></textarea></td>
                        </tr>
                        <tr>

                            <td align="center"><input type="reset" value="내용초기화"></td>
                            <td align="center"><input type="submit" value="작성완료"></td>

                        </tr>
                    </table>
                </form>
                <div><a href="#">자유게시판 홈으로</a></div>
            </div>
            </div>
        </section>
	<jsp:include page="footer.jsp"/>
</body>
</html>