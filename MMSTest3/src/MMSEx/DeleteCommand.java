package MMSEx;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ id�� �Է��ϼ���");
		String id=sc.nextLine();
		
		boolean ok=DB.db.remove(new MemberDTO(id, null, null));
		if(ok) {
			System.out.println("��������");
		}else {
			System.out.println("��������");
		}
	}

	@Override
	public String toString() {
		return "4: ����";
	}
	

}
