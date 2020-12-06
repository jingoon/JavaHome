package com.naver;


import java.util.Scanner;

public class InsertCommand implements Command{
	
	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		
		System.out.println("�޴��� ����ּ���");
		System.out.println("1.�Է�, 2.�������� ������ �Է� ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		switch (menu) {
		case 1:
		System.out.println("ȸ�������� ȯ���մϴ�.");
		System.out.println("���̵� �Է��� �ּ���.");
		String member_id = sc.nextLine();
		System.out.println("��й�ȣ�� �Է��� �ּ���.");
	    String member_pw= sc.nextLine();
		System.out.println("�̸��� �Է��� �ּ���.");
		String member_name = sc.nextLine();
		System.out.println("��������� �Է����ּ���.");
		String member_birth = sc.nextLine();
		System.out.println("�̸����� �Է����ּ���.");
		String member_email = sc.nextLine();
		
		MemberDTO dto = new MemberDTO(member_id, member_pw, member_name, member_birth, member_email);
		
		dao.insert(dto);
			
			break;

		case 2:
		System.out.println("ȸ�������� ȯ���մϴ�.");
		System.out.println("���̵� �Է��� �ּ���.");
		String member_id2 = sc.nextLine();
		System.out.println("��й�ȣ�� �Է��� �ּ���.");
	    String member_pw2= sc.nextLine();
		System.out.println("�̸��� �Է��� �ּ���.");
		String member_name2 = sc.nextLine();
		System.out.println("�̸����� �Է����ּ���.");
		String member_email2 = sc.nextLine();
		MemberDTO dto2 = new MemberDTO(member_id2, member_pw2, member_name2, member_email2);
		dao.NoBirthInsertCommand(dto2);
	
			break;
		}
		
		
			
	}
	@Override
	public String toString() {
		return "1.�Է�, ";
	}
	
	
}
