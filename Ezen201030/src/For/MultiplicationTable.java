package For;

public class MultiplicationTable {

	public MultiplicationTable() {
		// TODO Auto-generated constructor stub
	}
	/*
		3. ������ ���
		3.1�Է¹��� ���� n�� ���
		3.2 n���� ȣ���� 1~9�ܱ��� ���
		3.3 1~4�ܱ��� ���η� ��� �� �Ʒ� 5~9�ܱ��� ���η� ���
	*/
	public void mTable(int num) {
		for(int i=1;i<10;i++) {		//������ 1����
			System.out.printf("%dX%d=%d%n",num,i,num*i);
		}
	}
	
	public void mTable2() {
		for(int i=2;i<10;i++){		//2�� ����
			System.out.println(i+"��");
			mTable(i);
		}
		
	}
	
	public void mTable3(int k, int n,int j) {  //k~n�ܱ���
		for(int i=k;i<n;i++) {
			System.out.print(i+"x"+j+"="+(i*j)+"\t");
		}
		System.out.println();
			
		
	}
	public void mTable4() {
		for(int j=1;j<10;j++) {
			mTable3(2, 6, j);	//2~5�ܱ��� 
		}
		System.out.println();
		for(int j=1;j<10;j++) {	
			mTable3(6, 10, j);	//6~9�ܱ���
		}
			
	}
}
