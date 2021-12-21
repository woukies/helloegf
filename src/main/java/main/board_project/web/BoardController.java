package main.board_project.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@ResponseBody // 데이터를 전달할 수 있는 상태
	public String boardWriteSave(BoardVO vo) throws Exception {
		String msg = "";
		if (boardService.insertNBoard(vo) == null) {
			msg = "ok";
			//return "";
		} else {
			msg = "fail";
			//return "redirect:boardWrite.do";
		}
		return msg;
	}
	
	@RequestMapping(value = "/boardList.do")
	public String boardList(Model model) throws Exception {
		List<?> boards = boardService.selectNBoards();
		model.addAttribute("boards", boards);
		return "board/boardList";
	}
}
