package book.home_029;

public class OperatorNumbering {
	
	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		int ye=2020;
		boolean zYear= ye%4==0 && ye%100!=0 || ye%400==0? true: false;
		System.out.println(4+5>>3);
		System.out.println(x+=5+6);
		System.out.println(++x- --y>>3);
		System.out.println(x+=5*6);
		System.out.println(4*5&7|3);
		System.out.println(y=x>20?45>>3+2*2-3:3%2);
		System.out.println(ye+"À±³â? =>"+zYear);
	}
	
		
}
