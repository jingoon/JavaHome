package kr.co.ezen;

import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
		Test t1 = new Test();
		t1.me1();
		t1.me2();
		t1.me3();
		t1.me4(100);
		try {
			t1.me5(100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("100을 입력했더니 문제가 발생했음.");
			
		}
		
		t1.me6(0);
		
		
		t1.me61();
		
		t1.me7("hi");
		//t1.me7("개새끼");
		// 가르칠 때도 윤리적/도덕적으로 가르쳐야 함..
		// 어쩔 수 없이 예를 격합니다.
		
		//t1.me71("개새끼");
		
		try {
			t1.me72("개새끼");
		} catch (Exception e) {
			System.out.println("욕설 금지");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
