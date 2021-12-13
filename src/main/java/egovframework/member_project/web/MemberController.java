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
	
	@RequestMapping("/memberLogin.do")
	public String loginMember() throws Exception {
		return "member/login";
	}
	
	@RequestMapping("/memberLoginOK.do")
	public String loginMemberOK() throws Exception {
		return "member/login_ok";
	}
	
	@RequestMapping(value = "/memberRegisterSave.do")
	public String insertMemberSave(MemberVO vo) throws Exception {
		if (memberService.insertMember(vo) > 0) {
			return "redirect:memberLogin.do";
		}
		return "redirect:memberRegister.do";
	}
	
	@RequestMapping("/memberLoginSave.do")
	public String loginMemberSave(MemberVO vo) throws Exception {
		if (memberService.loginMember(vo) > 0) {
			return "redirect:memberLoginOK.do";
		}
		return "redirect:memberLogin.do";
	}	
}
