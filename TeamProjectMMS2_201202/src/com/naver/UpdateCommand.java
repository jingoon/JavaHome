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
		//1번호,2아이디,3이름
		System.out.println("1.회원번호 입력,  2.ID 입력,  3.이름 입력");
		dto = new MemberDTO();
		int k =sc.nextInt();
		sc.nextLine();
		if(k==1) {
			System.out.println("수정할 회원번호를 입력하세요");
			dto = num(sc);
		}else if(k==2){
			System.out.println("수정할 아이디를 입력하세요");
			dto = id(sc);
		}else if(k==3) {
			System.out.println("수정할 이름을 입력하세요");
			dto = name(sc);
		}
		//이름수정
		String member_name= member_name(sc);
		//생일수정
		String member_birth = member_birth(sc);
		//메일수정
		String member_email = member_email(sc);
		//비밀번호 초기화(임시번호발급)
		String member_pw =pw(sc);
		
		dto = new MemberDTO(dto.getMember_num(), dto.getMember_id(), member_pw, member_name, member_birth, member_email);
		dao.update(dto);
	
	}
	public String pw(Scanner sc) {
		System.out.println("비밀번호를 초기화(임시비밀번호로 저장) 하시겠습니까( Y , N )");
		String reSetPW = null;
		Random rd = new Random(System.currentTimeMillis());
		String y= sc.nextLine();
		if(y.equalsIgnoreCase("y")){
			int num = rd.nextInt();
			reSetPW="ezen"+num;
			System.out.println("비밀번호: "+reSetPW+"로 변경되었습니다.");
			return reSetPW;
		}else {
			return dto.getMember_pw();
		}
	}
	
	public MemberDTO name(Scanner sc) {
		MemberDAO dao = new MemberDAO();
		String member_name=sc.nextLine();
		List<MemberDTO>listName = dao.selectByName(member_name);
		if(listName.size()==0) {// 일치하는 이름이 없으면
			List<MemberDTO>list = dao.select(); //전체 목록
			forList(list);  					//전체목록 출력
		}else if(listName.size()==1) { // 중복되는 이름이 없으면
			dto=listName.get(0);
			return dto;
		}else if(listName.size()>1) {	// 중복되는 이름이 있으면
			forList(listName);			// 중복되는 이름 목록 출력
		}
		System.out.println("회원번호를 확인하고 수정할 [회원번호]를 입력하세요");
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
		if(dto==null) { // 회원번호가 없을때 
			List<MemberDTO>list = dao.select(); //전체 목록
			forList(list);
			System.out.println("회원번호를 확인하고 수정할 [회원번호]를 입력하세요.");
			member_num= sc.nextInt();
			sc.nextLine();
			dto = dao.selectByNum(member_num);
		}
		return dto;
	}
	
	public MemberDTO id(Scanner sc) {	// id 수정 
		MemberDAO dao = new MemberDAO();
		String member_id= sc.nextLine();
		MemberDTO dto = dao.selectByEquelId(member_id); // id일치체크
		if(dto==null) { // 회원id가 없을 때 
			List<MemberDTO>listId=dao.selectByid(member_id);
			if(listId.size()!=0) {	//id like 체크 목록
				forList(listId); 
			}else {					// id like도 없을 때
				List<MemberDTO>list = dao.select();	// 전체목록 
				forList(list);
			}
			System.out.println("회원아이디를 확인하고 수정할 [ID]를 입력하세요.");
			member_id= sc.nextLine();
			dto = dao.selectByEquelId(member_id);
		}
		return dto;
	}
	
	public String member_name(Scanner sc) {
		String member_name="";
		System.out.println("회원번호: "+dto.getMember_num()+" (이름:"+dto.getMember_name()+") 의 이름을 변경하시겠습니까?( Y , N )");
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
		String member_birth=dto.getMember_birth();
		System.out.println("회원번호: "+dto.getMember_num()+" (등록 생일:"+dto.getMember_birth()+") 의 생일을 변경하시겠습니까?( Y , N )");
		String y = sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.println("새로운 생일을 입력하세요");
			member_birth = sc.nextLine();
			if(!bc.birthCheck(member_birth)) {
				System.out.println(member_birth+" 생일을 잘못 입력하였습니다. 변경이 취소되었습니다");
				member_birth=dto.getMember_birth();
			}
		}
		
		return member_birth;
	}
	
	public String member_email(Scanner sc) {
		String member_email="";
		System.out.println("회원번호:"+dto.getMember_num()+" (등록 email: "+dto.getMember_email()+") 의 email을 변경하시겠습니까?( Y , N )");
		String y = sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.println("새로운 email을 입력하세요");
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
			System.out.println("회원번호:"+num+" 회원아이디:"+id+" 이름:"+name+" 생년월일:"+birth);
		}
	}
	
	@Override
	public String toString() {
		return "3.수정, ";
	}

}
