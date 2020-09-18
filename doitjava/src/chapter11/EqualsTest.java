package chapter11;

class Student {
	int studentId;
	String studentName;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public String toString() {
		return studentId + ", " + studentName;
	}
}

public class EqualsTest {
	public static void main(String[] args) {
		Student stLee = new Student(100, "�̻��");
		Student stLee2 = stLee;
		Student stSang = new Student(100, "�̻��");

		if (stLee == stLee2)
			System.out.println("stLee�� stLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("stLee�� stLee2�� �ּҴ� �ٸ��ϴ�.");

		if (stLee.equals(stLee2))
			System.out.println("stLee�� stLee2�� �����մϴ�.");
		else
			System.out.println("stLee�� stLee2�� �������� �ʽ��ϴ�..");

		if (stLee == stSang)
			System.out.println("stLee�� stSang�� �ּҴ� �����ϴ�.");
		else
			System.out.println("stLee�� stSang�� �ּҴ� �ٸ��ϴ�.");

		if (stLee.equals(stSang))
			System.out.println("stLee�� stSang�� �����մϴ�.");
		else
			System.out.println("stLee�� stSang�� �������� �ʽ��ϴ�.");
		
		if(stLee.studentName==stSang.studentName)
		{
			System.out.println("����");
		}
		else
			System.out.println("�ٸ���");
	}
}
