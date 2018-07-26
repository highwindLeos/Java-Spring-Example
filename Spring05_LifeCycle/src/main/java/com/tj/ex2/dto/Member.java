package com.tj.ex2.dto;

import java.util.Date;

public class Member {
	
	private String email;
	private String name;
	private int id;
	private Date rDate;
	private String pw;
	
	public Member () {}

	public Member(String email, String name, int id, Date rDate, String pw) {
		this.email = email;
		this.name = name;
		this.id = id;
		this.rDate = rDate;
		this.pw = pw;
	}
	
	public int changePw (String oldPw, String newPw) {
		int result = 0;
		
		if (pw.equals(oldPw)) {
			pw = newPw;
			result = 1;
		} else {
			System.out.println("비밀번호가 맞아 변경 불가");
		}
		
		return result;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getrDate() {
		return rDate;
	}

	public void setrDate(Date rDate) {
		this.rDate = rDate;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	
}
