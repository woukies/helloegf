package egovframework.member_project.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.member_project.service.MemberVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("memberDAO")
public class MemberDAO extends EgovAbstractDAO {
	public MemberVO loginMember(MemberVO vo) throws Exception {
		return (MemberVO) select("memberDao.selectMemberDetail", vo.getMem_uid());
	}

	public String insertMember(MemberVO vo) throws Exception {
		return (String) insert("memberDao.insertMember", vo);
	}
}
