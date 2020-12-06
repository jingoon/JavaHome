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
		System.out.println("회원 정보를 수정 합니다.");
		System.out.print("수정 할 회원을 조회 (1.회원번호 입력 2.회원ID 검색 3.회원이름 검색): ");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 3:
			List<MemberDTO>list = new ArrayList<MemberDTO>();
			while(ing) {// 이름이 하나만 일치하면 수정으로 없거나 2개 이상이면 목록출력, 반복
				
				System.out.print("수정할 회원 이름 검색: ");
				String member_name=sc.nextLine();
				list=name(member_name);
				if(list.size()==1) {
					dto=list.get(0);
					ing=false;
				}else if(list.size()>1){
					System.out.println("같은 이름이 있습니다 회원번호를 입력하세요");
					ing=false;
				}
			}
			if(list.size()==1) {
				break;
			}
		case 1:
			ing=true;
			while(ing) {	// 회원번호가 없으면 전체목록 반환, 다시 입력받음
				System.out.print("수정할 회원 번호: ");
				int member_num=sc.nextInt();
				sc.nextLine();
				dto=num(member_num);
				if(dto!=null) {
					ing=false;
				}else {
					System.out.println("[회원번호]를 확인하고 다시 입력하세요");
				}
			}
			
			break;
		default:
			ing=true;
			while(ing) { // id의 일부 입력시 중복이라면 중복정보 출력 후 다시 입력받음
				System.out.print("수정할 회원 ID 검색: ");
				String member_id=sc.nextLine();
				List<MemberDTO>list2=id(member_id);
				if(list2.size()==1) {
					dto=list2.get(0);
					ing=false;
				}else if(list2.size()>1){
					System.out.println("회원아이디를 확인하고 [회원아이디]를 입력하세요");
					System.out.print("수정할 회원 ID: ");
					member_id=sc.nextLine();
					dto=dao.selectByEquelId(member_id);
					if(dto!=null) {
						ing=false;
					}
					System.out.println("다시 확인하고 입력하세요");
				}
			}
			break;
		}
		System.out.println("회원번호:"+dto.getMember_num()+", 이름:"+dto.getMember_name()+"의 정보를 수정합니다.");
		//비밀번호 변경
		System.out.print("비밀번호("+dto.getMember_pw()+")를 변경하겠습니까 (Y, N): ");
		String y= sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.print("◆ 비밀번호를 입력하세요: ");
			 member_pw=sc.nextLine();
		}else {
			 member_pw=dto.getMember_pw();
		}
		//이름 입력
		System.out.print("이름("+dto.getMember_name()+")을 변경하겠습니까 (Y, N): ");
		y=sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.printf("◆ 이름을 입력하세요: ");
			member_name=sc.nextLine();
		}else {
			member_name=dto.getMember_name();
		}
		//생일 입력
		ing=true;
		System.out.print("생일("+dto.getMember_birth()+")을 변경하겠습니까 (Y, N): ");
		y=sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			while(ing) {
				System.out.print("◆ 생년월일(예시:2020-12-03)을 입력하세요: ");
				member_birth=sc.nextLine();
				ing=!birth(member_birth); //ing =false 이면 빠져나감
				if(ing) {
					System.out.println("입력이 올바르지 않습니다");
				}
			}
		}else {
			member_birth=dto.getMember_birth();
		}
		//email입력
		System.out.print("email("+dto.getMember_email()+")을 변경하겠습니까 (Y, N): ");
		y=sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			System.out.print("◆ email을 입력하세요: ");
			member_email=sc.nextLine();
		}else {
			member_email=dto.getMember_email();
		}
		System.out.print("수정사항을 저장하시겠습니까 (Y, N): ");
		y=sc.nextLine();
		if(y.equalsIgnoreCase("y")) {
			dto = new MemberDTO(dto.getMember_num(), dto.getMember_id(), member_pw, member_name, member_birth, member_email);
			dao.update(dto);
			System.out.println("수정이 완료 되었습니다");
		}else {
			System.out.println("수정이 취소되었습니다.");
		}
	}
	
	// 생일 범위체크
	private boolean birth(String member_birth) {
		BirthCheck bc = new BirthCheck();
		return bc.birthCheck(member_birth);
	}
	// id 중복,널 체크
	private List<MemberDTO> id(String member_id) {
		List<MemberDTO> list=dao.selectByid(member_id);
		if(list.size()==0) {	// 일치 아이디가 없을때 
			List<MemberDTO> listAll=dao.select();// 전체조회
			dao.print(listAll);		//전체목록 출력
		}else if(list.size()==1) {	// 일치아이디가 1개 일때
			dto=list.get(0);	
		}else {
			dao.print(list);	// 일치아이디가 여러개 일때
		}
		return list;
	}
	//회원번호 일치 체크
	private MemberDTO num(int member_num) {
		MemberDTO dto = dao.selectByNum(member_num);
		if(dto==null) { // 회원번호가 없을때 
			List<MemberDTO>list = dao.select(); //전체 목록
			dao.print(list);
			return null;
		}else 
		return dto;
	}
	//이름 중복,널 체크
	private List<MemberDTO> name(String member_name) {
		List<MemberDTO>listName = dao.selectByName(member_name);
		if(listName.size()==0) {// 일치하는 이름이 없으면
			List<MemberDTO>list = dao.select(); //전체 목록
			dao.print(list); 					//전체목록 출력
		}else if(listName.size()==1) { // 중복되는 이름이 없으면
			dto=listName.get(0);
		}else if(listName.size()>1) {	// 중복되는 이름이 있으면
			dao.print(listName);		// 중복되는 이름 목록 출력
		}
		return listName;
	}


	@Override
	public String toString() {
		return "3.수정 ";
	}
	
	

}
