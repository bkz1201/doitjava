package example;

import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		int[] com = makeCom(); // ��ǻ�Ͱ� ���������� ���� �迭
		System.out.println("���� �߱� ����! 11�� �ȿ� ������ ���纸����.");
		System.out.println("�Է¹޴� ���ڴ� 1 ~ 9 �Դϴ�.");

		int chance = 0; // �Է��� Ƚ��
		int[] score;//0�� �ε��� ��Ʈ����ũ 1���ε��� ��
		Scanner sc= new Scanner(System.in);
		for (;;) {
			chance++;
			System.out.println(chance + "ȸ");
			int[] player = playerSet(chance,sc);// �÷��̾� ���� �Է¹���
			score = compareArr(com, player);// com player ���ں�
			System.out.println("Strike : " + score[0] + "\tball : " + score[1]);
			if (score[0] == 3) {
				System.out.println("�����Դϴ�.");
				break;
			}
			if (chance >= 11) {
				System.out.println("������ ã�� ���߽��ϴ�.");
				break;
			}
		}
		System.out.println("������ " + com[0] + " | " + com[1] + " | " + com[2] + "�Դϴ�.");
		sc.close();
	}

	static int[] makeCom() {
		int[] com = new int[3];

		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {// ��ȣ �ߺ� �˻� ������ ������ ��ȣ�� �̹��� ������ ��ȣ
					i--;// �ߺ��Ͻ� �̹��� �����ȹ�ȣ �ٽ� ���������� i�� ����
					break;// i ���������� �̵��ϸ鼭 i�� ��������
				}
			}
		} // ��ǻ�Ͱ� ���������� ���ڸ� �������� �Է� �ߺ�X;
		return com;
	}

	static int[] playerSet(int chance, Scanner sc) {
		int[] player = new int[3];
		for (int i = 0; i < player.length; i++) {
			System.out.print(i + 1 + "��° ���� : ");
			player[i] = sc.nextInt();
			if (player[i] > 10 || player[i] < 1) {
				System.out.println("1~9 ���� �Է� ���� �մϴ�.");
				i--;
				continue;
			}
			for (int j = 0; j < i; j++) {
				if (player[i] == player[j]) {
					System.out.println("���� ���Դϴ�. �ٽ��Է����ּ���.");
					i--;
					break;
				}
			}
		} // �÷��̾� ���� �Է¹���
		if (chance >= 11)
			sc.close();
		return player;
	}

	static int[] compareArr(int[] com, int[] player) {
		int[] score = new int[2];

		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < player.length; j++) {
				if (com[i] == player[j]) { // ��ǻ�Ϳ� �÷��̾ �Է��� ���� ������
					if (i == j)
						score[0]++; // �ε��� ���ڰ� ������ ��Ʈ����ũ
					else
						score[1]++; // �ε��� ��ȣ�� �ٸ��� ���ڸ� ��ġ�ϸ� ��
				}
			}
		} // ��ǻ�Ϳ� �÷��̾� ���� ��
		return score;
	}
}
