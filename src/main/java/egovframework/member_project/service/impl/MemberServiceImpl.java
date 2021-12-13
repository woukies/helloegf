package egovframework.member_project.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.member_project.service.MemberService;
import egovframework.member_project.service.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name = "memberDAO")
	private MemberDAO memberDAO;

	@Override
	public int loginMember(MemberVO vo) throws Exception {
		MemberVO loginMember = memberDAO.loginMember(vo);
		if (loginMember == null) {
			return -1;
		} else if (loginMember.getMem_pwd().equals(vo.getMem_pwd())) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public int insertMember(MemberVO vo) throws Exception {
		if (memberDAO.insertMember(vo) == null) {
			return 1;
		} else {
			return -1;
		}
	}

}