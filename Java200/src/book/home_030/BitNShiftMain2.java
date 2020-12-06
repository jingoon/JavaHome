package book.home_030;

public class BitNShiftMain2 {
	public static void main(String[] args) {
		int intNum1=123;
		int intNum2=-123;
		String s="00000000000000000000000001111011";
		System.out.println(binTo10("1111011"));
		System.out.println(binTo10(s));
	}
	
	//2진수 스트링을 10진수로 바꾸기(정해진 위치)
	private static int frBiTo10(String str, int a) {
		int temp1=1;
		int afterPase=Integer.valueOf(str);
		temp1=a>=1? afterPase<<a:afterPase>>(-a);
		
		return temp1;
	}
	
	//2진수로 되어 있는 수를 10진수로
	public static int binTo10(String str) {
		int nums=0;
		int count=str.length();
		for (int i = 0; i < count; i++) {
			nums+=frBiTo10(str.charAt(count-1-i)+"", i);
		}
		return nums;
	}
	
	
	
}
