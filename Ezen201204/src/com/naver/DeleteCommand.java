package com.naver;

import java.util.List;
import java.util.Scanner;

public class DeleteCommand implements Command{

	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = null;
		System.out.println("1.���̵�� ����, 2.ȸ����ȣ�� ����, 3.�̸����� ����");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:
			System.out.println("���̵� �Է����ּ���");
			String member_id = sc.nextLine();
			dto=dao.selectByEquelId(member_id);
			if(dto==null) {
				System.out.println("���� ����: ��ġ�ϴ� ���̵� �����ϴ�");
			}else {
				dao.delete(dto);
				System.out.println(member_id+"�� �����Ǿ����ϴ�.");
			}
			break;

		case 2:
			System.out.println("ȸ����ȣ�� �Է����ּ���");
			int member_num = sc.nextInt();
			sc.nextLine();
			dto=dao.selectByNum(member_num);
			if(dto==null){
				System.out.println("���� ����: ��ġ�ϴ� ȸ����ȣ�� �����ϴ�");
			}else {
				dao.delete(dto);
				System.out.println(member_num+"�� �����Ǿ����ϴ�.");
			}
			break;
		case 3:
			System.out.println("�̸��� �Է����ּ���");
			String member_name=sc.nextLine();
			List<MemberDTO>list=dao.selectByName(member_name);
			if(list.size()==0) {
				System.out.println("���� ȸ���Դϴ�");
			}else if(list.size()==1) {
				dto=list.get(0);
				dao.delete(dto);
				System.out.println("ȸ��"+member_name+"�� �����Ǿ����ϴ�.");
			}else {
				System.out.println(list.size() + "���� �ߺ��� ȸ���� �����մϴ�.");
				System.out.println("��� ���� �Ͻðڽ��ϱ�?(Y, N)");
				String y = sc.nextLine();
				if (y.equalsIgnoreCase("y")) {
					for (int i = 0; i < list.size(); i++) {
						dto = list.get(i);
						dao.delete(dto);
					}
					System.out.println("ȸ��" + member_name + "�� " + list.size() + "�� �����Ǿ����ϴ�.");
				} else {
					System.out.println("������ ��� �Ǿ����ϴ�.");
				} 
			}
			break;
				
		}

	}

	@Override
	public String toString() {
		return "���� ";
	}
	
}
