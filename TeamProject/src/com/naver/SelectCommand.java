package com.naver;

import java.util.Scanner;

public class SelectCommand implements Command{
	
	@Override
	public void execute(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		//ȸ����ȣ��ȸ
		//id��ȸ
		String member_id=sc.nextLine();
		dao.selectByid(member_id);
		//�̸���ȸ
		String member_name=sc.nextLine();
		dao.selectByNmae(member_name);
		//������ȸ
		//��������ȸ(��������,��������)
		//���ԱⰣ��ȸ(��� ��� ~ ��� ���)
	}
	@Override
	public String toString() {
		return "2.��ȸ ";
	}
	
	
}
