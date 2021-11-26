package egovframework.example.sample.service;

public interface DeptService {
	/**
	 * @param vo - 등록할 정보가 담긴 DeptVO
	 * @return 등록 결과
	 * @exception Exception
	 */
	String insertDept(DeptVO vo) throws Exception;
}
