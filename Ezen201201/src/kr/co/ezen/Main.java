package kr.co.ezen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naver.Command;
import com.naver.DeleteCommand;
import com.naver.EndCommand;
import com.naver.UpdateCommand;
import com.naver.InsertCommand;
import com.naver.SelectCommand;

public class Main {
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		List<Command> coms = new ArrayList<Command>();
		coms.add(new EndCommand());
		coms.add(new InsertCommand());
		coms.add(new SelectCommand());
		coms.add(new UpdateCommand());
		coms.add(new DeleteCommand());
		
		while (true) {
			System.out.println("메뉴를 선택하세요");
			for (int i = 0; i < coms.size(); i++) {
				System.out.print(coms.get(i));
			}
			try {
				System.out.println();
				int index=sc.nextInt();
				sc.nextLine();
				
				coms.get(index).execute(sc);
			} catch (Exception e) {
				System.out.println("0~4 중 하나를 선택하세요.");
			}
		}
	}
}
