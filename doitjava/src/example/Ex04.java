package example;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("시작 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		System.out.print("마지막 숫자를 입력하세요 : ");
		int num2 = sc.nextInt();
		int res = 0;
		for (int i = num1; i <= num2; i++) {
			if (i % 2 == 0)
				res += i;
			else
				continue;
		}

		System.out.println(num1 + "에서 " + num2 + "까지의 짝수의 합은 " + res + "입니다.");

		sc.close();
	}

}
