package com.naver;

public class oDriver {
	private Command com;
	
	public oDriver() {
		try {
			Class.forName(com.DRIVER);
			System.out.println("����̹� ���� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� ���� ����");
			e.printStackTrace();
		}
	}

}
