package kh.lclass.db.board.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kh.lclass.db.board.model.vo.BoardVo;
import kh.lclass.db.member.model.service.BoardService;
import kh.lclass.db.member.model.service.MemberService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	
	@Autowired
	private BoardService boardservice;
		@GetMapping("/list")
		public String list(Model model) throws Exception {
			
			
			//controller  >>  jps로 보낼때
			model.addAttribute("boardlist",boardservice.selectlist());
			return "board/list";
		}
		@GetMapping("/get")
		public String get(Model model, int bno 
				//jsp >> controller로 
				) throws Exception{
			
			model.addAttribute("boardvo",boardservice.selectOne(bno));
			return "board/get";
		}
		
		
		
		
//		public ModelAndView list(ModelAndView mv) {
//			mv.addObject("boardList", boardservice.selectlist());
//			mv.setViewName("/board/list");
//			return mv;
//		}
		
		
		
//		public String insertDo(BoardVo vo, String btitle) {
//			
//			vo.setMid("kh1");
//			return "redirect:/board/list";
//		}
//		
		
		public String test(RedirectAttributes redirectatt) throws Exception {
			String viewpage = "";
			
			int result = 1; //성공 1 / 실패 0 

			if(result <1) {
				redirectatt.addFlashAttribute("msg","글등록 실패했습니다");
				viewpage = "redirect:/board/insert";
				//실패했을시 insert로 다시이동    ㅍ
			}else {
				redirectatt.addFlashAttribute("msg","글등록 성공했습니다");
				viewpage = "redirect:/board/list";
			}
			return viewpage;
		}
//		@ExceptionHandler
//		public void e() {
//			
//		}
}
