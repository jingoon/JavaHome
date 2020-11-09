package book.home_013;

public class Coffee1Main {
	
	public static void main(String[] args) {
		
		int myMoney= 800 ;			//800원은 커피 몇 잔일까?
		int cups = 0;
		if(myMoney >0) {
			cups = myMoney/200;
			
		}else if(myMoney==0) {
			cups=0;
		}else {
			cups=-1;
		}
		
		if(cups>0) {
			System.out.println("커피"+cups+"잔 입니다.");
			//System.out.printf("커피 %d잔 입니다.%n", cups);
			//System.out.println(String.format("커피 %d잔 입니다", cups));
		}else {
			System.out.println("액수가 모자랍니다.");
		}
			
	}
	
	

}
