package SwitchTest;

public class Month {
	
	public Month() {
		// TODO Auto-generated constructor stub
	}
	
	public void month(int month) {
		if(month<=0 || month>=13) {
			System.out.println("1���� 1~12������");
			return;
		}
		
		switch (month) {
		case 2:
			System.out.println(month + "���� 28�ϱ��� �Դϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "���� 30�ϱ��� �Դϴ�.");
			break;
		default:
			System.out.println(month + "���� 31�ϱ��� �Դϴ�.");
			break;
		}
	}
	
	public void monthFor() {
		for(int i=1;i<=12;i++) {
			month(i);
		}
	}

}
