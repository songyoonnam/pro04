package com.lotte.service;

import java.util.List;

import com.lotte.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> memberList() throws Exception;
	public MemberDTO getMember(String id) throws Exception;
	
}
