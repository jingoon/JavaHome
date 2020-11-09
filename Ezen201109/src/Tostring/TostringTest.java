package Tostring;

public class TostringTest {
	
	public static void main(String[] args) {
		
		TostringA ts1 = new TostringA("안녕", "하세요");
		System.out.println(ts1);
		
		TostringB ts2 = new TostringB("안녕", "하세요");
		System.out.println(ts2);
		
		System.out.println(ts1.hashCode());		//int형
		System.out.println(ts1.equals(ts2));	//boolean형
		System.out.println(ts1.getA1().equals(ts2.getA1()));
		
	}

}
