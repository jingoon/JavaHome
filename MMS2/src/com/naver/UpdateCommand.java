package com.naver;

import java.util.Scanner;

public class UpdateCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("�̸� ������ �����մϴ�.");
		System.out.println("���̵� �Է��ϼ���.");
		String mid = sc.nextLine();
		
		System.out.println("�� �̸��� �Է��ϼ���.");
		String name = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(mid, name, null, null);
		
		MemberDAO dao = new MemberDAO();
		dao.update(dto);

	}
	
	@Override
	public String toString() {
		return "����";
	}
	

}
