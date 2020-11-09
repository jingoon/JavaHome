package FinalTest;

public final class Test {		// 자식클래스 만들 수 없음
	
	private static final int A_B_C=33; // 바로사용가능하게
	private final int D_E_F;			//생성자에서 초기화.
	
	public Test() {				
		D_E_F=55;
	}
	public Test(int A){
		D_E_F = A;
	}
	public final void sim() {	//클래스가 자식을 만들 수 없지만..
								//자식클래스에서 오버라이딩 못함.
	}
	// static변수는 Test.A_B_C; 로 사용.
}

