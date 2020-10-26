package com.home;

import java.sql.Time;

public class Dog {
	
	private int age;
	private String name;
	private Time birth;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}

	public String sleep(String where) {
		String sleep = where + "ø°º≠ ¿‹¥Ÿ.";
		
		return sleep;
	}
	public Dog(int age, String name, Time birth) {
		super();
		this.age = age;
		this.name = name;
		this.birth = birth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Time getBirth() {
		return birth;
	}

	public void setBirth(Time birth) {
		this.birth = birth;
	}
	
	

}
