package com.home;

public class TestFor {
	public static void main(String[] args) {
		
	
		for(int i=0; i<10;i++){			//0은 i++하기 전에 출력되는가?
		System.out.println(i);
		}
		
		System.out.println("-----------");
		
		for(int k=10; k<10; k++) {		//10은 출력되지 않았다.-
			System.out.println(k);
		}
		System.out.println("-----------");
		
		for(int t=10; t<=10; t++) {		//t<=10; 조건을 만족하면 초기값이 출력된후 t++가 된다.
			System.out.println(t);
		}
		System.out.println("-----------");
		
		for(int num=1; num<=10;num++) {		//for문의 변수는 반복횟수를 지정한다고 본다.
											//변수 자체를 출력하는데 의의를 두지 않음.
			System.out.println(num +"번째 출력.");
		
			
		}
	}

}
