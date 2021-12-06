package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Controller
public class DeptController {
	@Resource(name = "deptService")
	private DeptService deptService;

	@RequestMapping(value = "/deptList.do")
	public String selectDeptList(ModelMap model) throws Exception {
		List<?> deptList = deptService.selectDeptList();
		model.addAttribute("resultList", deptList);

		return "dept/deptList";
	}
	
	@RequestMapping(value = "/deptWrite.do")
	public String deptWrite() {
		return "dept/deptWrite";
	}

	@RequestMapping(value = "/deptWriteSave.do")
	public String deptWriteSave(DeptVO vo) throws Exception {
		deptService.insertDept(vo);
		return "";
	}
	
	@RequestMapping(value = "/deptDetail.do")
	public String selectDeptDetail(int deptno, ModelMap model) throws Exception {
		DeptVO vo = deptService.selectDeptDetail(deptno);
		model.addAttribute("deptVO", vo);

		return "dept/deptDetail";
	}
	
	@RequestMapping("/deptDelete.do")
	public String deleteDept(int deptno) throws Exception {
		deptService.deleteDept(deptno);
		
		return "forward:/deptList.do";
	}
	
	@RequestMapping("/deptModify.do")
	public String modifyDept(int deptno, ModelMap model) throws Exception {
		DeptVO vo = deptService.selectDeptDetail(deptno);
		model.addAttribute("deptVO", vo);
		
		return "dept/deptModify";
	}
	
	@RequestMapping("/deptModifySave.do")
	public String updateDept(DeptVO vo) throws Exception {
		deptService.updateDept(vo);
		
		return "redirect:/deptDetail.do?deptno=" + vo.getDeptno();
	}
}
