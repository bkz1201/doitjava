package example;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ������ �Է��� �ּ��� : ");
		num1 = sc.nextInt();
		System.out.print("�ι�° ������ �Է��� �ּ��� : ");
		num2 = sc.nextInt();

		if (num1 == num2)
			System.out.println("Same");
		else
			System.out.println("Different");

		System.out.println(num1 == num2 ? "same" : "Different");
		sc.close();
	}
}
