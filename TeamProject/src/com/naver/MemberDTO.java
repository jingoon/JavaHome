package com.naver;

import java.io.Serializable;

public class MemberDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int member_num;
	private String member_id;
	private String member_pw;
	private String member_name;
	private String member_birth;
	
	
	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}


	public MemberDTO(int member_num, String member_id, String member_pw, String member_name, String member_birth) {
		super();
		this.member_num = member_num;
		this.member_id = member_id;
		this.member_pw = member_pw;
		this.member_name = member_name;
		this.member_birth = member_birth;
	}


	public int getMember_num() {
		return member_num;
	}


	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}


	public String getMember_id() {
		return member_id;
	}


	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}


	public String getMember_pw() {
		return member_pw;
	}


	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}


	public String getMember_name() {
		return member_name;
	}


	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}


	public String getMember_birth() {
		return member_birth;
	}


	public void setMember_birth(String member_birth) {
		this.member_birth = member_birth;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((member_id == null) ? 0 : member_id.hashCode());
		result = prime * result + member_num;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberDTO other = (MemberDTO) obj;
		if (member_id == null) {
			if (other.member_id != null)
				return false;
		} else if (!member_id.equals(other.member_id))
			return false;
		if (member_num != other.member_num)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "MemberDTO [member_num=" + member_num + ", member_id=" + member_id + ", member_name=" + member_name
				+ "]";
	}

	

	
	
	
}
