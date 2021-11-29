package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

	@Resource(name = "deptDAO")
	private DeptDAO deptDAO;
	
	@Override
	public String insertDept(DeptVO vo) throws Exception {
		return deptDAO.insertDept(vo);
	}

	@Override
	public List<?> selectDeptList() throws Exception {
		return deptDAO.selectDeptList();
	}

}
