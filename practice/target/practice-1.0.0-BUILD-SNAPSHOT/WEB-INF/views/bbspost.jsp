<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp">
	<section>
            <div class="container">
                <div><b>게시판</b></div>


                <form action="doBBSpost" method="post">
                    <table>
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
        </section>
	<jsp:include page="footer.jsp">
</body>
</html>