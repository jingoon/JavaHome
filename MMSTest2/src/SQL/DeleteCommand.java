package SQL;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execut(Scanner sc) {
		System.out.println("���� �� ���̵� �Է��ϼ���");
		String id = sc.nextLine();
				
		int index = DB.db.indexOf(new MemberDTO(id, null, 0));
		DB.db.remove(index);
	}
	@Override
	public String toString() {
		return "4 ����";
	}

}
