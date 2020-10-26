package com.home;

public class Dog {
	public Dog() {
		
	}
		
		// 메서드 기본 4유형 
	
	// 1. void(return 값 없음), 매개변수 없음
	public void me1() {
		
	}
	
	// 2. void(return 값 없음), 매개변수 있음
	public void me2(String name, int age) {
		
	}
	
	// 3. return(참조자료형) 있음, 매개변수 없음
	public Dog me3() {
		return new Dog();
	}
	
	// 4.return(정수형) 있음, 매개변수 있음
	public int me4(String name) {
		int size = name.length();
		return size;
	}

}
