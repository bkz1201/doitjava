package example;

import java.util.Scanner;

public class Rock {
	public static void main(String[] args) {
		final int BA = 1;
		final int GA = 2;
		final int BO = 3;

		Scanner sc = new Scanner(System.in);

		int score = 0;
		int life = 3;

		int com;// = (int) (Math.random() * 3) + 1; // 1���� 2���� 3��
//		System.out.println("1���� 2���� 3�� ������ ���ڷ� �Է��Ͻÿ�");
//		String m = sc.next();
		int m;// =sc.nextInt();

		// System.out.println(m=="����" ? "����":"�ٸ���");
//		System.out.println(m=="����" ? "����":"�ٸ���");
//		System.out.println(m=="��" ? "��":"�ٸ���");

		/*
		 * for (;;) { m=sc.nextInt(); System.out.println("���� ������ "+(m==BA ? "����":(m==GA
		 * ? "����":"��"))); if (m == BA) { System.out.println("��밡 ������ "+(com==BA ?
		 * "����":(com==GA ? "����":"��"))); if (com == BA) { System.out.println("�����ϴ�.");
		 * break; } else if (com == GA) { System.out.println("�̰���ϴ�."); break; } else {
		 * System.out.println("�����ϴ�."); break; } } else if (m == GA) {
		 * System.out.println("��밡 ������ "+(com==BA ? "����":(com==GA ? "����":"��"))); if (com
		 * == GA) { System.out.println("�����ϴ�."); break; } else if (com == BO) {
		 * System.out.println("�̰���ϴ�."); break; } else { System.out.println("�����ϴ�.");
		 * break; } } else if (m == BO) { System.out.println("��밡 ������ "+(com==BA ?
		 * "����":(com==GA ? "����":"��"))); if (com == BO) { System.out.println("�����ϴ�.");
		 * break; } else if (com == BA) { System.out.println("�̰���ϴ�."); break; } else {
		 * System.out.println("�����ϴ�."); break; } } else
		 * System.out.println("�ٽ� �Է��ϼ��� (1���� 2���� 3��)"); }
		 */
		int wcnt = 0;
		int dcnt = 0;
		while (true) {
			System.out.println("���� ü�� : " + life + " ���� : " + score);
			System.out.println("1���� 2���� 3�� ������ ���ڷ� �Է��Ͻÿ�.");
			m = sc.nextInt();
			com = (int) (Math.random() * 3) + 1;

			if ((com == GA && m == BA) || (com == BA && m == BO) || (com == BO && m == GA)) {
				System.out.println("���� ������ " + (m == BA ? "����" : (m == GA ? "����" : "��")));
				System.out.println("��밡 ������ " + (com == BA ? "����" : (com == GA ? "����" : "��")));
				System.out.println("�¸�");
				score += 100;
				wcnt++;
			} else if (com == m) {
				System.out.println("���� ������ " + (m == BA ? "����" : (m == GA ? "����" : "��")));
				System.out.println("��밡 ������ " + (com == BA ? "����" : (com == GA ? "����" : "��")));
				System.out.println("���º�");
				score += 10;
				dcnt++;
			} else if (m > 3 || m <= 0) {
				System.out.println("�߸��Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
				continue;
			} else {
				System.out.println("���� ������ " + (m == BA ? "����" : (m == GA ? "����" : "��")));
				System.out.println("��밡 ������ " + (com == BA ? "����" : (com == GA ? "����" : "��")));
				System.out.println("�й�");
				life--;
			}
			if (life <= 0) {
				sc.close();
				break;
			} else
				System.out.println();
		}
		System.out.println();
		System.out.println("���� ��� : " + wcnt + "�� " + dcnt + "�� " + "3��");
		System.out.println("���� ���ھ� : " + score);

	}
}
