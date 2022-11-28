package com.lotte.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lotte.dto.MemberDTO;
import com.lotte.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@Inject
	BCryptPasswordEncoder pwdEncoder;
	
	@Autowired
	HttpSession session;
	
	//member/list.do -> MemberService -> MemberDAO -> MyBatis(memberMapper) -> DB
	//localhost:8092/member/list.do
	//localhost:8092/member/getMember.do
	@RequestMapping(value="list.do", method = RequestMethod.GET)
	public String memberList(Model model) throws Exception {
		List<MemberDTO> memberList = memberService.memberList();
		model.addAttribute("memberList", memberList);
		return "member/meberList";
	}
	
	//localhost:8092/member/getMember.do
	//@RequestMapping("getMember.do")
	
	@RequestMapping(value="signin.do", method = RequestMethod.POST)
	public String memberSignin(@RequestParam String id, @RequestParam String pw, HttpServlet)
		session.invalidate();
		MemberDTO mdto = new MemberDTO();
		mdto.setPw(pw);
		mdto.setId(id);
		MemberDTO login = memberService.signIn(mdto);
		boolean loginSuccess = pwdEncoder.matches(mdto.getPw(), login.getPw());
		if(loginSuccess && login!=null) {
			session.setAttribute("member", login);
			session.setAttribute("sid", id);
			return "redirect:/";
		} else {
			return "redirect:loginForm.do";
		}
}
	
	
	@RequestMapping(value="loginCheck.do", method = RequestMethod.POST)
	public String memberLoginCtrl(MemberDTO mdto, RedirectAttributes rttr) throws Exception {
		session.getAttribute("member");
		MemberDTO member = memberService.loginCheck(mdto);
		boolean mat = pwdEncoder.matches(mdto.getPw(), member.getPw());
		if(mat==true && member!=null) {
			logger.info("로그인 성공");
			session.setAttribute("member", member);
			session.setAttribute("sid", member.getId());
			rttr.addFlashAttribute("msg", "로그인 성공");
			return "redirect:/";
		} else {
			Logger.info("로그인 실패");
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
			return "redirect:loginFrom.do";
		}
	}
	
	@RequestMapping(value="insert.do", method = RequestMethod.POST)
		public String memberWrite(MemberDTO member, Model model) throws Exception {
		
		String userpw = member.getPw();
		String pwd = pwdEncoder.encode(userpw);
		member.setPw(pwd);
		memberService.memberInsert(member);
		return "redirect:/";
	}
	
	@RequestMapping("loginForm.do")
	public String memberLoginForm(Model model) throws Exception {
		return "member/loginForm";
	}
		
}
