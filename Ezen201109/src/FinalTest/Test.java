package FinalTest;

public final class Test {		// �ڽ�Ŭ���� ���� �� ����
	
	private static final int A_B_C=33; // �ٷλ�밡���ϰ�
	private final int D_E_F;			//�����ڿ��� �ʱ�ȭ.
	
	public Test() {				
		D_E_F=55;
	}
	public Test(int A){
		D_E_F = A;
	}
	public final void sim() {	//Ŭ������ �ڽ��� ���� �� ������..
								//�ڽ�Ŭ�������� �������̵� ����.
	}
	// static������ Test.A_B_C; �� ���.
}

