package SQL;

import java.util.Scanner;

public class SelectCommand implements Command{

	@Override
	public void execut(Scanner sc) {
		System.out.println("��ϵ� ȸ���� ��ȸ�մϴ�");
		
		for (int i = 0; i < DB.db.size(); i++) {
			System.out.println(DB.db.get(i));
		}
		
		
		
	}

	@Override
	public String toString() {
		return "2 ��ȸ";
	}

}
