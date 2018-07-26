package com.tj.ex2.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.tj.ex2.dao.MemberDao;
import com.tj.ex2.dto.Member;

public class ListPrintService implements IListPrint {

	@Autowired
	private MemberDao dao;
		
	@Override
	public void printAll() {
		Collection<Member> dtos = dao.selectAll();
		
		if (dtos.size() == 0) {
			System.out.println("가입된 회원 정보가 없습니다.");
		} else {
			for (Member dto  : dtos) {
				dao.print(dto);
			}
		}
	}
	
}
