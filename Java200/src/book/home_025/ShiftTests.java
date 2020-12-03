package book.home_025;

public class ShiftTests {
	
	public static void main(String[] args) {
		System.out.println("12345678901234567890123456789012");
		
		System.out.println("1 :"+Integer.toBinaryString(65));
		System.out.println("2 :"+Integer.toBinaryString(-65));
		System.out.println("3 :"+Integer.toBinaryString(65-65));
		System.out.println("4 :"+Integer.toBinaryString(70));
		System.out.println("5 :"+Integer.toBinaryString(-70));
		System.out.println("6 :"+Integer.toBinaryString(~65));
		System.out.println("7 :"+Integer.toBinaryString(-65>>3));
		System.out.println("8 :"+Integer.toBinaryString(65^12));
		System.out.println("9 :"+Integer.toBinaryString(65&12));
		System.out.println("10:"+Integer.toBinaryString(65|12));
		System.out.println("11:"+Integer.toBinaryString(-65>>>3));
		System.out.println("12:"+Integer.toBinaryString(65>>3));
		System.out.println("13:"+Integer.toBinaryString(65<<3));
		
		System.out.println("14:"+Integer.toBinaryString(Integer.MAX_VALUE));
		System.out.println("15:"+Integer.toBinaryString(Integer.MIN_VALUE));
		System.out.println("---   -123     ---");
		for (int i = 0; i < 35; i++) {
			//System.out.println(Integer.toBinaryString(-123<<i));
			System.out.println(Integer.toBinaryString(-123>>i));
			//System.out.println(Integer.toBinaryString(-123>>(i%32)));
			
		}
	}

}
