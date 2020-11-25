package com.naver;

public class oDriver {
	private Command com;
	
	public oDriver() {
		try {
			Class.forName(com.DRIVER);
			System.out.println("드라이버 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 연결 실패");
			e.printStackTrace();
		}
	}

}
