package MMSEx;

import java.util.Scanner;

public class UpdateCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("���� �� id�� �Է��ϼ���");
		String id =sc.nextLine();
		System.out.println("���ο� �̸��� �Է��ϼ���");
		String name= sc.nextLine();
		System.out.println("���ο� ������ �Է��ϼ���");
		String birth = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(id, name, birth);
		int index = DB.db.indexOf(dto);
		DB.db.set(index, dto);
		
	}

	@Override
	public String toString() {
		return "3: ����";
	}
	

}
