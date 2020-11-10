package InterfaceTest;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		
		System.out.println("������ id�� �Է��ϼ���");
		String id = sc.nextLine();
		System.out.println("���ο� name�� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("���ο� age�� �Է��ϼ���");
		int age = sc.nextInt();
		
		MemberDTO dto = new MemberDTO(id, name, age);
		int idx=DB.db.indexOf(dto);
		DB.db.set(idx, dto);
		
	}

}
