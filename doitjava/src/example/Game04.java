package example;

import java.util.Scanner;

public class Game04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1���� �Է¹��� ���ڱ��� �Ҽ��� ������ ����ϴ� ����
		System.out.println("������� �Ҽ��� ������ ���ұ��?");
		int n = sc.nextInt();
		int check = 0;
		int cnt = 0;
		for (int i = 2; i <= n; i++) {		//1~n����
			check = 0;
			for (int j = 2; j <= i; j++) {	//2~i����
				if (i % j == 0) {
					check++;				//i�� j�� �������� �������� 0�̸� check++
				}
				if (check > 1)				//check�� 1���� ũ�� �Ҽ����ƴϾ ����for�� ��������
					break;				
			}
			if (check == 1) {				//check�� 1�̸� �Ҽ�
				cnt++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("1 ~ " + n + "������ �Ҽ� ���ϱ�.");
		System.out.println("�Ҽ��� ���� : " + cnt);
		sc.close();
	}
}
