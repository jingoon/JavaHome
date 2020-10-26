package com.home;

public class Dog {
	private String gaName;
	private boolean no;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	

	public Dog(boolean no) {
		
		this.no = no;
	}
	
	public String dogInfo() {
		if(no) {
			String a = gaName;
			return a;
		}
		String b = "°³¾øÀ½";
		return b;
		
	}


	public boolean isNo() {
		return no;
	}


	public void setNo(boolean no) {
		this.no = no;
	}


	public Dog(String gaName) {
		super();
		this.gaName = gaName;
	}

	public String getGaName() {
		return gaName;
	}

	public void setGaName(String gaName) {
		this.gaName = gaName;
	}
	
	

}
