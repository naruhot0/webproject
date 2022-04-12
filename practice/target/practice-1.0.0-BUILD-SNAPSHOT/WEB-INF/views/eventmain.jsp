<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${cp}/resources/css/eventmain.css">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="header.jsp" />
	<section>
                <div class="wrapper">
                    <div class="main-inner">
                        <div class="search-filter">
                            <div class="search-filter-inner">
                                <div class="location">
                                    <p>지역</p>
                                    <input type="checkbox" id="checkbox1" name="loc" value='서울'> 서울
                                    <input type="checkbox" id="checkbox2" name="loc" value='경기'> 경기
                                    <input type="checkbox" id="checkbox3" name="loc" value='강원'> 강원
                                    <input type="checkbox" id="checkbox4" name="loc" value='충북'> 충북
                                    <input type="checkbox" id="checkbox5" name="loc" value='충남'> 충남
                                    <input type="checkbox" id="checkbox6" name="loc" value='전북'> 전북
                                    <input type="checkbox" id="checkbox7" name="loc" value='전남'> 전남
                                    <input type="checkbox" id="checkbox8" name="loc" value='경북'> 경북
                                    <input type="checkbox" id="checkbox9" name="loc" value='경남'> 경남
                                    <input type="checkbox" id="checkbox10" name="loc" value='제주'> 제주
                                </div>
                                <div>
                                    <p>전체지도</p>
                                </div>
                                <div class="select">
                                    <p>종목</p>
                                    <input type="checkbox" name="sel" value="풀코스"> 풀코스
                                    <input type="checkbox" name="sel" value="하프코스"> 하프코스
                                    <input type="checkbox" name="sel" value="100k"> 100km
                                    <input type="checkbox" name="sel" value="50k"> 50km
                                    <input type="checkbox" name="sel" value="10k"> 10km
                                    <input type="checkbox" name="sel" value="5k"> 5km
                                    <input type="checkbox" name="sel" value="풀코스"> 풀코스
                                    <input type="checkbox" name="sel" value="암벽"> 암벽등반
                                    <input type="checkbox" name="sel" value="철인"> 철인3종
                                    <input type="checkbox" name="sel" value="등산"> 등산/플로깅
                                </div>
                                <div class="month">
                                    <p>월</p>
                                    <input type="checkbox" name="month" value="1">1월
                                    <input type="checkbox" name="month" value="1">2월
                                    <input type="checkbox" name="month" value="1">3월
                                    <input type="checkbox" name="month" value="1">4월
                                    <input type="checkbox" name="month" value="1">5월
                                    <input type="checkbox" name="month" value="1">6월
                                    <input type="checkbox" name="month" value="1">7월
                                    <input type="checkbox" name="month" value="1">8월
                                    <input type="checkbox" name="month" value="1">9월
                                    <input type="checkbox" name="month" value="1">10월
                                    <input type="checkbox" name="month" value="1">11월
                                    <input type="checkbox" name="month" value="1">12월
                                </div>             
                                <div class="time">
                                    <p>접수여부</p>
                                    <input type="checkbox" name="time" value="yes"> 접수중
                                    <input type="checkbox" name="time" value="yes"> 접수완료
                                </div>
                                <div class="submit-button">
                                    <input type="submit" value="검색">
                                </div>
                            </div>
                        </div>
                        <div class="event-container">
                            <div class="space1">
                                <div class="space-Day" id="this-month">
                                    <div>
                                        <h1>4월의 행사</h1>
                                    </div>
                                </div>
                                <ul>
                                    <li><a href="${cp}/event"><img src="" alt="2204-1"></a></li>
                                    <li><a href="#"><img src="" alt="2204-2"></a></li>
                                    <li><a href="#"><img src="" alt="2204-3"></a></li>
                                    <li><a href="#"><img src="" alt="2204-4"></a></li>
                                    <li><a href="#"><img src="" alt="2204-5"></a></li>
                                </ul>

                            </div>
                            <div class="space2">
                                <div class="space-Day" id="next-month">

                                </div>
                                <div>
                                    <h1>5월의 행사</h1>
                                </div>
                                <div>
                                    <ul>
                                    <li><a href="#"><img src="" alt="2205-1"></a></li>
                                    <li><a href="#"><img src="" alt="2205-2"></a></li>
                                    <li><a href="#"><img src="" alt="2205-3"></a></li>
                                    <li><a href="#"><img src="" alt="2205-4"></a></li>
                                    <li><a href="#"><img src="" alt="2205-5"></a></li>
                                    </ul>

                                </div>

                            </div>
                            <div class="space3">
                                <div class="space-Day" id="3th">
                                    <div>
                                        <h1>6월의 행사</h1>
                                    </div>
                                </div>
                                <div>
                                    <ul>
                                    <li><a href="#"><img src="" alt="2206-1"></a></li>
                                    <li><a href="#"><img src="" alt="2206-2"></a></li>
                                    <li><a href="#"><img src="" alt="2206-3"></a></li>
                                    <li><a href="#"><img src="" alt="2206-4"></a></li>
                                    <li><a href="#"><img src="" alt="2206-5"></a></li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>


                <div class="pageNum">

                    <div class="pageNumInner">
                        <ul>
                            <li><a href="#">처음으로</a></li>
                            <li><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li><a href="#">끝으로</a></li>
                        </ul>
                    </div>

                </div>


            </section>
            
            <jsp:include page="footer.jsp" />
</body>
</html>