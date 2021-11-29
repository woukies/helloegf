package egovframework.emp_project.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.emp_project.service.EmpVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("empDAO")
public class EmpDAO extends EgovAbstractDAO {
	public String insertEmp(EmpVO vo) throws Exception {
		return (String) insert("empDao.insertEmp", vo);
	}
}
