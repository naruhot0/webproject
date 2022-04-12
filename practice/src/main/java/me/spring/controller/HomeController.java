package me.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.spring.beans.MemberDto;
import me.spring.game.beans.GameDto;
import me.spring.game.service.GameService;
import me.spring.service.MemberService;

/**
 * Handles requests for the application home page.
 */

@Controller
public class HomeController {
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	private final MemberService memberService;
	private final GameService gameService;
	
//	@Autowired
//	public HomeController(MemberService memberService) {
//
//		this.memberService = memberService;
//	}
	
	@Autowired
	public HomeController(MemberService memberService , GameService gameService) {
		
		this.memberService = memberService;
		this.gameService = gameService;
		
		
	}
	
	
	
	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {

		return request.getContextPath();

	}

	@RequestMapping("/")
	public String index(Model model, HttpSession session) {
		
		String sessionID = (String) session.getAttribute("sessionID");
		
		if(sessionID == null) {
			session.setAttribute("sessionID", "ㅇㅇ");
			session.setAttribute("loginstate", "off");
		}
		
		List<GameDto> list = gameService.sellectAll();
		
		session.setAttribute("mainGamelist", list);
		
		
		return "index"; 
	}

	

	@RequestMapping(value = "/dosignup", method = RequestMethod.POST)
	public String doJoin(@ModelAttribute MemberDto mDto, HttpSession session) {

		String id = mDto.getId();
		String pwd = mDto.getPwd();
		String name = mDto.getName();
		String email = mDto.getEmail();

		System.out.println("dto는" + id + pwd + name + email);

		boolean isSignup = memberService.signup(mDto);

		if (isSignup) {
			session.setAttribute("signup", "signup-success");
			return "redirect:/";

		} else {
			session.setAttribute("signup", "signup-fail");
			return "redirect:/signup";

		}

	}

	@SuppressWarnings("unused")
	@RequestMapping(value = "/doLogin" , method = RequestMethod.POST)
	public String login(@ModelAttribute MemberDto memberDto , HttpSession session) {
		System.out.println(memberDto.getId());
		System.out.println(memberDto.getPwd());
		//DB에서 id를 검색해옴
		
		MemberDto member = memberService.select(memberDto.getId());
		System.out.println("서비스 갔다옴");
		
		if(memberDto.getId().equals(member.getId()) &&
				memberDto.getPwd().equals(member.getPwd())) {
		
		session.setAttribute("sessionID", memberDto.getId());	
		session.setAttribute("loginstate", "on");	
		return "redirect:/";
		
		}
		session.setAttribute("loginstate", "off");
		System.out.println("로그인실패함");
		return "redirect:/";
		
	}
	//페이지들 이동 담당
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(HttpSession session) {

		return "signup";

	}
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginpage(HttpSession session) {

		return "login";

	}
	@RequestMapping(value = "/doLogout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
		
	}
	
	
	
	
//	@RequestMapping(value = "/bbsPost",method = RequestMethod.GET)
//	public String gobbspost(HttpSession session) {
//		
//		return "bbspost";
//	}
	
	
//	@RequestMapping(value="/doBBSPost", method = RequestMethod.POST)
//	public String doPost(@ModelAttribute BBSDto bbsDto,HttpSession session) {
//		
//		String sessionID = (String) session.getAttribute("sessionID");
//		if(sessionID == null) sessionID = "ㅇㅇ";
//		
//		String category = bbsDto.getCategory();
//		String title = bbsDto.getTitle();
//		String content = bbsDto.getContent();
//		String write = (String) session.getAttribute(sessionID);
//		
//		System.out.println("dto는"+ category+ title+ content+ write);
		
//		boolean isWritePost = postService.writePost(bbsDto);
		
//		if (isWritePost) {
//			session.setAttribute("bbsPost", "ok");
//			return "redirect:/bbslist";
//
//		} else {
//			session.setAttribute("bbsPost", "fail");
//			return "redirect:/bbslist";
//
//		}
		
		
//	}
	
	
	/*
	 * URI / URL 작성 규칙
	 * 
	 * 1) 동사 보다는 명사를 사용 (명사: 정보의 자원을 명사로 표기) ex) GET /cp/getUsers/1 (X)--> id가 1번인
	 * user를 검색 ex) GET /cp/users/1 (O)--> id가 1번인 user를 검색
	 * 
	 * 2) 자원에 대한 행위 (동사)는 HTTP METHOD (GET/POST/DELETE/PUT)을 사용
	 * 
	 * ex) GET /cp/users/1 --> id가 1번인 user를 조회 PUT /cp/users/1 --> id가 1번인 user를 수정
	 * DELETE /cp/users/1 --> id가 1번인 user를 삭제 POST /cp/users/1 --> id가 1번인 user를 삽입
	 * 
	 * 3) 단수 명사가 아닌 복수형을 사용
	 * 
	 * 
	 * 
	 * 
	 * 
	 * URI : Uniform Resource Identifier URL : Uniform Resource Locator
	 * 
	 * ex) 사람 정보 : 이름(URI), 주소(URI,URL)
	 * 
	 * URI > URL
	 * 
	 * https://www.naver.com/index.jsp --> URL,URI https://www.naver.com/index -->
	 * URI request mapping 값을 안다고 해서 view page의 위치는 모름
	 * 
	 * client에서는 request mapping 값만 알도록 즉, 가상의 경로만 알려줌 (URI) 실제 view page의 위치 (URL)는
	 * 숨김
	 * 
	 * 
	 */

}
