package main.board_project.service;

import java.util.List;

public interface BoardService {
	public String insertNBoard(BoardVO vo) throws Exception;
	public List<?> selectNBoards() throws Exception;
}
