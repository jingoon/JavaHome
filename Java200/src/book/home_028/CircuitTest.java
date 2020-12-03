package book.home_028;

public class CircuitTest {
	
	public static void main(String[] args) {
		int ca=10;
		int temp=23;
		String say="hello";
		
		if((temp>ca) | ((say="y")=="hello")) {
			System.out.println("1:|"+say);
		}
		if((temp>ca) || ((say="l")=="hello")) {
			System.out.println("2:||"+say);
		}
		if((temp<ca)&((say="s")=="hello")) {
			System.out.println("3:&"+say);
		}else {
			System.out.println("3:& else:"+say);
		}
		if((temp<ca)&&((say="t")=="hello")) {
			System.out.println("4:&&"+say);
		}else {
			System.out.println("4:&& else:"+say);
		}
	}

}
