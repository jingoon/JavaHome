package book.home_015;

public class MathTestMain {
	public static void main(String[] args) {
		
		
		//constant
		System.out.println("1 Math.E"+Math.E);
		System.out.println("2 Math.PI"+Math.PI);
		
		//method
		System.out.println("3: Math.abs(-5)���밪:"+Math.abs(-5));
		System.out.println("4: Math.ceil(4.34)�ø�:"+Math.ceil(4.34));
		System.out.println("5: Math.round(4.34)�ݿø�:"+Math.round(4.34));
		System.out.println("6: Math.floor(4.34)����:"+Math.floor(4.34));
		System.out.println("7: Math.rint(4.34)�ݿø�:"+Math.rint(4.34));
		System.out.println("8: Math.max(45,78)"+Math.max(45, 78));
		System.out.println("9: Math.min(45,78)"+Math.min(45, 78));
		System.out.println("10: Math.pow(2,4)"+Math.pow(2, 4));
		System.out.println("11: Math.log(30)"+Math.log(30));
		System.out.println("12: Math.exp(3)"+Math.exp(3));
		System.out.println("13: Math.sqrt(10)"+Math.sqrt(10));
		System.out.println("14: Math.sin(Math.toRadians(90))"+Math.sin(Math.toRadians(90)));
		System.out.println("15: Math.cos(Math.toRadians(180))"+Math.cos(Math.toRadians(180)));
		
		//random
		double dRan=Math.random();				// 0<==dRan<1 �Ǽ�
		int iRan=(int)(Math.random()*100);		// 0<==iRan<100 ����
		System.out.println("16: Math.random()=>"+dRan);
		System.out.println("17: (int)(Math.random()*100)=>"+iRan);
	
	}

}
/* ������ ���� �����ϰ� �ϱ� �ϴ� ���ŷӰ� �⺻����
//1.Ķ���� ��ü ����

//2.���� ���� , �� , �� , ���� �� Ķ�������� �����Ͽ� ���� ���

//3.1950.6.25 ��¥ ��� set( , ,)
//���������ΰ�?

//4. �ش���� ������ ���� ���� �����ΰ�?(30,31,28,29)
//4-1 1950�� 2���� ������ ���� ���ϱ����ΰ�?
�迭�� ��~��
//���������� ���� �����ΰ�?

//5�޷¸���� �н�

//6.2020�� 11�� 12�� �� 20������ ��¥��?add
//6-1. 20�� ���� ��¥ ����. clone()�� �̿�

//7.���� ��¥�� Date�� ����ȯ
//20�� ���� ��¥�� ��� ���ϳ�(��¥������) roll
//��, ��, ���� ���
 *c.set���� ���̰� ����?

//8. Ķ����Ÿ���� ����ȯ
//Ķ���� Ÿ�� c�� �����ϰ� ������ Ÿ�� d�� ��ȯ
//������Ÿ�� d�� �����ϰ� Ķ���� Ÿ��c�� ��ȯ

//9.���� ��¥�� �ð��� Ķ�������� ������Ÿ������ ����ȯ
//YYYY-MM-dd-hh-mm-ss�������� �����Ͽ� ���
 * 
//Wrapper
//1. �⺻�ڷ����� �ʱ�ȭ
//2. ����Ŭ������ �ʱ�ȭ
//3. //AutoUnBoxing
boolean a = new Boolean(false);
Character b = new Character('c');
//char bb=b;
//4.���ڿ��� �⺻�ڷ������� �����ϴ� ���1 parse
*4-1.���ڿ��� �⺻�ڷ�������
�����ϴ� ���2 valueof*6. Charater.parse.Charater()�� Charater.valueof()�� ����*
��� ���ڿ�.chsrAt();�� ���
//Random
������ü����
	��������

���� (int start~end)���
	������ü 1,2 ���� ���� �õ�� ������
*/

