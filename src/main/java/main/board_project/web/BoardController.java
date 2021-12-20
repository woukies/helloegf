package main.board_project.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import main.board_project.service.BoardService;
import main.board_project.service.BoardVO;

@Controller
public class BoardController {
	
	@Resource(name = "boardService")
	private BoardService boardService;
	
	@RequestMapping(value = "/boardWrite.do")
	public String boardWrite() {
		return "board/boardWrite";
	}
	
	@RequestMapping(value = "/boardWriteSave.do")
	public String boardWriteSave(BoardVO vo) throws Exception {
		if (boardService.insertNBoard(vo) == null) {
			return "";
		} else {
			return "redirect:boardWrite.do";
		}
	}
}
