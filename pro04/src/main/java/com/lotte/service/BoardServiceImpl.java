package com.lotte.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lotte.dao.BoardDAO;
import com.lotte.dto.BoardDTO;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDAO boardDao;
	
	@Override
	public List<BoardDTO> boardList() throws Exception {
		
		return boardDao.boardList();
	}
	
	@Override
	public BoardDTO boardDetail(int seq) throws Exception {
		return boardDao.boardDetail(seq);
	}
	
	@Override
	public BoardDTO boardInsert(int seq) throws Exception {
		return boardDao.boardInsert(seq);
	}
	
	@Override
	public BoardDTO boardModify(int seq) throws Exception {
		return boardDao.boardModify(seq);
	}

	@Override
	public BoardDTO boardDelete(int seq) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
