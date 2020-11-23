package SQL;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execut(Scanner sc) {
		System.out.println("삭제 할 아이디를 입력하세요");
		String id = sc.nextLine();
				
		int index = DB.db.indexOf(new MemberDTO(id, null, 0));
		DB.db.remove(index);
	}
	@Override
	public String toString() {
		return "4 삭제";
	}

}
