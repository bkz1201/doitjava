package chapter05;

import java.util.Scanner;

public class FunctionTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student std1 = new Student();
		Student std2 = new Student();

		System.out.println(std1 == std2);

		/* ��ü�� ����� ��Ʈ������(.)�� �̿��Ͽ� ������ �� �ֽ��ϴ�. */

		std1.showStudentInfo();// �޼ҵ� ȣ�� ��ü�� �ʱⰪ�� null�̴�. int�� 0�̴�. boolean�� false��.
		std1.studentID = 2020010001;
		std1.studentName = "������";
		std1.grade = 3;
		std1.address = "����";
		std1.showStudentInfo();

		std2.showStudentInfo();
		std2.studentID = 202001002;
		std2.studentName = "������";
		std2.grade = 1;
		std2.address = "����";
		std2.showStudentInfo();

		Student std3 = new Student();
		std3.studentID = 20001003;
		sc.close();
	}
}
