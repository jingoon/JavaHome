package SQL;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execut(Scanner sc) {
		
		System.out.println("수정 할 아이디를 입력하세요");
		String id = sc.nextLine();
		System.out.println("새로운 이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("새로운 나이를 입력하세요");
		int age = sc.nextInt();
		sc.nextLine();
			
		int index =DB.db.indexOf(new MemberDTO(id, null, 0));
		DB.db.set(index, new MemberDTO(id, name, age));
	}
	@Override
	public String toString() {
		return "3 수정";
	}

}
