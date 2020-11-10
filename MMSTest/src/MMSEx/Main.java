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
			System.out.println("�޴��� �����ϼ���");
			System.out.println("0:ȸ���Է� 1:ȸ������ 2:ȸ������ 3:ȸ������ 4:����");
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
