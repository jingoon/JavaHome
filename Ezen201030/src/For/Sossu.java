package For;

public class Sossu {

	public Sossu() {
		// TODO Auto-generated constructor stub
	}
	
	//�Ҽ� �Ǻ��ϱ�
	//�Ҽ�: 1�� �ڱ��ڽ� �ۿ� ����� ���� ��
	
	public void sossu(int num) {// ���� �Ѱ� �ޱ�
		for(int i=2;i<num;i++) {// 2 ~ num �ٷ� �� ���� ���� ���Ȯ��(1�� �ڱ� �ڽ� ���� �˻�)
			if(num%i==0) {		// �������� 0�̸� ���
				System.out.println(num+"�� �Ҽ� �ƴ�");//����� �Ҽ��ƴ�
				break;			//����� ã���� else if�� �н�
			}else if(i==num-1) {//����� ���� �� �� �ٷ� �ձ��� �� �˻��Ѱǰ�?
				System.out.println(num+"�� �Ҽ� �̴�.");//����� ���ٸ� �Ҽ�
			}
		}
	}
}
