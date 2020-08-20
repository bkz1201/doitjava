package chapter04;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 입력받은 숫자가 홀수인지 작수인지 출력하세요.
 */
public class EvenOdd {
	public static void main(String[] args) {
		int iNum = 0;
		String flag = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력 하세요 : ");
		iNum = sc.nextInt();

		if (iNum == 0) {
			flag = "0";
		} else if (iNum < 0) {
			flag = "음수";
		} else if (iNum % 2 == 0) {
			flag = "짝수";
		} else {
			flag = "홀수";
		}
		System.out.println("입력받은 숫자는 " + iNum + "이고 " + flag + "이다");

		sc.close();
	}
}
