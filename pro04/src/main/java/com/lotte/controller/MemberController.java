package com.lotte.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lotte.dto.MemberDTO;
import com.lotte.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
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
}
