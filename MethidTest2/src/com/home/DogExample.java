package com.home;

public class DogExample {
	public static void main(String[] args) {
		
	// �޼��� 4���� ȣ��
		
	Dog hot = new Dog();
		
	// 1. void(return �� ����), �Ű����� ����
	hot.me1();
		
	// 2. void(return �� ����), �Ű����� ����
	hot.me2("�ֵ���", 2);
	
	// 3. return(�����ڷ���) ����, �Ű����� ����
	Dog hotDog = hot.me3();
	
	// 4.return(������) ����, �Ű����� ����
	int size1 = hot.me4("������");
	int size2 = hot.me4(new String("������"));
	
	System.out.println("size1: "+size1);
	System.out.println("size1: "+size2);
	}

}
