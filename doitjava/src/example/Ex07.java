package example;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("������ ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		int cnt = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0)
				cnt++;
			else
				continue;
		}

		System.out.println(num1 + "���� " + num2 + "������ 3�� ����� ������ " + cnt+ "�Դϴ�.");

		sc.close();
	}
}
