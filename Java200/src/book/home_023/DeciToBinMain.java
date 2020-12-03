package book.home_023;

public class DeciToBinMain {
	public static void main(String[] args) {
		
		int a=69;
		
		//integer.integer
		System.out.println("1:69 to 2진수		:"+Integer.toBinaryString(a));
		System.out.println("2:-69 to 2진수		:"+Integer.toBinaryString(-a));
		
		//Integer.toOctalString(int i)
		System.out.println("3:69 to 8진수		:"+Integer.toOctalString(a));
		System.out.println("4:-69 to 8진수		:"+Integer.toOctalString(-a));
		
		//Integer.toHexString(int i)
		System.out.println("5:69 to 16진수		:"+Integer.toHexString(a));
		System.out.println("6:-69 to 16진수		:"+Integer.toHexString(-a));
		
		//Double.toHexString(double d)
		System.out.println("7:65.65 to 16진수		:"+Double.toHexString(65.65));
		System.out.println("8:-65.65 to 16진수	:"+Double.toHexString(-65.65));
		
		Integer ide = Integer.decode("1");
		System.out.println("9:\t\t\t:"+ide.intValue());
		System.out.println("10:69 reverse\t\t:"+Integer.reverseBytes(a));
		
		System.out.printf("\t\t\t:01234567890123456789012345678901%n");
		System.out.printf("11:binary\t\t:%s%n",(Integer.toBinaryString(a)));
		
	}

}
