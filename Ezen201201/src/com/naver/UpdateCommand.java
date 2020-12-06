package com.naver;

import java.util.List;
import java.util.Scanner;

public class UpdateCommand implements Command{
	
	MemberDTO dto=null;	
	MemberDAO dao= new MemberDAO();
	@Override
	public void execute(Scanner sc) {
		//1번호,2아이디
		System.out.println("1.회원번호로 수정  2.회원아이디로 수정");
		int k =sc.nextInt();
		sc.nextLine();
		if(k==1) {
			System.out.println("수정할 회원번호를 입력하세요");
			dto = num(sc);
		}else{
			System.out.println("수정할 아이디를 입력하세요");
			dto = id(sc);
		}
		//이름수정
		String member_name= member_name(sc);
		//생일수정
		String member_birth = member_birth(sc);
		//메일수정
		String member_email = member_email(sc);
		dto = new MemberDTO(dto.getMember_num(), dto.getMember_id(), dto.getMember_pw(), member_name, member_birth, member_email);
		dao.update(dto);
	
	}
	
	public MemberDTO num(Scanner sc) {
		int member_num= sc.nextInt();
		sc.nextLine();
		MemberDTO dto = dao.selectByNum(member_num);
		if(dto==null) { // 회원번호가 없을때 
			List<MemberDTO>list = dao.select();
			for (int i = 0; i < list.size(); i++) {
				int num= list.get(i).getMember_num();
				String name=list.get(i).getMember_name();
				String birth= list.get(i).getMember_birth();
				System.out.println("회원번호:"+num+" 이름:"+name+" 생년월일:"+birth);
			}
			System.out.println("회원번호를 확인하고 수정할 회원번호를 입력하세요.");
			member_num= sc.nextInt();
			sc.nextLine();
			dto = dao.selectByNum(member_num);
		}
		return dto;
	}
	
	public MemberDTO id(Scanner sc) {
		String member_id= sc.nextLine();
		MemberDTO dto = dao.selectByEquelId(member_id);
		if(dto==null) { // 회원id가 없을 때 
			List<MemberDTO>list = dao.select();
			for (int i = 0; i < list.size(); i++) {
				String id= list.get(i).getMember_id();
				String name=list.get(i).getMember_name();
				String birth= list.get(i).getMember_birth();
				System.out.println("회원아이디:"+id+" 이름:"+name+" 생년월일:"+birth);
			}
			System.out.println("회원아이디를 확인하고 수정할 ID를 입력하세요.");
			member_id= sc.nextLine();
			dto = dao.selectByEquelId(member_id);
		}
		return dto;
	}
	
	public String member_name(Scanner sc) {
		String member_name="";
		System.out.println("회원번호: "+dto.getMember_num()+" 의 이름을 변경하시겠습니까?( Y , N )");
		String y = sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.println("새로운 이름을 입력하세요");
			member_name = sc.nextLine();
		}else {
			member_name = dto.getMember_name();
		}
		return member_name;
	}
	
	public String member_birth(Scanner sc) {
		String member_birth="";
		System.out.println("회원번호: "+dto.getMember_num()+" 의 생일을 변경하시겠습니까?( Y , N )");
		String y = sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.println("새로운 생일(이전 생일:"+dto.getMember_birth()+")을 입력하세요");
			member_birth = sc.nextLine();
			// 첫번째 - 앞 substring year
			// - - 사이 month
			// 마지막 - 뒤 date
			//split
		}else {
			member_birth = dto.getMember_birth();
		}
		return member_birth;
	}
	
	public String member_email(Scanner sc) {
		String member_email="";
		System.out.println("회원번호: "+dto.getMember_num()+" 의 email을 변경하시겠습니까?( Y , N )");
		String y = sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.println("새로운 email(이전 email: "+dto.getMember_email()+")을 입력하세요");
			member_email = sc.nextLine();
		}else {
			member_email = dto.getMember_email();
		}
		return member_email;
	}
	@Override
	public String toString() {
		return "3.수정, ";
	}

}
