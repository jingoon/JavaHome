package MMSEx;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("id를 입력하세요");
		String id =sc.nextLine();
		System.out.println("이름을 입력하세요");
		String name= sc.nextLine();
		System.out.println("생일를 입력하세요");
		String birth = sc.nextLine();
		
		DB.db.add(new MemberDTO(id, name, birth));
	}

	@Override
	public String toString() {
		return "1: 입력";
	}
	

}
