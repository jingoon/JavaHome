package ExceptionExmple;

import javax.management.RuntimeErrorException;

public class ExceptionEx {
	
	public void me1() {
		
		String msg = null;
		
		char c = msg.charAt(0); //NullpointerException �߻�
	}
	
	public void me11(int idx) {
		
		String msg = "hello";
		
		try {
			char c = msg.charAt(idx);	// ���� �߻� ���� �ڵ�
			System.out.println("1:���� �߻����� ����:"+ c);
		} catch (Exception e) {
			System.out.println("2:���� �߻�"); //���� �߻��� ����
		}
	}
	public void me12(int idx) {
		
		String[] arr = {"Ȱ", "��","��"};
		
		try {
			System.out.println("3:���� �߻� �� ���: ");//���ܰ� �߻������� ������ ���
			System.out.println("4:arr[idx]: "+arr[idx]);
			System.out.println("5:���� �߻��ϸ� ������� ����"); 
		} catch (Exception e) {
			System.out.println("6:���� �߻� ");
		}
		
	}
	public void me2(int num) {
		int a = 5;
		try {
			a/=num;
			System.out.println(a);
		} catch (Exception e) {
			System.out.println("0���� ������ �����߻�");
			return;				// ������ �߻��ؼ� �ش� �޼��� ����
		} finally {			//catch ���� ���� ������
			System.out.println("���ܰ� �߻��ϵ� �߻����� �ʵ� �ݵ�� ������"); 
			System.out.println("return; ���� �� �����ϴ�");
		}
		
	}
	public void me3(int index) throws Exception{
		String msg = "hello";
		System.out.println(msg.charAt(index));
	}
	public void me3141(String msg) throws Exception { //ȣ�� �� ���ܹ߻� ���ɼ��� �ִٰ� throw�� ����
		if(msg.equals("������")) {
			throw new Exception("Exction: �弳����");
		}
		System.out.println(msg);
	}
	
	public void me4(String msg) {
		if(msg.equals("������")) {
			throw new RuntimeException("RuntimeExction: �弳����");
		}
		System.out.println(msg);
	}
	public void me4151(String msg) {
		if(msg.equals("������")) {
			throw new DoNotRuntimeExceptionExtends("��������� throw: �弳����");
		}
	}
	public void me5(String msg) throws DoNotExceptionExtends {
		if(msg.equals("������")) {
			throw new DoNotExceptionExtends("��������� throws: �弳����");
		}
		
	}
	
	
	

}
