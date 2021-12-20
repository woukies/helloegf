package egovframework.code_project.service;

import java.util.List;

public interface CodeService {
	int insertCode(CodeVO vo) throws Exception;	
	List<?> selectCodeList() throws Exception;
	int selectCodeCount() throws Exception;
	int deleteCode(String code) throws Exception;
	CodeVO selectCode(String code) throws Exception;
	int updateCode(CodeVO vo) throws Exception;
}
