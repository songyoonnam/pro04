package com.lotte.dao;

import java.util.List;

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
	
}
