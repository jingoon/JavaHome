package MMSTest;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("id�� �Է��ϼ���");
		String id = sc.nextLine();
		System.out.println("name�� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("age�� �Է��ϼ���");
		int age = sc.nextInt();
		
		 MemberDTO dto= new MemberDTO(id, name, age);
		 DB.db.add(dto);
	}

}
