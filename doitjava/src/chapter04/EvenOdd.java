package chapter04;

import java.util.Scanner;

/*
 * ���ڸ� �Է¹޾Ƽ� �Է¹��� ���ڰ� Ȧ������ �ۼ����� ����ϼ���.
 */
public class EvenOdd {
	public static void main(String[] args) {
		int iNum = 0;
		String flag = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է� �ϼ��� : ");
		iNum = sc.nextInt();

		if (iNum == 0) {
			flag = "0";
		} else if (iNum < 0) {
			flag = "����";
		} else if (iNum % 2 == 0) {
			flag = "¦��";
		} else {
			flag = "Ȧ��";
		}
		System.out.println("�Է¹��� ���ڴ� " + iNum + "�̰� " + flag + "�̴�");

		sc.close();
	}
}
