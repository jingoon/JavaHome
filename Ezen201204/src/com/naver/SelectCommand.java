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
			dao.print(list);
			break;
		case 2:
			//ȸ����ȣ��ȸ
			System.out.println("ȸ����ȣ�� �Է��ϼ���");
			int member_num=sc.nextInt();
			sc.nextLine();
			dto=dao.selectByNum(member_num);
			if(dto==null) {
				System.out.println("��ġ�ϴ� ȸ����ȣ�� �����ϴ�.");
			}else {
				dao.print(dto);
			}
			break;
		case 3:
			//id��ȸ
			System.out.println("ȸ�����̵� �Է��ϼ���");
			String member_id=sc.nextLine();
			list=dao.selectByid(member_id);
			if(list.size()==0) {
				System.out.println("��ġ�ϴ� ���̵� �����ϴ�.");
			}else {
				dao.print(list);
			}
			break;
		case 4:
			//�̸���ȸ
			System.out.println("ȸ���̸��� �Է��ϼ���");
			String member_name=sc.nextLine();
			list=dao.selectByName(member_name);
			if(list.size()==0) {
				System.out.println("��ġ�ϴ� ȸ���� �����ϴ�.");
			}else {
				dao.print(list);
			}
			break;
		case 5:
			System.out.println("ȸ���� ���̸� �Է��ϼ���");
		
			int member_age= sc.nextInt();
			sc.nextLine();
			list=dao.selectBybirth(member_age);
			if(list.size()==0) {
				System.out.println("ȸ�� �� "+member_age+"�� ȸ���� �����ϴ�");
				break;
			}
			dao.print(list);
			break;
		}
	}
	
	@Override
	public String toString() {
		return "��ȸ ";
	}
	
	
}
