package book.home_011;

public class FiveOperation {

	public static void main(String[] args) {
		
		int ia=20;
		int ib=67;
		
		double da=69.67;
		double db=34;			//int->double 프로모션 34.0
		int iResultA=ia+ib;
		int iResultB=ia-ib;
		int iResultC=ia*ib;
		int iResultD=ia/ib;		//몫
		int iResultE=ia%ib;		//나머지 mod
		
		System.out.println("1:"+iResultA);
		System.out.println("2:"+iResultB);
		System.out.println("3:"+iResultC);
		System.out.println("4:"+iResultD);
		System.out.println("5:"+iResultE);
		
		double dResultA=da/db;		//(da/db)*db=da
		double dResultB=da%db;		//???
		double dc=(da-db*((int)(da/db)));
		//da%db=(da-db*((int)(da/db)));
		System.out.println("6:"+dResultA);
		System.out.println("7:"+dResultB);
		System.out.println("8:"+dc);
		//짝수, 홀수
		int even=4%2;
		int odd=5%2;
		System.out.println("9:"+even);		//2로 나누어 나머지 0
		System.out.println("10:"+odd);		//2로 나누어 나머지 1
		
		
	}
}
