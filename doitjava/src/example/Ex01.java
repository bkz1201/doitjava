package example;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력해 주세요 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력해 주세요 : ");
		num2 = sc.nextInt();

		if (num1 == num2)
			System.out.println("Same");
		else
			System.out.println("Different");

		System.out.println(num1 == num2 ? "same" : "Different");
		sc.close();
	}
}
