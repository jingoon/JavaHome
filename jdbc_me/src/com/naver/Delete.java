package com.naver;

import java.util.Scanner;

public class Delete implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("������ ���̵� �Է��ϼ���");
		String mid=sc.nextLine();
		MemberDAO dao = new MemberDAO();
		if(dao.selectBymid(mid)==null) {
			System.out.println("�������� �ʴ� mid �Դϴ�.");
			return;
		}
		dao.delete(mid);
	}

	@Override
	public String toString() {
		return "5.Delete";
	}
	

}
