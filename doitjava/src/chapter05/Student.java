package chapter05;

public class Student {//�������
	int studentID;
	String studentName;
	int grade;
	String address;//�ʵ�

	// �޼ҵ� �޼ҵ��(){����}	//����Լ�
	public void showStudentInfo() { // void �ƹ��͵� ���������ʴ´�.
		// public ���Ѿ��� ������ ȣ�� ����
		System.out.println(studentName + ", " + address);
	}//�޼ҵ�
}