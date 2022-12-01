package com.lotte.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lotte.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> memberList() throws Exception;
	public MemberDTO getMember(String id) throws Exception;
	public void memberInsert(MemberDTO member);
	public MemberDTO signIn(MemberDTO mdto);
	public boolean login(HttpServletRequest req);
	public MemberDTO loginCheck(MemberDTO mdto);
	public void memberUpdate(MemberDTO mdto);
	public void memberDelete(String id);
	
}
