package MMSEx;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("변경 할 id를 입력하세요");
		String id =sc.nextLine();
		System.out.println("새로운 이름을 입력하세요");
		String name= sc.nextLine();
		System.out.println("새로운 생일을 입력하세요");
		String birth = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, name, birth);
		int index = DB.db.indexOf(dto);
		DB.db.set(index, dto);
		
	}

	@Override
	public String toString() {
		return "3: 수정";
	}
	

}
