package example;

import java.util.Scanner;

public class BaseBall2 {
	public static void main(String[] args) {
		int strike, ball; // ��Ʈ����ũ ��
		int[] com = new int[3]; // ��ǻ�Ͱ� ���������� ���� �迭
		System.out.println("���� �߱� ����! 11�� �ȿ� ������ ���纸����.");
		System.out.println("���ڴ� 1 ~ 9 �Դϴ�.");
		
		for (int i = 0; i < com.length; i++) {
			com[i] = (int) (Math.random() * 9) + 1;
			for (int j = 0; j < i; j++) {
				if (com[i] == com[j]) {// ��ȣ �ߺ� �˻� ������ ������ ��ȣ�� �̹��� ������ ��ȣ
					i--;// �ߺ��Ͻ� �̹��� �����ȹ�ȣ �ٽ� ���������� i�� ����
					break;// i ���������� �̵��ϸ鼭 i�� ��������
				}
			}
		} // ��ǻ�Ͱ� ���������� ���ڸ� �������� �Է� �ߺ�X;

		int chance = 0; // �Է��� ��ȸ
		int[] player = new int[3]; // �÷��̾ �Է��� ���� �迭
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < com.length; i++)
			System.out.print(com[i] + " ");
		System.out.println();
		for (;;) {
			strike = 0;
			ball = 0;
			chance++;
			System.out.println(chance + "ȸ");
			for (int i = 0; i < player.length; i++) {
				System.out.print(i + 1 + "��° ���� : ");
				player[i] = sc.nextInt();
				if (player[i] > 10 || player[i] == 0) {
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
			
			for (int i = 0; i < com.length; i++) {
				for (int j = 0; j < player.length; j++) {
					if (com[i] == player[j]) { // ��ǻ�Ϳ� �÷��̾ �Է��� ���� ������
						if (i == j)
							strike++; // �ε��� ���ڰ� ������ ��Ʈ����ũ
						else
							ball++; // �ε��� ��ȣ�� �ٸ��� ���ڸ� ��ġ�ϸ� ��
					}
				}
			} // ��ǻ�Ϳ� �÷��̾� ���� ��
			System.out.println("Strike : " + strike + "\tball : " + ball);
			if (strike == 3) {
				System.out.println("�����Դϴ�.");
				break;
			}
			if (chance >= 11) {
				System.out.println("������ ã�� ���߽��ϴ�.");
				break;
			}
		}
		sc.close();
	}
}
