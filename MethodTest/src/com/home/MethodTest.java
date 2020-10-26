package com.home;

public class MethodTest {
	public MethodTest() {
		
	}
	
	//무반환 무파람 - hello
	public void printHello() {
		System.out.println("hello~");
	}
		
	//무반환 유파람1 - 이름
	public void printName(String name) {
		System.out.println(name);
	}
	//무반환 유파람2 - 이름과 점수
	public void printNameScore(String name, int score) {
		System.out.println(name + " " + score + "점");
	}
	//같은 클레스 호출
	public void call(String name1,String name2, int score) {
		printHello();
		printName(name1);
		printNameScore(name2, score);
		
	}

}
