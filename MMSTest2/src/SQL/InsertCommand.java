package SQL;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execut(Scanner sc) {
		System.out.println("���̵� �Է��ϼ���");
		String id = sc.nextLine();
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		sc.nextLine();
		
		DB.db.add(new MemberDTO(id, name, age));
		
	}

	@Override
	public String toString() {
		return "1 �Է�";
	}
	

}
