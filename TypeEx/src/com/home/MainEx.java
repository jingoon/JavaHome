package com.home;

public class MainEx {
	public static void main(String[] args) {
		
		// 변수, 기본자료형과 참조자료형
		
		// 기본자료형 - 논리자료형
		boolean boo = true;
		System.out.println(boo);
		boolean boo2 = false;	
		System.out.println(boo2);
			// 논리 자료형 boolean은 값으로 true와 false만 갖는다.
		
		// 기본자료형 - 정수자료형
		byte by = -128;				 // 1byte=8bit, 2^8(256)의 범위를 갖는다.
		System.out.println(by);
		
		short sh = -32768; 			 // 2byte, 2^16
		System.out.println(sh);
		
		int in = -2100000000;		 // 4byte, 2^32 정수의 기본자료형
		System.out.println(in);
		
		long lo = -2200000000L;		 // 8byte, 2^64, 값 뒤에 L/l을 적는다
		System.out.println(lo);
		
		// 기본자료형 - 실수자료형
		float fl = 3.14f;			 // 4byte, 값 뒤에 F/f을 적는다, double보다 정밀함이 떨어진다
		System.out.println(fl);
		
		double dol = 3.141592;		 // 8byte, 실수의 기본자료형 
		System.out.println(dol);
		
		
	}

}
