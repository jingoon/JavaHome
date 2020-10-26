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
			String a="고양이없음";
			return a;
		}	String b= "무";
		return b;
	}
}
