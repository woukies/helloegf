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
		return memberDAO.loginMember(vo);
	}

	@Override
	public String insertMember(MemberVO vo) throws Exception {
		return memberDAO.insertMember(vo);
	}

}