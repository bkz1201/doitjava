package example;

import java.util.Scanner;

public class UpDown {
	public static void main(String[] args) {
		int rand = (int) (Math.random() * 100) + 1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);

		int sN = 1, lN = 100;
		//System.out.println(rand);
		for (;;) {
			System.out.print("������ ���ڴ� �����ΰ���?");
			System.out.println("(���� : " + sN + " ~ " + lN+")");
			int i = sc.nextInt();
			cnt++;
			if (i > rand) {
				System.out.print("�ٿ�");
				System.out.println(cnt+"ȸ �Է�");
				lN = i - 1;
			} else if (i < rand) {
				System.out.println("��");
				System.out.println(cnt+"ȸ �Է�");
				sN = i + 1;
			} else {
				System.out.println("����!");
				break;
			}
			System.out.println();
		}
		System.out.println("������ ã�µ� �ɸ� Ƚ�� : " + cnt +"ȸ");
		sc.close();
	}
}
