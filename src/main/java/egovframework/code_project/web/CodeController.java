package egovframework.code_project.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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

		return "redirect:codeList.do";
	}

	@RequestMapping("/codeList.do")
	public String selectCodeList(ModelMap model) throws Exception {
		List<?> codeList = codeService.selectCodeList();
		model.addAttribute("resultList", codeList);
		int codeCount = codeService.selectCodeCount();
		model.addAttribute("resultCount", codeCount);
		
		return "code/codeList";
	}
	
	@RequestMapping("/codeDelete.do")
	public String deleteCode(String code) throws Exception {
		codeService.deleteCode(code);
		
		return "redirect:codeList.do";
	}
	
	@RequestMapping("/codeModify.do")
	public String updateCode(ModelMap model, String code) throws Exception {
		if (code == null || code.length() == 0) {
			return "redirect:codeList.do";
		}
		
		CodeVO vo = codeService.selectCode(code);
		if (vo == null) {
			return "redirect:codeList.do";
		}
		
		model.addAttribute("result", vo);
		return "code/codeModifyWrite";
	}
	
	@RequestMapping("/codeModifySave.do")
	public String updateCodeSave(CodeVO vo) throws Exception {
		if (codeService.updateCode(vo) > 0) {
			return "redirect:codeList.do";
		} else {
			return "forward:codeModify.do";
		}
	}
}
