package book.home_031;

public class IntToChar {

	public static void main(String[] args) {
		for(int i=21;i<=60;i++) {
			System.out.print("["+(char)i+"]");
			if(i%10==0) {
				System.out.println();
			}
		}
		
		System.out.println('a');
		System.out.println('A');
		System.out.println("¾ËÆÄºª:"+('z'-'a'+1)+"ÀÚ");
		char cc ='ÇÑ';
		System.out.println(cc);
		System.out.println((int)cc);
		char zChar = '0';
		int count =(int)zChar;
		System.out.println(count);
		for(int i=count;i<=count+9;i++) {
			System.out.print("["+(char)i+"]");
		}
		System.out.println();
		
		System.out.println('\u0001');
		System.out.println('\1');
		System.out.println('\u0015');
		System.out.println('\25');
		for(int i=0;i<=39;i++) {
			System.out.print("["+(char)('\25'+i)+"]");
			if((i+1)%10==0) {
				System.out.println();
			}
		}
		System.out.println();
		
	}
	
}
