package book.home_028;

public class LogicCalculTest {
	
	public static void main(String[] args) {
		
		boolean b1 =true;
		boolean b2 =false;
		
		System.out.println("		 P|Q P&Q P^Q !P");
		System.out.printf("1: [%b,%b]=%b %b %b %b %n",b1,b1,(b1|b1),(b1&b1),(b1^b1),(!b1));
		System.out.printf("2: [%b,%b]=%b %b %b %n",b1,b2,(b1|b2),(b1&b2),(b1^b2));
		System.out.printf("3: [%b,%b]=%b %b %b %b %n",b2,b2,(b2|b2),(b2&b2),(b2^b2),(!b2));
		System.out.printf("4: [%b,%b]=%b %b %b %n",b2,b1,(b2|b1),(b2&b1),(b2^b1));
	}

}
