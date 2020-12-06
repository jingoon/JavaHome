package kr.co.ezen;

import java.lang.reflect.Constructor;

import com.naver.Command;

public class MainEx2 {

	public static void main(String[] args) {
		//full package name: ��Ű���� Ŭ������ ���� ����ϴ� ��.
		//ex) com.naver.InsertCommand
		try {
			Class<?> testClass=Class.forName("com.naver.InsertCommand");
			Constructor<?> cons=testClass.getConstructor();// ������
			Command com =(Command) cons.newInstance(); //��ü: 
			// ��3���� �ڵ�� ���� Command com = new InsertCommand();
			
			com.execute(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
