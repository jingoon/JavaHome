package home.doitJava;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName ="�̼���";
		studentLee.studentID = 100;
		studentLee.address = "����� �������� ���ǵ�";
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "��ȣ��";
		
		studentLee.showStudentInfor();
		studentKim.showStudentInfor();
		
		studentLee.setStudentName("�̼����屺"); //lee�� �̸� ����
		String getName= studentLee.getStudentName();
		System.out.println(getName);			// ���� �̸� Ȯ��
		studentLee.showStudentInfor();			// �̸��� ����� ����
	}
}
