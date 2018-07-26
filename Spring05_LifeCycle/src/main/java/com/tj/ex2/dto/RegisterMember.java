package com.tj.ex2.dto;
// 등록 받을 때 
public class RegisterMember {
	private String enmail;
	private String name;
	private String pw;
	private String confirmPw;
	
	public RegisterMember () {}
	
	public RegisterMember(String enmail, String name, String pw, String confirmPw) {
		this.enmail = enmail;
		this.name = name;
		this.pw = pw;
		this.confirmPw = confirmPw;
	}
		
	public boolean confirmPw() { // 비번이 일치 여부
		return pw.equals(confirmPw);
	}

	@Override
	public String toString() {
		return "가입회원 : [enmail=" + enmail + ", name=" + name + ", pw=" + pw + ", confirmPw=" + confirmPw + "]";
	}

	public String getEnmail() {
		return enmail;
	}

	public void setEnmail(String enmail) {
		this.enmail = enmail;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getConfirmPw() {
		return confirmPw;
	}

	public void setConfirmPw(String confirmPw) {
		this.confirmPw = confirmPw;
	}
	
}
