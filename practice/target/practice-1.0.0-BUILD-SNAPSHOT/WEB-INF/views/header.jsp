<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- font awesome apis (icon) -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;700&display=swap" rel="stylesheet">
    <link rel="icon" type="img/png" href="/img/favi/favicon-32x32.png">
 	<link rel="stylesheet" href="${cp}/resources/css/header.css">
    <title>Bubbly</title>


    <script src="${cp}/resources/js/" defer></script>
    <!-- defer: html 요소가 모두 호출된 후에 스크립트 실행
         async: html 요소가 끝나지 않아도 스크립트 실행
               (스크립트 로드 완료되면)
    -->

</head>
<body>
    <header class="header">
                <div class="wrapper">
                    <div class="menu">
                        <div class="logo">
                            <a href="${cp}/">
                                <h1>버블리</h1>
                            </a>
                        </div>

                        <div class="mainNav">

                            <ul>
                                <li><a href="${cp}/eventmain">행사</a></li>
                                <li><a href="${cp}/freeboard">자유게시판</a></li>
                            </ul>
                        </div>

                        <div class="loginMenu">
                            <ul>
                                <li id="registernav"><a href="${cp}/signup">회원가입</a></li>
                                <li id="logininnav"><a href="${cp}/login">로그인</a></li>
                                <li id="logoutnav"><a href="#">로그아웃</a></li>
                            </ul>
                        </div>


                    </div>
                </div>

    </header>
</body>
</html>