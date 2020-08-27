package example;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 줄을 출력 할까요? ");
		int line = sc.nextInt();
		int num = line * 2 - 1;

		for (int i = 0; i < line; i++) {
			for (int j = 1; j <= num; j++) {
//				if(line-i)
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
