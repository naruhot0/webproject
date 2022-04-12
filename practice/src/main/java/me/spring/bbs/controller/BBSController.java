package me.spring.bbs.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.spring.bbs.beans.BBSDto;
import me.spring.bbs.service.BBSService;

@Controller
public class BBSController {
	private final BBSService bbsService;
	
	@Autowired
	public BBSController(BBSService bbsService) {
		
		this.bbsService = bbsService;
		
	}
	
	@ModelAttribute("cp")
	public String getContextPath(HttpServletRequest request) {

		return request.getContextPath();

	}
	
	
	@RequestMapping(value="/bbsList" , method = RequestMethod.GET)
	public String selectList(HttpSession session) {
		
		List<BBSDto> list = bbsService.sellectAll();
		
		System.out.println(list);
		
		session.setAttribute("boardlist", list);
		
		return "/bbslist";
		
	}
	
	@RequestMapping(value = "/bbsPost",method = RequestMethod.GET)
	public String gobbspost(HttpSession session) {
		
		return "bbspost";
	}
	
	
	
	
	@RequestMapping(value="/doBBSPost", method = RequestMethod.POST)
	public String doPost(@ModelAttribute BBSDto bbsDto,HttpSession session) {
		
		String sessionID = (String)session.getAttribute("sessionID");
		if(sessionID == null) sessionID = "ㅇㅇ";
		
		String category = bbsDto.getCategory();
		String title = bbsDto.getTitle();
		String content = bbsDto.getContent();
		bbsDto.setWrite(sessionID);
		
		System.out.println("dto는"+ category+ title+ content);
		
		boolean isWritePost = bbsService.writePost(bbsDto);
		
		if (isWritePost) {
			session.setAttribute("isWiritePost", "ok");
			return "redirect:/bbsList";

		} else {
			session.setAttribute("isWritePost", "fail");
			return "redirect:/bbsList";

		}
	}
	
	@RequestMapping(value="/doBBSList",method=RequestMethod.GET)
	public String doBBSList(HttpSession session) {
		
		List<BBSDto> list = bbsService.sellectAll();
		
		System.out.println(list);
		
		session.setAttribute("boardlist", list);
		
		return "redirect:/bbslist";
		
		
	}
	@RequestMapping(value="/doViewContent", method = RequestMethod.GET)
	public String ViewContent(HttpSession session, HttpServletRequest request) {
		
		String bbsID = (String)request.getParameter("bbsID");

		System.out.println(bbsID);
		
		BBSDto bbsDto = bbsService.selectPage(bbsID);
		
		session.setAttribute("page", bbsDto);
		
		return "bbspage";
	
	}	
		
	}

