package com.naver;

import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ id�� �Է��� �ּ���.");
		String id = sc.nextLine();
		
		boolean b = DB.db.remove(new MemberDTO(id, null, 0));
		
		if(b) {
			System.out.println(id+" ���� ����");
		}else {
			System.out.println(id+" ���� ����");
		}
		
	}

}
