package SwitchTest;

public class StudentScore {
	
	public StudentScore() {
		// TODO Auto-generated constructor stub
	}
	
	public void classScore(int score) {
		
		if(score<=0 || score>100) {
			System.out.println("성적오류");
			return;
		}
		char result = '수';
		switch (score/10) {
		case 10:
		case 9:
			result = '수';
			break;
		case 8:
			result = '우';
			break;
		case 7:
			result = '미';
			break;
		case 6:
			result = '양';
			break;

		default:
			result = '가';
			break;
		}
		System.out.println(result);
		
	}
	
}
