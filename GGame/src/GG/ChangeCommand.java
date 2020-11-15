package GG;

import java.util.Scanner;

public class ChangeCommand implements Command {

	

	@Override
	public void execute(Scanner sc) {
		System.exit(0);
	}

	@Override
	public String toString() {
		return "2:무기변경 ";
	}
	

}
