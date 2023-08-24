package kh.lclass.db.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kh.lclass.db.member.model.service.MemberService;



@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/member/list")
	public String list(Model model) {
		model.addAttribute("memberlist",memberService.selectlist());
		return "member/list";
	}
	
	
}
