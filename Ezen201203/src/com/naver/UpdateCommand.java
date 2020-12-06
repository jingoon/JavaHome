package com.naver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpdateCommand implements Command{
	private MemberDAO dao = new MemberDAO();
	private MemberDTO dto =new MemberDTO();
	private boolean ing=true;
	private String member_pw;
	private String member_name;
	private String member_birth;
	private String member_email;
	
	@Override
	public void execute(Scanner sc) {
		System.out.println("ȸ�� ������ ���� �մϴ�.");
		System.out.print("���� �� ȸ���� ��ȸ (1.ȸ����ȣ �Է� 2.ȸ��ID �˻� 3.ȸ���̸� �˻�): ");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 3:
			List<MemberDTO>list = new ArrayList<MemberDTO>();
			while(ing) {// �̸��� �ϳ��� ��ġ�ϸ� �������� ���ų� 2�� �̻��̸� ������, �ݺ�
				
				System.out.print("������ ȸ�� �̸� �˻�: ");
				String member_name=sc.nextLine();
				list=name(member_name);
				if(list.size()==1) {
					dto=list.get(0);
					ing=false;
				}else if(list.size()>1){
					System.out.println("���� �̸��� �ֽ��ϴ� ȸ����ȣ�� �Է��ϼ���");
					ing=false;
				}
			}
			if(list.size()==1) {
				break;
			}
		case 1:
			ing=true;
			while(ing) {	// ȸ����ȣ�� ������ ��ü��� ��ȯ, �ٽ� �Է¹���
				System.out.print("������ ȸ�� ��ȣ: ");
				int member_num=sc.nextInt();
				sc.nextLine();
				dto=num(member_num);
				if(dto!=null) {
					ing=false;
				}else {
					System.out.println("[ȸ����ȣ]�� Ȯ���ϰ� �ٽ� �Է��ϼ���");
				}
			}
			
			break;
		default:
			ing=true;
			while(ing) { // id�� �Ϻ� �Է½� �ߺ��̶�� �ߺ����� ��� �� �ٽ� �Է¹���
				System.out.print("������ ȸ�� ID �˻�: ");
				String member_id=sc.nextLine();
				List<MemberDTO>list2=id(member_id);
				if(list2.size()==1) {
					dto=list2.get(0);
					ing=false;
				}else if(list2.size()>1){
					System.out.println("ȸ�����̵� Ȯ���ϰ� [ȸ�����̵�]�� �Է��ϼ���");
					System.out.print("������ ȸ�� ID: ");
					member_id=sc.nextLine();
					dto=dao.selectByEquelId(member_id);
					if(dto!=null) {
						ing=false;
					}
					System.out.println("�ٽ� Ȯ���ϰ� �Է��ϼ���");
				}
			}
			break;
		}
		System.out.println("ȸ����ȣ:"+dto.getMember_num()+", �̸�:"+dto.getMember_name()+"�� ������ �����մϴ�.");
		//��й�ȣ ����
		System.out.print("��й�ȣ("+dto.getMember_pw()+")�� �����ϰڽ��ϱ� (Y, N): ");
		String y= sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.print("�� ��й�ȣ�� �Է��ϼ���: ");
			 member_pw=sc.nextLine();
		}else {
			 member_pw=dto.getMember_pw();
		}
		//�̸� �Է�
		System.out.print("�̸�("+dto.getMember_name()+")�� �����ϰڽ��ϱ� (Y, N): ");
		y=sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.printf("�� �̸��� �Է��ϼ���: ");
			member_name=sc.nextLine();
		}else {
			member_name=dto.getMember_name();
		}
		//���� �Է�
		ing=true;
		System.out.print("����("+dto.getMember_birth()+")�� �����ϰڽ��ϱ� (Y, N): ");
		y=sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			while(ing) {
				System.out.print("�� �������(����:2020-12-03)�� �Է��ϼ���: ");
				member_birth=sc.nextLine();
				ing=!birth(member_birth); //ing =false �̸� ��������
				if(ing) {
					System.out.println("�Է��� �ùٸ��� �ʽ��ϴ�");
				}
			}
		}else {
			member_birth=dto.getMember_birth();
		}
		//email�Է�
		System.out.print("email("+dto.getMember_email()+")�� �����ϰڽ��ϱ� (Y, N): ");
		y=sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.print("�� email�� �Է��ϼ���: ");
			member_email=sc.nextLine();
		}else {
			member_email=dto.getMember_email();
		}
		System.out.print("���������� �����Ͻðڽ��ϱ� (Y, N): ");
		y=sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			dto = new MemberDTO(dto.getMember_num(), dto.getMember_id(), member_pw, member_name, member_birth, member_email);
			dao.update(dto);
			System.out.println("������ �Ϸ� �Ǿ����ϴ�");
		}else {
			System.out.println("������ ��ҵǾ����ϴ�.");
		}
	}
	
	// ���� ����üũ
	private boolean birth(String member_birth) {
		BirthCheck bc = new BirthCheck();
		return bc.birthCheck(member_birth);
	}
	// id �ߺ�,�� üũ
	private List<MemberDTO> id(String member_id) {
		List<MemberDTO> list=dao.selectByid(member_id);
		if(list.size()==0) {	// ��ġ ���̵� ������ 
			List<MemberDTO> listAll=dao.select();// ��ü��ȸ
			dao.print(listAll);		//��ü��� ���
		}else if(list.size()==1) {	// ��ġ���̵� 1�� �϶�
			dto=list.get(0);	
		}else {
			dao.print(list);	// ��ġ���̵� ������ �϶�
		}
		return list;
	}
	//ȸ����ȣ ��ġ üũ
	private MemberDTO num(int member_num) {
		MemberDTO dto = dao.selectByNum(member_num);
		if(dto==null) { // ȸ����ȣ�� ������ 
			List<MemberDTO>list = dao.select(); //��ü ���
			dao.print(list);
			return null;
		}else 
		return dto;
	}
	//�̸� �ߺ�,�� üũ
	private List<MemberDTO> name(String member_name) {
		List<MemberDTO>listName = dao.selectByName(member_name);
		if(listName.size()==0) {// ��ġ�ϴ� �̸��� ������
			List<MemberDTO>list = dao.select(); //��ü ���
			dao.print(list); 					//��ü��� ���
		}else if(listName.size()==1) { // �ߺ��Ǵ� �̸��� ������
			dto=listName.get(0);
		}else if(listName.size()>1) {	// �ߺ��Ǵ� �̸��� ������
			dao.print(listName);		// �ߺ��Ǵ� �̸� ��� ���
		}
		return listName;
	}


	@Override
	public String toString() {
		return "3.���� ";
	}
	
	

}
