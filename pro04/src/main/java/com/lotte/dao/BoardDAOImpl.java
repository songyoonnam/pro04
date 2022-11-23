package com.lotte.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lotte.dto.BoardDTO;
import com.lotte.service.BoardService;

@Repository
public class BoardDAOImpl implements BoardService {

@Autowired
SqlSession sqlSession;

	
	@Override
	public List<BoardDTO> boardList() throws Exception {
	
		return sqlSession.selectList("board.boardList");
	}
	
	@Override
	public BoardDTO boardDetail(int seq) throws Exception {
		return sqlSession.selectOne("board.boardDetail",seq);
	}
	
}

