package egovframework.code_project.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.code_project.service.CodeVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("codeDAO")
public class CodeDAO extends EgovAbstractDAO {
	public String insertCode(CodeVO vo) throws Exception {
		// insert: 이상 없으면 null
		// update, delete: 적용 개수
		return (String) insert("codeDao.insertCode", vo);
	}
	
	public List<?> selectCodeList() throws Exception {
		return list("codeDao.selectCodeList");
	}
	
	public int selectCodeCount() throws Exception {
		return (int) select("codeDao.selectCodeCount"); 
	}

	public int deleteCode(String code) {
		return delete("codeDao.deleteCode", code);
	}

	public CodeVO selectCode(String code) {
		return (CodeVO) select("codeDao.selectCode", code);
	}

	public int updateCode(CodeVO vo) {
		return update("codeDao.updateCode", vo);
	}
}
