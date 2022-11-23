package com.lotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotte.dao.MemberDAO;
import com.lotte.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDAO memberDao;
	
	@Override
	public List<MemberDTO> memberList() throws Exception {
		
		return memberDao.memberList();
	}
	
	@Override
	public MemberDTO getMember(String id) throws Exception {
		return memberDao.getMember(id);
	}
	
}
