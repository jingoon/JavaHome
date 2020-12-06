package com.naver;

import java.util.Scanner;

public interface Command {
	
	static final String DRIVER = "oracle.jdbc.OracleDriver";
	static final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	static final String USER = "ezen";
	static final String PASSWORD = "ezen";
	
	public abstract void execute(Scanner sc);

}
