package SwitchTest;

public class StudentScore {
	
	public StudentScore() {
		// TODO Auto-generated constructor stub
	}
	
	public void classScore(int score) {
		
		if(score<=0 || score>100) {
			System.out.println("��������");
			return;
		}
		char result = '��';
		switch (score/10) {
		case 10:
		case 9:
			result = '��';
			break;
		case 8:
			result = '��';
			break;
		case 7:
			result = '��';
			break;
		case 6:
			result = '��';
			break;

		default:
			result = '��';
			break;
		}
		System.out.println(result);
		
	}
	
}
