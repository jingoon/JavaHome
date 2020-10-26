package com.home;

public class DogExample {
	public static void main(String[] args) {
		
	// 메서드 4유형 호출
		
	Dog hot = new Dog();
		
	// 1. void(return 값 없음), 매개변수 없음
	hot.me1();
		
	// 2. void(return 값 없음), 매개변수 있음
	hot.me2("핫도그", 2);
	
	// 3. return(참조자료형) 있음, 매개변수 없음
	Dog hotDog = hot.me3();
	
	// 4.return(정수형) 있음, 매개변수 있음
	int size1 = hot.me4("갓도그");
	int size2 = hot.me4(new String("갓도그"));
	
	System.out.println("size1: "+size1);
	System.out.println("size1: "+size2);
	}

}
