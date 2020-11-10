package MMSEx;

import java.util.Scanner;

import MMSTest.Command;
import MMSTest.DeleteCommand;
import MMSTest.InsertCommand;
import MMSTest.SelectCommand;
import MMSTest.UpdateCommand;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		Command[] coms = {new InsertCommand(), new SelectCommand(), new DeleteCommand(), new UpdateCommand()};
		
		int idx=-1;
		boolean is=true;
		while(is) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("0:회원입력 1:회원선택 2:회원삭제 3:회원수정 4:종료");
			idx=sc.nextInt();
			sc.nextLine();
			if(idx==coms.length) {
				break;
			}
			
			coms[idx].execute(sc);
			
			
		}
		
		
		sc.close();
	}

}
