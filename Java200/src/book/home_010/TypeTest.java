package book.home_010;

public class TypeTest {

	public static void main(String[] args) {
		byte ba = 10;
		byte bb = 20;
		byte bc = 10 + 20;
		// byte bd= ba+bb; // 타입 캐스팅 에러
		byte be = (byte) (ba + bb); // (byte)(int+int)
		System.out.println("01:" + bc);
		System.out.println("02:" + be);

		short sa = 30;
		short sb = 50;
		short sc = 30 + 50;
		// short sd=sa+sb; // 타입 캐스팅 에러
		short se = (short) (sa + sb); // (shor)(int+int)
		System.out.println("03:" + sc);
		System.out.println("04:" + se);

		int ia = 20;
		int ib = 30;
		int ic = 20 + 30;
		int id = ic + sa;
		System.out.println("05:" + ic);

		long la = 40l;
		long lb = 50L;
		long lba = 50 + Integer.MAX_VALUE; // (int+int) -> 음수가 된다.
		long lbb = 50L + Integer.MAX_VALUE; // (long+int) -> 양수가 된다.
		long lc = la + lb; // (long+long)
		System.out.println("06:" + lba);
		System.out.println("07:" + lbb);
		System.out.println("08:" + lc);

		float fa = 45.0f;
		float fb = 46.67F;
		// float fc = 30.4; // F가 없으면 long 타입이 된다.
		float fd = 30; // int는 자동으로 float이 된다.
		float fe = fa + fb;

		double da = 12;
		double db = 45 + Float.MAX_VALUE;
		double dc = da + db;
		System.out.println("09:" + dc);

		System.out.println("10:" + "byte 범위:" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("11:" + "Short 범위:" + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("12:" + "int 범위:" + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("13:" + "long 범위:" + Long.MIN_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("14:"+"float 양의 범위"+Float.MIN_VALUE +"~"+Float.MAX_VALUE);
		System.out.println("15:"+"double 양의 범위"+Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		
	}

}
