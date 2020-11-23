package MMSEx;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 id를 입력하세요");
		String id=sc.nextLine();
		
		boolean ok=DB.db.remove(new MemberDTO(id, null, null));
		if(ok) {
			System.out.println("삭제성공");
		}else {
			System.out.println("삭제실패");
		}
	}

	@Override
	public String toString() {
		return "4: 삭제";
	}
	

}
