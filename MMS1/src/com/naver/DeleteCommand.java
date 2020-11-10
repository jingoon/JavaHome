package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 id를 입력해 주세요.");
		String id = sc.nextLine();
		
		boolean b = DB.db.remove(new MemberDTO(id, null, 0));
		
		if(b) {
			System.out.println(id+" 삭제 성공");
		}else {
			System.out.println(id+" 삭제 실패");
		}
		
	}

}
