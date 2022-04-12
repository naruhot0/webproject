package me.spring.game.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.spring.game.beans.GameDto;
import me.spring.game.service.GameService;

@Controller
public class GameController {
	
	final GameService gameService;
	
	@Autowired
	public GameController(GameService gameService) {
		
		this.gameService = gameService;
		// TODO Auto-generated constructor stub
	}
	
	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {
		
		
		return request.getContextPath();
		
	}
	
	//이벤트 메인페이지로 가는 열쇠
	@RequestMapping(value = "/eventmain",method = RequestMethod.GET)
	public String eventMain(HttpSession session) {
		
		List<GameDto> list = gameService.sellectAll();
		
		session.setAttribute("gamelist", list);
		
		return "eventmain";
	}
	
	@RequestMapping(value = "/viewGamePage",method = RequestMethod.GET)
	public String gamePage(HttpSession session, HttpServletRequest request) {
		
		String game = request.getParameter("title");
		System.out.println("여기작동해?");
		
		GameDto gameDto = gameService.selectGame(game);
		
		System.out.println("gamepackage에 뭐담김?"+gameDto);
		session.setAttribute("gamepackage", gameDto);
		
		return "event";
		
	}
	
	
	
	
}
