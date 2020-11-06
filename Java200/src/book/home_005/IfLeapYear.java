package book.home_005;

public class IfLeapYear {
	
	public static void main(String[] args) {
		
		for(int year= 1988;year<2020;year++) {
			boolean yearTF=false;
			if(0==(year%4)&&0 !=(year%100)||0==year%400) {
				yearTF = true;
			}else {
				yearTF = false;
			}
			
			if(yearTF) {
				System.out.println(year+"´Â À±³âÀÔ´Ï´Ù");
			}else {
				System.out.println(year+"´Â À±³âÀÌ ¾Æ´Õ´Ï´Ù");
			}
		}	
	}
}
