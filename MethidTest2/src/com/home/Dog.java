package com.home;

public class Dog {
	public Dog() {
		
	}
		
		// �޼��� �⺻ 4���� 
	
	// 1. void(return �� ����), �Ű����� ����
	public void me1() {
		
	}
	
	// 2. void(return �� ����), �Ű����� ����
	public void me2(String name, int age) {
		
	}
	
	// 3. return(�����ڷ���) ����, �Ű����� ����
	public Dog me3() {
		return new Dog();
	}
	
	// 4.return(������) ����, �Ű����� ����
	public int me4(String name) {
		int size = name.length();
		return size;
	}

}
