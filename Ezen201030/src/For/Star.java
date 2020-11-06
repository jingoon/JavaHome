package For;

public class Star {
	public Star() {
		// TODO Auto-generated constructor stub
	}
	/*	2. 피라미드 찍기
		2.1 정수를 넘겨받아 '*'를 n개 출력
		2.2 첫번째 줄 1개 두번째2개 3번째 3개 ... n번째 n개 출력
		2.3 1개 부터 점점 증가해서 n번째 부터 1개까지 감소하게 출력

	*/
	public void star(int num) {			//2.1
		for(int i=0;i<num;i++) {
			System.out.print('*');
		}
		System.out.println();
	}
	
	public void star2(int num) {		//2.2
		for(int i=0;i<num;i++) {
			star(i+1);
		}
	}
	
	public void star3(int num) {		//2.3
		for(int i=0;i<(num*2);i++) {
			if(i+1<num/2) {
				star(i+1);
			}else {
				star(num-i-1);
			}
		}
	}

}
