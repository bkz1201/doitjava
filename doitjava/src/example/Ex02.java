package example;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		String str = "";
		if (num1 % 2 == 0) {
			str = "¦��";
			System.out.println(str);
		} else {
			str = "Ȧ��";
			System.out.println(str);
		}

		System.out.println(num1 % 2 == 0 ? "¦��2" : "Ȧ��2");

		sc.close();
	}
}
