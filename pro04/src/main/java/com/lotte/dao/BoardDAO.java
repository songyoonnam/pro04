package com.lotte.dao;

import java.util.List;

import com.lotte.dto.BoardDTO;

public interface BoardDAO {
	public List<BoardDTO> boardList() throws Exception;

	public BoardDTO boardDetail(int seq);
}