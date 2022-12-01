package com.lotte.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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

	@Override
	public void memberInsert(MemberDTO member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberDTO signIn(MemberDTO mdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean login(HttpServletRequest req) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public MemberDTO loginCheck(MemberDTO mdto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void memberUpdate(MemberDTO mdto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberDelete(String id) {
		// TODO Auto-generated method stub
		
	}
	
}
