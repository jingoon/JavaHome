package book.home_017;

public class ifTest1 {
	public static void main(String[] args) {
		int year = 2020;
		if(year%2==0) {
			System.out.println(year+"�� ¦�� ���Դϴ�.");
		}else {
			System.out.println(year+"�� Ȧ�� ���Դϴ�.");
		}
		
		if(year%2!=1) {
			System.out.println(year+"�� ¦�� ���Դϴ�");
		}else {
			System.out.println(year+"�� Ȧ�� ���Դϴ�.");
		}
		
		if(((year%4)==0 && (year%100)!=0) ||(year%400==0)) {
			System.out.println(year+"���� �����Դϴ�.");
		}else {
			System.out.println(year+"���� ������ �ƴմϴ�.");
		}
			
	}

}
