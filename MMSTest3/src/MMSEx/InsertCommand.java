package MMSEx;

import java.util.Scanner;

public class InsertCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("id�� �Է��ϼ���");
		String id =sc.nextLine();
		System.out.println("�̸��� �Է��ϼ���");
		String name= sc.nextLine();
		System.out.println("���ϸ� �Է��ϼ���");
		String birth = sc.nextLine();
		
		DB.db.add(new MemberDTO(id, name, birth));
	}

	@Override
	public String toString() {
		return "1: �Է�";
	}
	

}
