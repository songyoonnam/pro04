package com.lotte.service;

import java.util.List;

import com.lotte.dto.BoardDTO;

public interface BoardService {
	public List<BoardDTO> boardList() throws Exception;
	public BoardDTO boardDetail(int seq) throws Exception;
	
	public BoardDTO boardModify(int seq) throws Exception;
	public BoardDTO boardDelete(int seq) throws Exception;
	public BoardDTO boardInsert(int seq) throws Exception;
	
}

