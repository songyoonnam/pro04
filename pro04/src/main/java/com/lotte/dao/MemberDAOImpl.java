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
		//return sqlSession.insert("member.memberInsert");
	}

	@Override
	public MemberDTO signIn(MemberDTO mdto) {
		return sqlSession.insert("member.signIn");
	}

	@Override
	public boolean login(HttpServletRequest req) {
		return sqlSession.selectOne("member.login");
	}

	@Override
	public MemberDTO loginCheck(MemberDTO mdto) {
		return sqlSession.selectOne("member.loginCheck");
	}

	@Override
	public void memberUpdate(MemberDTO mdto) {
		return sqlSession.update("member.memberUpdate");
		
	}
	
	@Override
	public void memberDelete(String id) {
		return sqlSession.delete("member.memberDelete", id);
		
	}
	
}


