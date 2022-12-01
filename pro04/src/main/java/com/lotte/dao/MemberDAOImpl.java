package com.lotte.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lotte.dto.MemberDTO;
import com.lotte.service.MemberService;

@Repository
public class MemberDAOImpl implements MemberService {

@Autowired
SqlSession sqlSession;

	
	@Override
	public List<MemberDTO> memberList() throws Exception {
	
		return sqlSession.selectList("member.memberList");
	}
	
	@Override
	public MemberDTO getMember(String id) throws Exception {
		return sqlSession.selectOne("member.getMember",id);
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
