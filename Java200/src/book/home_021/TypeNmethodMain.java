package book.home_021;

public class TypeNmethodMain {
	public static void main(String[] args) {
		
		// �⺻ Ÿ��
		int myId=1001;
		int yourId=1002;
		
		//Reference type -- Predefined
		String myName="park";
		String yourName=new String("goblean");
		
		//���� Ÿ�� - ����� ����
		Student stu = new Student();
		stu.setId(yourId);
		stu.setName(myName);
		
		//�޼��� ȣ��
		printInfor(myId, yourName);
		printInfor(stu);
		
	}
	
	public static void printInfor(int id, String name) {
		System.out.println("ID��"+id+", �̸���"+name+"�̴�.");
		
	}
	public static void printInfor(Student st) {
		System.out.println("ID��"+st.getId()+", �̸���"+st.getName()+"�̴�.");
		
	}
}
