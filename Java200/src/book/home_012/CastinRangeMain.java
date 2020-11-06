package book.home_012;

public class CastinRangeMain {
	public static void main(String[] args) {
		
		char cc ='ㄱ';
		System.out.println(cc);					//int d=cc;
		System.out.println((int)cc);			//int로 바꾸어 찍자.	
		cc='ㄴ';
		System.out.println(cc);					//char를 찍자
		System.out.println((int)cc);			//int로 바꿔 찍자
		cc='ㄷ';
		System.out.println(cc);					//char를 찍자
		System.out.println((int)cc);			//int로 바꿔 찍자.
		System.out.println("-----------------------");
		
		for(int i=1;i<=100;i++) {
			System.out.print((char)i +" ");	//찍고 그 자리 공백 추가
			//(char)i --> int를 char로 캐스팅
			if(i%10==0) {						//10으로 나누어 떨어지는가?
				System.out.println();			//한 줄을 내려라
			}
		}
		
	}

}
