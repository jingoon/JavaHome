package RandomExmple;

import java.util.Random;

public class RandomEx {
	
	public void me1() {
		//0~1�̸� ���� ����
		Random r = new Random();
		int j = r.nextInt(1);
		System.out.println(j);
	}
	
	public void me2() {
		// 3���� 10���� ���� ���� �̱�
		Random r = new Random();
		int j = r.nextInt(8)+3;
		System.out.println(j);
		//start 0 ->0+ 3 
		//last 10+1 ->n +3  //10�̸����� �̹Ƿ� 10�� �����Ϸ��� +1
		//last n= 10+1-3 
	}
	public void me3(int start, int last) {
		Random r = new Random();
		int j = r.nextInt(last-start+1)+3;
		System.out.println(j);
		
	}
	public void me4() {
		Random r1 = new Random(100);// �������� 100
		Random r2 = new Random(100);
		int j1 = r1.nextInt(100);	// last ���� 100
		int j2 = r2.nextInt(100);
		System.out.println(j1);
		System.out.println(j2);
		// ���������� ������ �ƴ�.
	}

}
