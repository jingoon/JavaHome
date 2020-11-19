package kr.co.ezen;

import com.naver.Test;
import com.naver.Test2;
import com.naver.TestD;

public class MainEx {

	public static void main(String[] args) {

		Test t1 = new Test();
//		t1.me1();
//		long a =System.currentTimeMillis();
//		t1.me2();
//		long b =System.currentTimeMillis();
//		System.out.println(b-a);
//		t1.me3();
//		 a =System.currentTimeMillis();
//		t1.me4();
//		 b =System.currentTimeMillis();
//		 System.out.println(b-a);
//		t1.me5();
//		Test2 t2 = new Test2();
//		double a =System.currentTimeMillis();
//		t2.me1();
//		double b =System.currentTimeMillis();
//		System.out.println((b-a)/1000+"초");
//		t2.me2();
//		a =System.currentTimeMillis();
//		System.out.println((a-b)/1000+"초");
//		t2.me3();
//		b =System.currentTimeMillis();
//		System.out.println((b-a)/1000+"초");
//		t2.me4();
//		a =System.currentTimeMillis();
//		System.out.println((a-b)/1000+"초");
//		t2.me5();
//		b =System.currentTimeMillis();
//		System.out.println((b-a)/1000+"초");
		TestD  d = new TestD();
		double a = System.currentTimeMillis();
		d.me1();
		/* Stream의 구분법
		 	전송되는 데이터의 크기에 따라 구분
		 	1바이트씩 전송되는 바이트 스트림(~Stream)과
		 	2바이트씩 전송되는 문자 스트림(~er)
		 	
		 	특별한 기능여부에 따른 구분
		 	장치와 직접적으로 연결되는 노드스트림과
		 	기능을 부여하는 필터스트림
		
		*/
		t1.me6();
	
	}

}
