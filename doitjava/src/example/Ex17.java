package example;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ��� �ұ��? ");
		int line = sc.nextInt();
		int ul = line / 2;				//��� üũ��
		int dl = line - ul - 1;			//�ϴ� üũ��
//		System.out.println(ul);
//		System.out.println(dl);
		for (int i = 0; i < ul; i++) {
			for (int j = ul; j > i; j--)
				System.out.print(" ");	//��� ���� ����
			for (int j = 0; j <= i; j++) {
				if (j == 0) 			// �����׵θ�üũ
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				if (j == i - 1) 		// �����׵θ�üũ
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();

		}
		for (int i = dl; i >= 0; i--) {
			for (int j = dl; j > i; j--)
				System.out.print(" ");	//�ϴ� ���� ����
			for (int j = 0; j <= i; j++) {
				if (j == 0) 			// �����׵θ�üũ
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				if (j == i - 1) // �����׵θ�üũ
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}