package book.home_015;
import static java.lang.Math.*;

public class MathTest2Main {
	public static void main(String[] args) {
		
		System.out.printf("1: log10(100) %-20.10f %n", Math.log10(100));
		System.out.printf("2: sinh(3) %-20.10f%n",sinh(3));
		System.out.printf("3: 모드1 %-10.5f%n",IEEEremainder(10.21,3.34));
		System.out.printf("4: 모드2 %-10.5f%n",10.21%3.34);
		System.out.printf("5: 모드3 %-10.5f%n",(10.21-3.34*((int)(10.21/3.34))));
		
		// 소수를 원하는 곳에서 반올림하기
		double d = 10.34567;
		System.out.printf("7:1:%10.6f%10.6f%n",d,olimAtNums(d, 1));
		System.out.printf("7:2:%10.6f%10.6f%n",d,olimAtNums(d, 2));
		System.out.printf("7:3:%10.6f%10.6f%n",d,olimAtNums(d, 3));
		System.out.printf("7:4:%10.6f%10.6f%n",d,olimAtNums(d, 4));
		
	
	
	}
	public static double olimAtNums(double d, int nums) {
		return ((int)((d*Math.pow(10, nums)+5/10.0))/Math.pow(10,nums-1));
	}

}
