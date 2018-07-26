package com.tj.ex2.dao;

import java.util.Collection;
import java.util.HashMap;

import com.tj.ex2.dto.Member;

public class MemberDao implements IMemberDao {
	
	private HashMap<String , Member> dtos = new HashMap<String, Member>();
	private static int id = 0;

	@Override
	public void insert(Member member) {
		
		member.setId(++id);
		
		dtos.put(member.getEmail(), member);
	}

	@Override
	public Member selectByEmail(String email) {

		return dtos.get(email);
		
	}

	@Override
	public void update(Member member) {

		dtos.put(member.getEmail(), member);
		
	}

	@Override
	public Collection<Member> selectAll() {
				
		return dtos.values();
	}

	@Override
	public void print(Member member) {

		System.out.printf("이름 %s, \t메일 : %s, \tID : %d, \t등록일 : %TF, 패스워드 : %s\n",
				member.getName(), member.getEmail(), member.getId(), member.getrDate(), member.getPw());
		
	}

}
