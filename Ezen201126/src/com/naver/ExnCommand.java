package com.naver;

import java.util.Scanner;

public class ExnCommand implements Command {

	@Override
	public void execute(Scanner sc) {
		System.out.println("Á¾·á");
		sc.close();
		System.exit(0);

	}

}
