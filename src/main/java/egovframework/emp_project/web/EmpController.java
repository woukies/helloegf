package egovframework.emp_project.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.emp_project.service.EmpService;
import egovframework.emp_project.service.EmpVO;

@Controller
public class EmpController {
	@Resource(name = "empService")
	private EmpService empService;
	
	@RequestMapping(value = "/empList.do")
	public String selectEmpList(ModelMap model) throws Exception {
		List<?> empList = empService.selectEmpList();
		model.addAttribute("resultList", empList);
		return "emp/empList";
	}
	
	@RequestMapping(value = "/empWrite.do")
	public String empWrite() {
		return "emp/empWrite";
	}
	
	@RequestMapping(value = "/empWriteSave.do")
	public String empWriteSave(EmpVO vo) throws Exception {
		empService.insertEmp(vo);
		return "";
	}
	
	@RequestMapping(value = "/empDetail.do")
	public String selectEmpDetail(int empno, ModelMap model) throws Exception {
		EmpVO vo = empService.selectEmpDetail(empno);
		model.addAttribute("empVO", vo);

		return "emp/empDetail";
	}
}
