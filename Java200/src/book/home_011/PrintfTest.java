package book.home_011;

import java.util.*;

public class PrintfTest {

	public static void main(String[] args) {
		
		int a=20;
		long b=30000L;
		float c= 34.98f;
		double d=234.234;
		char e='k';
		Calendar today = Calendar.getInstance();
		System.out.println("1:"+a+""+b+""+c+""+d+""+e);		//개불편?
		System.out.printf("2:\\ %% %d %d %f %f %c %n",a,b,c,d,e);		//이건 햇갈리는데?
		
		System.out.printf("3:%1$d %1$d %2$c\n",a,97);
		System.out.printf("4:%1$h %1$o %1$x\n",a);
		System.out.printf("5:%f %1$a %1$e %1$f %1$g\n",65.8734543537);
		System.out.printf("6:Today %1$tm %1$te,%1$tY %n",today);
		System.out.printf("7:Today %1$tm %1$td,%1$ty %n",today);
		System.out.printf("8:Today %1$th %1$tI,%1$ta %n",today);
		System.out.printf("9:123456789012345678901234567890\n");
		System.out.printf("10:%1$20f\n",5678.3435453535);
		System.out.printf("11:%1$20.10f\n",5678.3435453535);
		System.out.printf("12:%1$-20.10f\n",5678.3435453535);
	}// argument_index$conversion
}
