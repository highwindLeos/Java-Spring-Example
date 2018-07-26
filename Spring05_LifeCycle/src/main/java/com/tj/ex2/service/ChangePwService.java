package com.tj.ex2.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tj.ex2.dao.MemberDao;
import com.tj.ex2.dto.Member;

public class ChangePwService implements IChangePw {
	
	@Autowired
	private MemberDao dao;

	@Override
	public int changePw(String email, String oldPw, String newPw) {
		int result = 0;
		
		Member member = dao.selectByEmail(email);
		
		if (member == null) {
			System.out.println("가입하지 않은 회원입니다.");
		} else {
			result = member.changePw(oldPw, newPw);
			if (result == 1) {
				dao.update(member); // 변경
			}
		}
		
		return result;
	}


}
