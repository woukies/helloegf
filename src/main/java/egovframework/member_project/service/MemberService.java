package egovframework.member_project.service;

public interface MemberService {
	int loginMember(MemberVO vo) throws Exception;

	int insertMember(MemberVO vo) throws Exception;
	
}
