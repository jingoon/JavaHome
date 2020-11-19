package book.home_018;

public class ForTest4Main {
	public static void main(String[] args) {
		
		//등비수열 An+1 = r*An
		for (int i = 1; i < 20; i*=2) {
			System.out.println(i+" ");
		}
		System.out.println();
		//등차수열 An+1 = An+d
		for (int i=250; i>0; i-=50) {
			System.out.println(i+" ");
		}
		System.out.println();
		// An+1 = (3*An-2),A1=2
		for (int i=2;i<500;i=3*i-2) {
			System.out.println(i+" ");
		}
		System.out.println();
	}

}
