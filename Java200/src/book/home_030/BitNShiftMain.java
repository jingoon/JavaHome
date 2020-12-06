package book.home_030;

import static java.lang.Integer.toBinaryString;
public class BitNShiftMain {

	public static void main(String[] args) {
		int intNums1=123;
		int intNums2=-123;
		System.out.printf("%d :%s%n",intNums1,shifts(intNums1));
		System.out.printf("%d :%s%n",intNums1,toBinaryString(intNums1));
		System.out.printf("%d :%s%n",intNums2,shifts(intNums2));
		System.out.printf("%d :%s%n",intNums2,toBinaryString(intNums2));
	}

	public static String shifts(int a) {
		String s="";
		//int count=1;
		for(int i=0;i<=31;i++){
			int aa=a%2;
			s=(aa>=0)? aa+s:(-aa)+s;
			a>>=1;//a/=2
			
		}
		return s;
	}
}
