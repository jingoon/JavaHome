package book.home_014;

public class Argument1Main {
	
	public static void main(String[] args) {
		int myMoney =500;
		int cups=coffee(myMoney,300);
		printCoffee(cups);
		
		int noChage=400;
		coffeeIn(noChage);
		System.out.print("main: ");
		System.out.println("noChage�� "+noChage+"��.");
		
		String sChage="park`c";
		coffeeIn(sChage);
		System.out.print("main: ");
		System.out.println("sChage�� "+sChage+"��.");
		
	}// main
	
	public static void coffeeIn(int money) {
		money+=300;
		money/=500;
		System.out.print("method coffeeIn: ");
		System.out.println("money�� "+money+"���̴�");
	}// coffeeIn
	
	public static void coffeeIn(String money) {		//immutable
		money=money.replace('o', 'z');				//�޼��� �ȿ����� �ٲ��
		money+="�ȳ�";								//�޼��� �ۿ����� �ٲ��� �ʴ´�.
		System.out.print("method coffeeIn: ");
		System.out.println(String.format("money�� %s��.", money));
	}//	coffeeIn
	
	public static int coffee(int money, int coffeeValue) {	//����
		if(coffeeValue<=100) {
			return -1;
		}
		int cups = -1;							//�� �� ���ñ� �غ�
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
			System.out.println("Ŀ��"+cups+"�� �Դϴ�.");
		}else {
			System.out.println("�׼��� ���ڶ��ϴ�.");
		}
	}//printCoffee

}
