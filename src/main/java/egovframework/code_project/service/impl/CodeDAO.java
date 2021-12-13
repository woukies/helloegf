package egovframework.code_project.service.impl;

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
}
