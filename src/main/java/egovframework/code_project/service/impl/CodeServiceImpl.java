package egovframework.code_project.service.impl;

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
}
