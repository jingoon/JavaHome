package book.home_013;

public class Coffee2Main {
	public static void main(String[] args) {
		
		int myMoneyA = 800;
		int cupsA = Coffee2Main.coffee(myMoneyA);
		Coffee2Main.printCoffee(cupsA);
		
		int myMoneyB =200;
		int cupsB = coffee(myMoneyB);
		printCoffee(cupsB);
	}//main
	
	public static int coffee(int money) {
		int cups = 0;
		
		if(money>0) {
			cups=money/200;
		}else if(money==0) {
			cups=0;
		}else {
			cups = -1;
		}
		return cups;
	}// coffee
	
	public	static void printCoffee(int cups) {
		if(cups>0) {
			System.out.println(String.format("커피 %d잔 입니다", cups));
			
		}else {
			System.out.println("액수가 모자랍니다.");
		}
	}// printCoffee

}

