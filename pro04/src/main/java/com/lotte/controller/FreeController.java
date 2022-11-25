package com.lotte.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lotte.dto.FreeDTO;
import com.lotte.service.FreeService;

@Controller
@RequestMapping("/free/*")
public class FreeController {

	@Autowired
	private FreeService freeService;
	
	@GetMapping("list.do")		//board/list.do
	public String getFreeList(Model model) throws Exception {
		List<FreeDTO> freeList = freeService.freeList(); 
		model.addAttribute("freeList", freeList);
		return "free/freeList";
	}
	
	@GetMapping("detail.do")	//board/detail.do?seq=1
	public String getFreeDetail(HttpServletRequest request, Model model) throws Exception {
		int bno = Integer.parseInt(request.getParameter("bno"));
		FreeDTO dto = freeService.freeDetail(bno);
		model.addAttribute("dto", dto);
		return "free/freeDetail";
	}
	
	@GetMapping("insert.do")
	public String insertForm(HttpServletRequest request, Model model) throws Exception {
		return "free/freeInsert";
	}
	
	@PostMapping("insert.do")
	public String freeInsert(HttpServletRequest request, Model model) throws Exception {
		FreeDTO dto = new FreeDTO();
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		freeService.freeInsert(dto);
		
		return "redirect:list.do";
	}
	
	@GetMapping("delete.do")
	public String freeDelete(HttpServletRequest request, Model model) throws Exception {
		int seq = Integer.parseInt(request.getParameter("bno"));
		freeService.freeDelete(bno);
		
		return "redirect:list.do";
	}
	
	@GetMapping("edit.do")
	public String editForm(HttpServletRequest request, Model model) throws Exception {
		int bno = Integer.parseInt(request.getParameter("bno"));
		FreeDTO dto = freeService.freeDetail(bno);
		model.addAttribute("dto", dto);
		return "free/freeEdit";
	}
	
	@PostMapping("edit.do")
	public String freeEdit(HttpServletRequest request, Model model) throws Exception {
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		FreeDTO dto = new FreeDTO();
		dto.setBno(bno);
		dto.setTitle(request.getParameter("title"));
		dto.setContent(request.getParameter("content"));
		freeService.freeEdit(dto);
		
		return "redirect:list.do";
	}
	
}