package com.naver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelectCommand implements Command{
	
	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO();
		List<MemberDTO>list = new ArrayList<MemberDTO>();
		System.out.println("1.��ü��ȸ, 2.ȸ����ȣ��ȸ, 3.���̵���ȸ, 4.�̸���ȸ, 5.������ȸ");
		int menu= sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			//��ü��ȸ
			list = dao.select();
			for (int i = 0; i < list.size(); i++) {
				dto= list.get(i);
				printDto(dto);
			}
			break;
		case 2:
			//ȸ����ȣ��ȸ
			System.out.println("ȸ����ȣ�� �Է��ϼ���");
			int member_num=sc.nextInt();
			sc.nextLine();
			dto=dao.selectByNum(member_num);
			
			try {
				printDto(dto);
			} catch (Exception e) {
				System.out.println("�������� �ʴ� ȸ����ȣ�Դϴ�");
			}
			break;
		case 3:
			//id��ȸ
			System.out.println("ȸ�����̵� �Է��ϼ���");
			String member_id=sc.nextLine();
			dto=dao.selectByid(member_id);
			if(dto==null) {
				System.out.println("�������� �ʴ� ȸ�����̵��Դϴ�");
				break;
			}
			printDto(dto);
			break;
		case 4:
			//�̸���ȸ
			System.out.println("ȸ���̸��� �Է��ϼ���");
			String member_name=sc.nextLine();
			list=dao.selectByName(member_name);
			if(list==null) {
				System.out.println("�������� �ʴ� ȸ���Դϴ�");
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				dto= list.get(i);
				printDto(dto);
			}
			break;
		default:
			System.out.println("ȸ���� ���̸� �Է��ϼ���");
		
			int member_age= sc.nextInt();
			sc.nextLine();
			list=dao.selectBybirth(member_age);
			if(list==null) {
				System.out.println("�������� �ʴ� ȸ���Դϴ�");
				break;
			}
			for (int i = 0; i < list.size(); i++) {
				dto= list.get(i);
				printDto(dto);
			}
		}
	}
	public void printDto(MemberDTO dto) {
		int num= dto.getMember_num();
		String id=dto.getMember_id();
		String name=dto.getMember_name();
		String birth=dto.getMember_birth();
		String email=dto.getMember_email();
		System.out.println("ȸ����ȣ:"+num+" ID:"+id+" �̸�:"+name+" �������:"+birth+" email:"+email);
		
	}
	
	@Override
	public String toString() {
		return "2.��ȸ ";
	}
	
	
}
