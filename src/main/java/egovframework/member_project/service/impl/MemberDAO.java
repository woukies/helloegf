package egovframework.member_project.service.impl;

import org.springframework.stereotype.Repository;

import egovframework.member_project.service.MemberVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("memberDAO")
public class MemberDAO extends EgovAbstractDAO {
	public int loginMember(MemberVO vo) {
		try {
			MemberVO loginMember = (MemberVO) select("memberDao.selectMemberDetail", vo.getMem_uid());
			if (loginMember.getMem_pwd().equals(vo.getMem_pwd())) {
				return 1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			return -1;
		}
	}

	public String insertMember(MemberVO vo) throws Exception {
		return (String) insert("memberDao.insertMember", vo);
	}
}
