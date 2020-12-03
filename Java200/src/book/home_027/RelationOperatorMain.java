package book.home_027;

public class RelationOperatorMain {
	public static void main(String[] args) {
		
		int i=0;
		for(i=5;i<9;i++) {
			System.out.println(i+" ");
		}
		//i=9
		if(i>8) {
			System.out.println(i+"larger than 8");
		}else {
			System.out.println(i+"same to 8 or lesser than 8");
		}
		
		//3ÀÇ ¹è¼ö
		for (int j = 30; j >=1 ; j--) {
			if(j%3==0) {
				System.out.print("["+j+"]");
				//System.out.printf("[%d]",j);
			}
			
		}
		System.out.println();
		
		for(int j= 1;j<=30;j++) {
			if(j%3==0 && j%2!=0) {
				System.out.printf("[%d]",j);
			}
		}
		System.out.println();
		
		
		
	}

}
