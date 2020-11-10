package InterfaceEx;

import java.util.Scanner;

import InterfaceTest.Command;
import InterfaceTest.DeleteCommand;
import InterfaceTest.InsertCommand;
import InterfaceTest.SelectCommand;
import InterfaceTest.UpdateCommand;

public class MainEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Command[] coms = {new InsertCommand(), new SelectCommand(), new DeleteCommand(), new UpdateCommand()};
		
		int idx=-1;
		boolean is=true;
		while(is) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("0:ȸ���Է� 1:ȸ������ 2:ȸ������ 3:ȸ������ 4:����");
			idx = sc.nextInt();
			sc.nextLine();
			if(idx==coms.length) {
				break;
			}
			coms[idx].execute(sc);
		}
		
		
		sc.close();
		

	}

}
