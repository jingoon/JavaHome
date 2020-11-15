package GG;

import java.util.Scanner;

public class EndCommand implements Command {

	

	@Override
	public void execute(Scanner sc) {
		System.exit(0);
	}

	@Override
	public String toString() {
		return "0:Á¾·á";
	}
	

}
