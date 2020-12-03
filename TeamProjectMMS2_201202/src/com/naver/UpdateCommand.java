package com.naver;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UpdateCommand implements Command{
	
	MemberDTO dto=null;	
	MemberDAO dao= new MemberDAO();
	BirthCheck bc= new BirthCheck();
	@Override
	public void execute(Scanner sc) {
		//1��ȣ,2���̵�,3�̸�
		System.out.println("1.ȸ����ȣ �Է�,  2.ID �Է�,  3.�̸� �Է�");
		dto = new MemberDTO();
		int k =sc.nextInt();
		sc.nextLine();
		if(k==1) {
			System.out.println("������ ȸ����ȣ�� �Է��ϼ���");
			dto = num(sc);
		}else if(k==2){
			System.out.println("������ ���̵� �Է��ϼ���");
			dto = id(sc);
		}else if(k==3) {
			System.out.println("������ �̸��� �Է��ϼ���");
			dto = name(sc);
		}
		//�̸�����
		String member_name= member_name(sc);
		//���ϼ���
		String member_birth = member_birth(sc);
		//���ϼ���
		String member_email = member_email(sc);
		//��й�ȣ �ʱ�ȭ(�ӽù�ȣ�߱�)
		String member_pw =pw(sc);
		
		dto = new MemberDTO(dto.getMember_num(), dto.getMember_id(), member_pw, member_name, member_birth, member_email);
		dao.update(dto);
	
	}
	public String pw(Scanner sc) {
		System.out.println("��й�ȣ�� �ʱ�ȭ(�ӽú�й�ȣ�� ����) �Ͻðڽ��ϱ�( Y , N )");
		String reSetPW = null;
		Random rd = new Random(System.currentTimeMillis());
		String y= sc.nextLine();
		if(y.equalsIgnoreCase("y")){
			int num = rd.nextInt();
			reSetPW="ezen"+num;
			System.out.println("��й�ȣ: "+reSetPW+"�� ����Ǿ����ϴ�.");
			return reSetPW;
		}else {
			return dto.getMember_pw();
		}
	}
	
	public MemberDTO name(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		String member_name=sc.nextLine();
		List<MemberDTO>listName = dao.selectByName(member_name);
		if(listName.size()==0) {// ��ġ�ϴ� �̸��� ������
			List<MemberDTO>list = dao.select(); //��ü ���
			forList(list);  					//��ü��� ���
		}else if(listName.size()==1) { // �ߺ��Ǵ� �̸��� ������
			dto=listName.get(0);
			return dto;
		}else if(listName.size()>1) {	// �ߺ��Ǵ� �̸��� ������
			forList(listName);			// �ߺ��Ǵ� �̸� ��� ���
		}
		System.out.println("ȸ����ȣ�� Ȯ���ϰ� ������ [ȸ����ȣ]�� �Է��ϼ���");
		int member_num= sc.nextInt();
		sc.nextLine();
		dto = dao.selectByNum(member_num);
		return dto;
	}
	
	public MemberDTO num(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		int member_num= sc.nextInt();
		sc.nextLine();
		MemberDTO dto = dao.selectByNum(member_num);
		if(dto==null) { // ȸ����ȣ�� ������ 
			List<MemberDTO>list = dao.select(); //��ü ���
			forList(list);
			System.out.println("ȸ����ȣ�� Ȯ���ϰ� ������ [ȸ����ȣ]�� �Է��ϼ���.");
			member_num= sc.nextInt();
			sc.nextLine();
			dto = dao.selectByNum(member_num);
		}
		return dto;
	}
	
	public MemberDTO id(Scanner sc) {	// id ���� 
		MemberDAO dao = new MemberDAO();
		String member_id= sc.nextLine();
		MemberDTO dto = dao.selectByEquelId(member_id); // id��ġüũ
		if(dto==null) { // ȸ��id�� ���� �� 
			List<MemberDTO>listId=dao.selectByid(member_id);
			if(listId.size()!=0) {	//id like üũ ���
				forList(listId); 
			}else {					// id like�� ���� ��
				List<MemberDTO>list = dao.select();	// ��ü��� 
				forList(list);
			}
			System.out.println("ȸ�����̵� Ȯ���ϰ� ������ [ID]�� �Է��ϼ���.");
			member_id= sc.nextLine();
			dto = dao.selectByEquelId(member_id);
		}
		return dto;
	}
	
	public String member_name(Scanner sc) {
		String member_name="";
		System.out.println("ȸ����ȣ: "+dto.getMember_num()+" (�̸�:"+dto.getMember_name()+") �� �̸��� �����Ͻðڽ��ϱ�?( Y , N )");
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
		String member_birth=dto.getMember_birth();
		System.out.println("ȸ����ȣ: "+dto.getMember_num()+" (��� ����:"+dto.getMember_birth()+") �� ������ �����Ͻðڽ��ϱ�?( Y , N )");
		String y = sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.println("���ο� ������ �Է��ϼ���");
			member_birth = sc.nextLine();
			if(!bc.birthCheck(member_birth)) {
				System.out.println(member_birth+" ������ �߸� �Է��Ͽ����ϴ�. ������ ��ҵǾ����ϴ�");
				member_birth=dto.getMember_birth();
			}
		}
		
		return member_birth;
	}
	
	public String member_email(Scanner sc) {
		String member_email="";
		System.out.println("ȸ����ȣ:"+dto.getMember_num()+" (��� email: "+dto.getMember_email()+") �� email�� �����Ͻðڽ��ϱ�?( Y , N )");
		String y = sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.println("���ο� email�� �Է��ϼ���");
			member_email = sc.nextLine();
		}else {
			member_email = dto.getMember_email();
		}
		return member_email;
	}
	
	public void forList(List<MemberDTO> list){
		for (int i = 0; i < list.size(); i++) {
			int num= list.get(i).getMember_num();
			String id= list.get(i).getMember_id();
			String name=list.get(i).getMember_name();
			String birth= list.get(i).getMember_birth();
			System.out.println("ȸ����ȣ:"+num+" ȸ�����̵�:"+id+" �̸�:"+name+" �������:"+birth);
		}
	}
	
	@Override
	public String toString() {
		return "3.����, ";
	}

}
