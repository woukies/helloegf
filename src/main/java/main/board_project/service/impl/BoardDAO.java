package main.board_project.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.rte.psl.dataaccess.EgovAbstractDAO;
import main.board_project.service.BoardVO;

@Repository("boardDAO")
public class BoardDAO extends EgovAbstractDAO {
	public String insertNBoard(BoardVO vo) throws Exception {
		return (String) insert("boardDAO.insertNBoard", vo);
	}
}
