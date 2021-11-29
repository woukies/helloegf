package egovframework.emp_project.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.emp_project.service.EmpService;
import egovframework.emp_project.service.EmpVO;

@Controller
public class EmpController {
	@Resource(name = "empService")
	private EmpService empService;
	
	@RequestMapping(value = "/empWrite.do")
	public String empWrite() {
		return "emp/empWrite";
	}
	
	@RequestMapping(value = "/empWriteSave.do")
	public String empWriteSave(EmpVO vo) throws Exception {
		empService.insertEmp(vo);
		return "";
	}
}
