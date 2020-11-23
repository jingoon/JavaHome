package SQL;

import java.util.Scanner;

public class SelectCommand implements Command{

	@Override
	public void execut(Scanner sc) {
		System.out.println("등록된 회원을 조회합니다");
		
		for (int i = 0; i < DB.db.size(); i++) {
			System.out.println(DB.db.get(i));
		}
		
		
		
	}

	@Override
	public String toString() {
		return "2 조회";
	}

}
