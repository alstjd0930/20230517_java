package kh.lclass.db.board.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kh.lclass.db.member.model.service.BoardService;
import kh.lclass.db.member.model.service.MemberService;

@Controller
public class BoardController {
	
	
	@Autowired
	private BoardService boardservice;
	@GetMapping("/board/list")
	public String list(Model model) {
		model.addAttribute("boardlist",boardservice.selectlist());
		return "board/list";
	}


}
