package egovframework.member_project.service;

public interface MemberService {
	int loginMember(MemberVO vo) throws Exception;

	String insertMember(MemberVO vo) throws Exception;
	
}
