package com.home;

public class MethodTest {
	public MethodTest() {
		
	}
	
	//����ȯ ���Ķ� - hello
	public void printHello() {
		System.out.println("hello~");
	}
		
	//����ȯ ���Ķ�1 - �̸�
	public void printName(String name) {
		System.out.println(name);
	}
	//����ȯ ���Ķ�2 - �̸��� ����
	public void printNameScore(String name, int score) {
		System.out.println(name + " " + score + "��");
	}
	//���� Ŭ���� ȣ��
	public void call(String name1,String name2, int score) {
		printHello();
		printName(name1);
		printNameScore(name2, score);
		
	}

}
