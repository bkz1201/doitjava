package chapter04;

public class BreakEx {
	public static void main(String[] args) {
		int n = 1;
		switch (n) {
		case 1:
			System.out.println("n�� 1�Դϴ�.");
			break;
		case 2:
			System.out.println("n�� 2�Դϴ�.");
			break;
		default:
			System.out.println("n�� 1�� 2�� �ƴ� �ٸ� ���Դϴ�.");
		}

		while (true) {
			System.out.println("�ݺ���.." + n);
			n++;
			if (n > 10)
				break;
		}

		for (int i = 0; i < 3; i++) {
			System.out.print("*");
			break;
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("@");
				break;
			}
			System.out.println();
		}
	}
}
