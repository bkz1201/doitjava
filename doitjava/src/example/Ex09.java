package example;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		System.out.print("������ ���ڸ� �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		double avr=(double)sum/num2;
		System.out.println(num1 + "���� " + num2 + "������ ���� " + sum + "�Դϴ�.");
		System.out.println(num1 + "���� " + num2 + "������ ���� ����� " + avr + "�Դϴ�.");

		sc.close();
	}
}
