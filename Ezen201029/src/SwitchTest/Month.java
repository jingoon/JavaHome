package SwitchTest;

public class Month {
	
	public Month() {
		// TODO Auto-generated constructor stub
	}
	
	public void month(int month) {
		if(month<=0 || month>=13) {
			System.out.println("1년은 1~12월까지");
			return;
		}
		
		switch (month) {
		case 2:
			System.out.println(month + "월은 28일까지 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 30일까지 입니다.");
			break;
		default:
			System.out.println(month + "월은 31일까지 입니다.");
			break;
		}
	}
	
	public void monthFor() {
		for(int i=1;i<=12;i++) {
			month(i);
		}
	}

}
