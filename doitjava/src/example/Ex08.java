package example;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("������ ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();

		if (num1 > num2) {
			for (int i = num1; i >= num2; i--) {
				System.out.println(i);
			}
		}
		else {
			for (int i = num2; i >= num1; i--) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
