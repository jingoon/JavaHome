package RandomExmple;

import java.util.Random;

public class RandomEx {
	
	public void me1() {
		//0~1미만 랜덤 숫자
		Random r = new Random();
		int j = r.nextInt(1);
		System.out.println(j);
	}
	
	public void me2() {
		// 3에서 10까지 랜덤 숫자 뽑기
		Random r = new Random();
		int j = r.nextInt(8)+3;
		System.out.println(j);
		//start 0 ->0+ 3 
		//last 10+1 ->n +3  //10미만까지 이므로 10을 포함하려면 +1
		//last n= 10+1-3 
	}
	public void me3(int start, int last) {
		Random r = new Random();
		int j = r.nextInt(last-start+1)+3;
		System.out.println(j);
		
	}
	public void me4() {
		Random r1 = new Random(100);// 랜덤씨드 100
		Random r2 = new Random(100);
		int j1 = r1.nextInt(100);	// last 숫자 100
		int j2 = r2.nextInt(100);
		System.out.println(j1);
		System.out.println(j2);
		// 랜덤이지만 랜덤이 아님.
	}

}
