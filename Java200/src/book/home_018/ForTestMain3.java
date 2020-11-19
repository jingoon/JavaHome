package book.home_018;

public class ForTestMain3 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println("["+i+"]");
		}
		System.out.println();
		int j=17;
		for(;;j+=2) {
			System.out.println("["+j+"]");
			//System.out.printf("{ %d }",j);
			if(j>30) {
				break;
			}
		}
		System.out.println("\n for문 결과 : "+j );
		//System.out.printf("%n for문 결과 : %d%n",j);
	}

}
