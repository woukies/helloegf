package egovframework.code_project.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.code_project.service.CodeService;
import egovframework.code_project.service.CodeVO;

@Service("codeService")
public class CodeServiceImpl implements CodeService {

	@Resource(name = "codeDAO")
	private CodeDAO codeDAO;

	@Override
	public int insertCode(CodeVO vo) throws Exception {
		if (codeDAO.insertCode(vo) == null) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public List<?> selectCodeList() throws Exception {
		return codeDAO.selectCodeList();
	}

	@Override
	public int selectCodeCount() throws Exception {
		return codeDAO.selectCodeCount();
	}

	@Override
	public int deleteCode(String code) throws Exception {
		return codeDAO.deleteCode(code);
	}

	@Override
	public CodeVO selectCode(String code) throws Exception {
		return codeDAO.selectCode(code);
	}

	@Override
	public int updateCode(CodeVO vo) throws Exception {
		return codeDAO.updateCode(vo);
	}
}
