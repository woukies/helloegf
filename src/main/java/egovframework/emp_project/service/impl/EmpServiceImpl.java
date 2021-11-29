package egovframework.emp_project.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.emp_project.service.EmpService;
import egovframework.emp_project.service.EmpVO;

@Service("empService")
public class EmpServiceImpl implements EmpService {

	@Resource(name = "empDAO")
	private EmpDAO empDAO;

	@Override
	public String insertEmp(EmpVO vo) throws Exception {
		return empDAO.insertEmp(vo);
	}

}
