package kr.co.ezen;

import java.lang.reflect.Constructor;

import com.naver.Command;

public class MainEx2 {

	public static void main(String[] args) {
		//full package name: 패키지와 클래스를 같이 사용하는 것.
		//ex) com.naver.InsertCommand
		try {
			Class<?> testClass=Class.forName("com.naver.InsertCommand");
			Constructor<?> cons=testClass.getConstructor();// 생성자
			Command com =(Command) cons.newInstance(); //객체: 
			// 위3줄의 코드와 같다 Command com = new InsertCommand();
			
			com.execute(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
