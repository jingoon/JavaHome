package book.home_012;

public class CastinRangeMain {
	public static void main(String[] args) {
		
		char cc ='��';
		System.out.println(cc);					//int d=cc;
		System.out.println((int)cc);			//int�� �ٲپ� ����.	
		cc='��';
		System.out.println(cc);					//char�� ����
		System.out.println((int)cc);			//int�� �ٲ� ����
		cc='��';
		System.out.println(cc);					//char�� ����
		System.out.println((int)cc);			//int�� �ٲ� ����.
		System.out.println("-----------------------");
		
		for(int i=1;i<=100;i++) {
			System.out.print((char)i +" ");	//��� �� �ڸ� ���� �߰�
			//(char)i --> int�� char�� ĳ����
			if(i%10==0) {						//10���� ������ �������°�?
				System.out.println();			//�� ���� ������
			}
		}
		
	}

}
