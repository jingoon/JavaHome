package com.home;

public class Cat {
	
	private boolean non;
	public Cat() {
		// TODO Auto-generated constructor stub
	}
	
	public Cat(boolean non) {
		super();
		this.non = non;
	}

	public String getCatInfo() {
		if(non) {
			String a="����̾���";
			return a;
		}	String b= "��";
		return b;
	}
}
