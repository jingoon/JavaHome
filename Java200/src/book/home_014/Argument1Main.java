package book.home_014;

public class Argument1Main {
	
	public static void main(String[] args) {
		int myMoney =500;
		int cups=coffee(myMoney,300);
		printCoffee(cups);
		
		int noChage=400;
		coffeeIn(noChage);
		System.out.print("main: ");
		System.out.println("noChage는 "+noChage+"다.");
		
		String sChage="park`c";
		coffeeIn(sChage);
		System.out.print("main: ");
		System.out.println("sChage는 "+sChage+"다.");
		
	}// main
	
	public static void coffeeIn(int money) {
		money+=300;
		money/=500;
		System.out.print("method coffeeIn: ");
		System.out.println("money는 "+money+"원이다");
	}// coffeeIn
	
	public static void coffeeIn(String money) {		//immutable
		money=money.replace('o', 'z');				//메서드 안에서만 바뀌고
		money+="안녕";								//메서드 밖에서는 바뀌지 않는다.
		System.out.print("method coffeeIn: ");
		System.out.println(String.format("money는 %s다.", money));
	}//	coffeeIn
	
	public static int coffee(int money, int coffeeValue) {	//선언
		if(coffeeValue<=100) {
			return -1;
		}
		int cups = -1;							//몇 잔 나올까 준비
		if(money>0) {
			cups=money/coffeeValue;
		}
		return cups;
	}// coffee
	
	public static int coffee(int money) {
		return coffee(money,200);
	}// coffee
	
	public static void printCoffee(int cups) {
		if(cups>0) {
			System.out.println("커피"+cups+"잔 입니다.");
		}else {
			System.out.println("액수가 모자랍니다.");
		}
	}//printCoffee

}
