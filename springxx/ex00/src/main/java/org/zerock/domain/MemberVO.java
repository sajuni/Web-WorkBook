package org.zerock.domain;

import java.util.Date;

public class MemberVO {

	private String memberid;
	private String memberpwd;
	private String email;
	
	
	
	public MemberVO() {
	}



	public MemberVO(String memberid, String memberpwd, String email) {
		super();
		this.memberid = memberid;
		this.memberpwd = memberpwd;
		this.email = email;
	}



	public String getMemberid() {
		return memberid;
	}



	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}



	public String getMemberpwd() {
		return memberpwd;
	}



	public void setMemberpwd(String memberpwd) {
		this.memberpwd = memberpwd;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "MemberVO [memberid=" + memberid + ", memberpwd=" + memberpwd + ", email=" + email + "]";
	}
	
	
	
	
	
}
