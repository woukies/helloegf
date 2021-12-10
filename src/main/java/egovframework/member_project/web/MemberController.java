package egovframework.member_project.web;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.member_project.service.MemberService;
import egovframework.member_project.service.MemberVO;

@Controller
public class MemberController {
	@Resource(name = "memberService")
	private MemberService memberService;
	
	@RequestMapping("/memberRegister.do")
	public String insertMember() {
		return "member/register";
	}
	
	@RequestMapping(value = "/memberRegisterSave.do")
	public String insertMemberSave(MemberVO vo) throws Exception {
		if (memberService.insertMember(vo) == null) {
			return "redirect:memberLogin.do";
		}
		return "redirect:memberRegister.do";
	}
	
	@RequestMapping("/memberLogin.do")
	public String loginMember() throws Exception {
		return "member/login";
	}
	
	@RequestMapping("/memberLoginSave.do")
	public String loginMemberSave(MemberVO vo) throws Exception {
		if (memberService.loginMember(vo) > 0) {
			return "member/login_ok";
		}
		return "redirect:memberLogin.do";
	}	
}
