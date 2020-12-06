package com.naver;

import java.util.Scanner;

public class InsertCommand_jin implements Command{

	private String member_id;
	private String member_name;
	private String member_pw;
	private String member_birth;
	private String member_email;
	private MemberDAO dao = new MemberDAO();
	private boolean ing=true;
	private int member_num;

	@Override
	public void execute(Scanner sc) {
		System.out.println("ȸ���Է��� �����մϴ�.");
		System.out.println();
		//id�Է�
		member_num=dao.maxNum()+1;
		while(ing) {
			System.out.printf("�� ID�� �Է��ϼ���: ");
			member_id=sc.nextLine();
			ing=id(member_id);
		}
		//pw�Է�
		System.out.printf("�� PASS WORD�� �Է��ϼ���: ");
		member_pw=sc.nextLine();
		//�̸� �Է�
		System.out.printf("�� �̸��� �Է��ϼ���: ");
		member_name=sc.nextLine();
		//���� �Է�
		ing=true;
		while(ing) {
			System.out.printf("�� �������(����:2020-12-03)�� �Է��ϼ���: ");
			member_birth=sc.nextLine();
			ing=!birth(member_birth);
			if(ing) {
				System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�");
			}
		}
		//email�Է�
		System.out.printf("�� email�� �Է��ϼ���: ");
		member_email=sc.nextLine();
		//�Է¿Ϸ�
		dao.insert(member_num, member_id, member_pw, member_name, member_birth, member_email);
		System.out.println("�Է��� �Ϸ� �Ǿ����ϴ�.");
	}
	// id �ߺ�üũ
	private boolean id(String member_id) {
		MemberDTO dto=dao.selectByEquelId(member_id);
		if(dto!=null) {
			System.out.println("����� �� ���� ���̵� �Դϴ�");
			return true;
		}else {
			return false;
		}
	}
	// ���� ����üũ
	private boolean birth(String member_birth) {
		BirthCheck bc = new BirthCheck();
		return bc.birthCheck(member_birth);
	}

	@Override
	public String toString() {
		return "1.�Է� ";
	}
	

}
