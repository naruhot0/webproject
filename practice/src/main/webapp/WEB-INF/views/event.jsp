<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${cp}/resources/css/event.css">
<title>행사 페이지</title>
</head>
<body>
	<jsp:include page="header.jsp" />
	<section>
		<div class="wrapper">

			<div class="contentsWrap">
				<div class="top">
					<div class="item-left">
						<div class="event-title">
							<div>
								<h1>${gamepackage.game}</h1>
							</div>
						</div>

						<div class="event-poster">
							<div class="event-poster-item">
								<img alt="poster"
									src="${cp}/resources/img/event/${gamepackage.game}0.jpg">
							</div>
						</div>
						<div class="top-left-down">
							<div class="course">
								<h3>${gamepackage.keyword}</h3>
							</div>
							<div class="price">
								<h3>${gamepackage.locationdata}</h3>
							</div>
							<div class="favorite"></div>

						</div>

					</div>


					<div class="item-right">
						<div class="time">
							<div class="recruit">
								<h4>
									시작일<br>${gamepackage.startday}</h4>
							</div>

							<div class="start-time">
								<h4>
									종료일<br>${gamepackage.endday}</h4>
							</div>
						</div>

						<div class="weather-block">
							<div class="weather">
								<h2>대회일 날씨</h2>


							</div>
						</div>
<!--632e4793d9680a4a1e6a00768be29cec  -->
						<div class="item-right-bottom">
							<div class="goods">
								<h2>홈페이지</h2>
								<a href="${gamepackage.homepage}">${gamepackage.homepage}</a>
							</div>

					<div id="map" class="map"></div>

							<script type="text/javascript"
								src="//dapi.kakao.com/v2/maps/sdk.js?appkey=632e4793d9680a4a1e6a00768be29cec&libraries=services"></script>
							<script>
								var mapContainer = document
										.getElementById('map'), // 지도를 표시할 div 
								mapOption = {
									center : new kakao.maps.LatLng(33.450701,
											126.570667), // 지도의 중심좌표
									level : 3
								// 지도의 확대 레벨
								};

								// 지도를 생성합니다    
								var map = new kakao.maps.Map(mapContainer,
										mapOption);

								// 주소-좌표 변환 객체를 생성합니다
								var geocoder = new kakao.maps.services.Geocoder();

								// 주소로 좌표를 검색합니다
								geocoder
										.addressSearch(
												'${gamepackage.locationdata}',
												function(result, status) {

													// 정상적으로 검색이 완료됐으면 
													if (status === kakao.maps.services.Status.OK) {

														var coords = new kakao.maps.LatLng(
																result[0].y,
																result[0].x);

														// 결과값으로 받은 위치를 마커로 표시합니다
														var marker = new kakao.maps.Marker(
																{
																	map : map,
																	position : coords
																});

														// 인포윈도우로 장소에 대한 설명을 표시합니다
														var infowindow = new kakao.maps.InfoWindow(
																{
																	content : '<div style="width:150px;text-align:center;padding:6px 0;">행사를 진행하는 도시</div>'
																});
														infowindow.open(map,
																marker);

														// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
														map.setCenter(coords);
													}
												});
							</script>

						</div>
					</div>
				</div>


				<div class="middle">

					<div class="introduce">
						<!-- 글시작-->
						<p class="memotext">${gamepackage.memo}</p>

						<!--  글끝-->
					</div>

					<div class="middle-bottom">
						<div class="pageNav">
							<div class="listbutton">
								<a href="${cp}/eventmain"><input type="button" value="목록으로"></a>
							</div>
							<div class="listNum">
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
					</div>
				</div>

				<div class="bottom">
					<div class="relative-event">
						<ul>
							<li><a href="#"><img
									src="./img/festival/4월행사/수정됨_제17회 부산 비치 울트라 마라톤 대회.png"
									alt="relative1"></a></li>
							<li><a href="#"><img
									src="./img/festival/4월행사/수정됨_제18회 예산 윤봉길 전국마라톤대회 .png"
									alt="relative2"></a></li>
							<li><a href="#"><img
									src="./img/festival/4월행사/수정됨_제19회 부산마라톤.png" alt="relative3"></a></li>
							<li><a href="#"><img
									src="./img/festival/4월행사/수정됨_제9회 세종울트라마라톤대회.png"
									alt="relative4"></a></li>
							<li><a href="#"><img
									src="./img/festival/4월행사/수정됨_제9회 희망드림 국제마라톤(언택트).png"
									alt="relative5"></a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>


	</section>
	<jsp:include page="footer.jsp" />
</body>
</html>