package SQL;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execut(Scanner sc) {
		
		System.out.println("���� �� ���̵� �Է��ϼ���");
		String id = sc.nextLine();
		System.out.println("���ο� �̸��� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("���ο� ���̸� �Է��ϼ���");
		int age = sc.nextInt();
		sc.nextLine();
			
		int index =DB.db.indexOf(new MemberDTO(id, null, 0));
		DB.db.set(index, new MemberDTO(id, name, age));
	}
	@Override
	public String toString() {
		return "3 ����";
	}

}
