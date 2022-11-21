package com.lotte.dao;

import java.util.List;

import com.lotte.dto.MemberDTO;

public interface MemberDAO {
	public List<MemberDTO> memberList() throws Exception;
}
