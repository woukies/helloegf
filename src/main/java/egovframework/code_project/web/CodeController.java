package egovframework.code_project.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.code_project.service.CodeService;
import egovframework.code_project.service.CodeVO;

@Controller
public class CodeController {
	@Resource(name = "codeService")
	private CodeService codeService;

	@RequestMapping("/codeWrite.do")
	public String insertCode() {
		return "code/codeWrite";
	}

	@RequestMapping("/codeWriteSave.do")
	public String insertCodeSave(CodeVO vo) throws Exception {
		codeService.insertCode(vo);

		return "redirect:codeWrite.do";
	}
}
