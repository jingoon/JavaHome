package IfAndMethodEx;

import IfAndMethod.Person;
import IfAndMethod.TV;

public class MainEx {

	public static void main(String[] args) {

		TV lgtv = new TV();
		Person kim = new Person();
		kim.setTv(lgtv);
	System.out.println(kim.getTv().isPower()); //�Ŀ� �ʱⰪ Ȯ��
		kim.tvOnOff();			//tv�ѱ�
		kim.tvOnOff(); 			//tv����
		kim.getTv().getTvInfo();//tv���� ������ ä��Ȯ��
		kim.getTv().volUp();  	//���� �ø���
		kim.getTv().chUp();		//ä�� �ø���
		kim.getTv().getTvInfo();//tv���� ������ ä�� �Ⱥ��ϴ��� Ȯ��
		kim.tvOnOff();			//tv�ѱ�
		kim.getTv().setCh(999);	//ä�� 999�� ����
		kim.getTv().setVol(100);//���� 100���� ����
		kim.getTv().getTvInfo();//tv���� ������ ä�� ���� Ȯ��
		kim.getTv().chUp();		//ä�ξ� 999+1
		kim.getTv().volUp();	//������ 100+1
		kim.getTv().getTvInfo();// ä�ΰ� ���� 0, 100 Ȯ��
		kim.getTv().setCh(0);	//ä�� 0�� ����
		kim.getTv().setVol(0);	//���� 0���� ����
		kim.getTv().getTvInfo();//tv���� ������ ä�� ���� Ȯ��
		kim.getTv().chDown();	//ä�� �ٿ� 0-1
		kim.getTv().volDown();	//���� �ٿ� 0-1
		kim.getTv().getTvInfo();//ä�ΰ� ���� 999, 0 Ȯ��
		
	}

}
