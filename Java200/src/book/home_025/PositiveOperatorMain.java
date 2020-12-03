package book.home_025;

public class PositiveOperatorMain {
	public static void main(String[] args) {
		
		int intTemp=-145;
		int intTemp2=+123;
		double doubTemp=-34.345;
		System.out.println(absol(intTemp));
		System.out.println(absol(doubTemp));
		int x1=3,y1=5;
		int x2=5,y2=1;
		System.out.println(rectLength(x1, y1, x2, y2));
		System.out.println(distance(x1, y1, x2, y2));
	}
	
	public static int absol(int intAbs) {
		return (intAbs >=0 ? intAbs: -intAbs);
				
	}
	public static double absol(double douabs) {
		return (douabs>=0.0 ? douabs : -douabs);
	}
	public static int rectLength(int a1, int b1, int a2, int b2) {
		return (absol(a1-a2)+absol(b1-b2));
	}
	public static double distance(int a1, int b1, int a2, int b2) {
		double x=absol(a1-a2);
		double y=absol(b1-b2);
		return Math.sqrt(x*x+y*y);
	}
	
	

}
