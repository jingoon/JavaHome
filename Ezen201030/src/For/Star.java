package For;

public class Star {
	public Star() {
		// TODO Auto-generated constructor stub
	}
	/*	2. �Ƕ�̵� ���
		2.1 ������ �Ѱܹ޾� '*'�� n�� ���
		2.2 ù��° �� 1�� �ι�°2�� 3��° 3�� ... n��° n�� ���
		2.3 1�� ���� ���� �����ؼ� n��° ���� 1������ �����ϰ� ���

	*/
	public void star(int num) {			//2.1
		for(int i=0;i<num;i++) {
			System.out.print('*');
		}
		System.out.println();
	}
	
	public void star2(int num) {		//2.2
		for(int i=0;i<num;i++) {
			star(i+1);
		}
	}
	
	public void star3(int num) {		//2.3
		for(int i=0;i<(num*2);i++) {
			if(i+1<num/2) {
				star(i+1);
			}else {
				star(num-i-1);
			}
		}
	}

}
