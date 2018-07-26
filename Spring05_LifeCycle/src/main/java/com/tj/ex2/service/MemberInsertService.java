package com.tj.ex2.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.tj.ex2.dao.MemberDao;
import com.tj.ex2.dto.Member;
import com.tj.ex2.dto.RegisterMember;

public class MemberInsertService implements IMemberInsert {
	
	@Autowired
	private MemberDao dao;
	
	@Override
	public int insert(RegisterMember registermember) {
		int result = 0;
		
		Member member = dao.selectByEmail(registermember.getEnmail());
		
		if (member != null) {
			System.out.println("중복된 메일은 가입불가");
		} else  {
			if (registermember.confirmPw()) {
				member = new Member();
				member.setEmail(registermember.getEnmail());
				member.setName(registermember.getName());
				member.setPw(registermember.getPw());
				member.setrDate(new Date());
				
				dao.insert(member);
				result = 1;
			}
		}
		
		return result;
	}

}
