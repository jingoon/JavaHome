package MainExmple;

import ExceptionExmple.DoNotExceptionExtends;
import ExceptionExmple.ExceptionEx;

public class MainEx {
	public static void main(String[] args) {

		ExceptionEx e1 = new ExceptionEx();
		// e1.me1();

		e1.me11(0); // (���ܹ߻���������) try ����
		e1.me11(-1);// (���ܹ߻���) catch ����

		e1.me12(2);
		e1.me12(100); // ���ܹ߻� �ڵ�

		e1.me2(1);
		e1.me2(0); // ���ܹ߻� �Է�

		try {
			e1.me3(100); // ���ܰ� �߻��ص� ������ ����
		} catch (Exception e3) {
			e3.printStackTrace();
			System.out.println("100�Է½� ��������");
		}

		try {
			e1.me3141("�� �ְ��"); // throws�� ����� //������ �߻� ���ɼ��� �ִٸ� ȣ��� ������ ���� try~catch
		} catch (Exception e2) {
			e2.printStackTrace();
			System.out.println("�� �ְ�� ��������");
		}
		try {
			e1.me3141("������"); // throws�� �����
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ �Է½� ��������");
		}

		// e1.me4("������"); //���� �߻��� �ٷ� ���� �ߴ�

		// e1.me4151("������"); //���� �߻��� �ٷ� ���� �ߴ�

		try {
			e1.me5("������");
		} catch (DoNotExceptionExtends e) {
			e.printStackTrace();
		}

	}

}
