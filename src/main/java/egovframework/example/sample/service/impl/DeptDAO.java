package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.DeptVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("deptDAO")
public class DeptDAO extends EgovAbstractDAO {
	public String insertDept(DeptVO vo) throws Exception {
		return (String) insert("deptDao.insertDept", vo);
	}

	public List<?> selectDeptList() throws Exception {
		return list("deptDao.selectDeptList");
	}
	
	public DeptVO selectDeptDetail(int deptno) throws Exception {
		return (DeptVO) select("deptDao.selectDeptDetail", deptno);
	}
	
	public void deleteDept(int deptno) throws Exception {
		delete("deptDao.deleteDept", deptno);
	}
	
	public void updateDept(DeptVO vo) throws Exception {
		update("deptDao.updateDept", vo);
	}
}
