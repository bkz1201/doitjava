package chapter05;

public class Student {
	// ������� �ʵ�
	int studentID;
	String studentName;
	int grade;
	String address;// �ʵ�

	/* ������ - ��ü�� �����Ҷ� �����ϴ� ��� */
	// �����ڴ� Ŭ���� �̸��� ���ƾ��Ѵ�.
	// ������ �Է������ʾ����� ����Ʈ ������ ����
	// �Ű������� �ڷ����� �ٸ��ٸ� �����ڸ� ������ �� �ִ�.
	Student(int num) {// ������ �Ű������� 1�� �ִ� ������
		System.out.println("Student ��ü�� �����մϴ�. " + num);
	}

	Student(int a, int b) {// ������ �Ű������� 2�� �ִ� ���� ������
		System.out.println("Student ��ü�� �����մϴ�. " + a + " " + b);
	}

	Student(long num) {// long�� �Ű������� 1�� �ִ� ������
		System.out.println("Student ��ü�� �����մϴ�. " + num);
	}

	Student() {// ����Ʈ ������
		System.out.println("����Ʈ �����ڷ� Student ��ü�� �����մϴ�.");
	}

	// �޼ҵ� �޼ҵ��(){����} //����Լ�
	public void showStudentInfo() { // void �ƹ��͵� ���������ʴ´�.
		// public ���Ѿ��� ������ ȣ�� ����
		System.out.println(studentName + ", " + address);
	}
}