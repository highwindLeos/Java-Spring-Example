package com.tj.ex2.dao;

import java.util.Collection;

import com.tj.ex2.dto.Member;

public interface IMemberDao {

	public void insert(Member member); // 회원가입
	
	public Member selectByEmail(String email); // 멤버가져오기
	
	public void update(Member member); // 회원정보수정
	
	public Collection<Member> selectAll(); // 모든 회원 가져오기
	
	public void print(Member member); //회원 정보 1명 출력
	
}
