package kr.co.ezen;

import java.util.Scanner;

import com.naver.Command;
import com.naver.ExnCommand;
import com.naver.InsertCommand;
import com.naver.SelectCommand;
import com.naver.UpdateCommand;
import com.naver.deleteCommand;

public class MainEx {

	public static void main(String[] args) {
	
		Command[] menus = {new InsertCommand(),
				new SelectCommand(),
				new UpdateCommand(),
				new deleteCommand(),
				new ExnCommand()
				};
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("0:���, 1:��ȸ, 2:����, 3:����, 4:����");
			int idx=sc.nextInt();
			sc.nextLine();
			menus[idx].execute(sc);
		}
		
		
	}
}
