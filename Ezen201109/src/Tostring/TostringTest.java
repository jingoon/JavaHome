package Tostring;

public class TostringTest {
	
	public static void main(String[] args) {
		
		TostringA ts1 = new TostringA("�ȳ�", "�ϼ���");
		System.out.println(ts1);
		
		TostringB ts2 = new TostringB("�ȳ�", "�ϼ���");
		System.out.println(ts2);
		
		System.out.println(ts1.hashCode());		//int��
		System.out.println(ts1.equals(ts2));	//boolean��
		System.out.println(ts1.getA1().equals(ts2.getA1()));
		
	}

}
