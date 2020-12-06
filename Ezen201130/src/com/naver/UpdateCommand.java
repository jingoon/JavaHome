package com.naver;

import java.util.List;
import java.util.Scanner;

public class UpdateCommand implements Command{
	
	MemberDTO dto=null;	
	MemberDAO dao= new MemberDAO();
	@Override
	public void execute(Scanner sc) {
		
		System.out.println("1.ȸ����ȣ�� ����  2.ȸ�����̵�� ����");
		dto = new MemberDTO();
		int k =sc.nextInt();
		sc.nextLine();
		if(k==1) {
			System.out.println("������ ȸ����ȣ�� �Է��ϼ���");
			dto = num(sc);
		}else {
			System.out.println("������ ���̵� �Է��ϼ���");
			dto = id(sc);
		}
		String member_name= member_name(sc);
				
		String member_birth = member_birth(sc);
		
		String member_email = member_email(sc);
		
		dto = new MemberDTO(dto.getMember_num(), dto.getMember_id(), dto.getMember_pw(), member_name, member_birth, member_email);
		dao.update(dto);
	
	}
	
	public MemberDTO num(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		int member_num= sc.nextInt();
		sc.nextLine();
		MemberDTO dto = dao.selectByNum(member_num);
		if(dto==null) { // ȸ����ȣ�� ������ 
			List<MemberDTO>list = dao.select();
			for (int i = 0; i < list.size(); i++) {
				int num= list.get(i).getMember_num();
				String name=list.get(i).getMember_name();
				String birth= list.get(i).getMember_birth();
				System.out.println("ȸ����ȣ:"+num+" �̸�:"+name+" �������:"+birth);
			}
			System.out.println("ȸ����ȣ�� Ȯ���ϰ� ������ ȸ����ȣ�� �Է��ϼ���.");
			member_num= sc.nextInt();
			sc.nextLine();
			dto = dao.selectByNum(member_num);
		}
		return dto;
	}
	
	public MemberDTO id(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		String member_id= sc.nextLine();
		MemberDTO dto = dao.selectByid(member_id);
		if(dto==null) { // ȸ��id�� ���� �� 
			List<MemberDTO>list = dao.select();
			for (int i = 0; i < list.size(); i++) {
				String id= list.get(i).getMember_id();
				String name=list.get(i).getMember_name();
				String birth= list.get(i).getMember_birth();
				System.out.println("ȸ�����̵�:"+id+" �̸�:"+name+" �������:"+birth);
			}
			System.out.println("ȸ�����̵� Ȯ���ϰ� ������ ID�� �Է��ϼ���.");
			member_id= sc.nextLine();
			sc.nextLine();
			dto = dao.selectByid(member_id);
		}
		return dto;
	}
	
	public String member_name(Scanner sc) {
		String member_name="";
		System.out.println("ȸ����ȣ: "+dto.getMember_num()+" �� �̸��� �����Ͻðڽ��ϱ�?( Y , N )");
		String y = sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.println("���ο� �̸��� �Է��ϼ���");
			member_name = sc.nextLine();
		}else {
			member_name = dto.getMember_name();
		}
		return member_name;
	}
	
	public String member_birth(Scanner sc) {
		String member_birth="";
		System.out.println("ȸ����ȣ: "+dto.getMember_num()+" �� ������ �����Ͻðڽ��ϱ�?( Y , N )");
		String y = sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.println("���ο� ����(���� ����:"+dto.getMember_birth()+")�� �Է��ϼ���");
			member_birth = sc.nextLine();
		}else {
			member_birth = dto.getMember_birth();
		}
		return member_birth;
	}
	
	public String member_email(Scanner sc) {
		String member_email="";
		System.out.println("ȸ����ȣ: "+dto.getMember_num()+" �� email�� �����Ͻðڽ��ϱ�?( Y , N )");
		String y = sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.println("���ο� email(���� email: "+dto.getMember_email()+")�� �Է��ϼ���");
			member_email = sc.nextLine();
		}else {
			member_email = dto.getMember_email();
		}
		return member_email;
	}
	

	

		
		


	@Override
	public String toString() {
		return "3.���� ";
	}
	
	
	
	
	

}
