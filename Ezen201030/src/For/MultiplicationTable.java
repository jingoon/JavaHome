package For;

public class MultiplicationTable {

	public MultiplicationTable() {
		// TODO Auto-generated constructor stub
	}
	/*
		3. 구구단 출력
		3.1입력받은 숫자 n단 출력
		3.2 n단을 호출한 1~9단까지 출력
		3.3 1~4단까지 가로로 출력 그 아래 5~9단까지 가로로 출력
	*/
	public void mTable(int num) {
		for(int i=1;i<10;i++) {		//곱셈은 1부터
			System.out.printf("%dX%d=%d%n",num,i,num*i);
		}
	}
	
	public void mTable2() {
		for(int i=2;i<10;i++){		//2단 부터
			System.out.println(i+"단");
			mTable(i);
		}
		
	}
	
	public void mTable3(int k, int n,int j) {  //k~n단까지
		for(int i=k;i<n;i++) {
			System.out.print(i+"x"+j+"="+(i*j)+"\t");
		}
		System.out.println();
			
		
	}
	public void mTable4() {
		for(int j=1;j<10;j++) {
			mTable3(2, 6, j);	//2~5단까지 
		}
		System.out.println();
		for(int j=1;j<10;j++) {	
			mTable3(6, 10, j);	//6~9단까지
		}
			
	}
}
