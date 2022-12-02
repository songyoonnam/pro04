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
		return memberDao.memberInsert();
		
	}

	@Override
	public MemberDTO signIn(MemberDTO mdto) {
		return memberDao.signIn();
	}

	@Override
	public boolean login(HttpServletRequest req) {
		return login(req);
	}

	@Override
	public MemberDTO loginCheck(MemberDTO mdto) {
		return memberDao.loginCheck();
	}

	@Override
	public void memberUpdate(MemberDTO mdto) {
		return memberDao.memberUpdate();
		
	}

	@Override
	public void memberDelete(String id) {
		return memberDao.memberDelete(id);
		
	}
	
}
