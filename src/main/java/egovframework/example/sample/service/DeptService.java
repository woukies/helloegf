package egovframework.example.sample.service;

import java.util.List;

public interface DeptService {
	/**
	 * @param vo - 등록할 정보가 담긴 DeptVO
	 * @return 등록 결과
	 * @exception Exception
	 */
	String insertDept(DeptVO vo) throws Exception;
	
	/**
	 * 글 목록을 조회한다.
	 * @param vo - 조회할 정보가 담긴 DeptVO
	 * @return 글 목록
	 * @exception Exception
	 */
	List<?> selectDeptList() throws Exception;
	
	DeptVO selectDeptDetail(int deptno) throws Exception;
	
	void deleteDept(int deptno) throws Exception;
	
	void updateDept(DeptVO vo) throws Exception;
}
