package SwitchTestEx;

import SwitchTest.Month;
import SwitchTest.StudentScore;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Month month = new Month();
		month.month(0);
		month.month(13);
		month.month(2);
		System.out.println("-------");
		month.monthFor();

		StudentScore score = new StudentScore();
		score.classScore(101);
		score.classScore(0);
		score.classScore(-1);
		score.classScore(100);
		score.classScore(34);
	}

}
