package example;

public class Asterisk04 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
//			for(int j=i;j<4;j++)
//			System.out.print(" ");
			for (int j = 0; j < 5; j++) {		// ����
				if (j < 4 - i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			for (int j = 0; j < i; j++)			// ���
				System.out.print("*");
			System.out.println();
		}
		for (int i = 3; i >= 0; i--) {			// ����
			for (int j = 0; j < 5; j++) {
				if (j < 4 - i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			for (int j = 0; j < i; j++)			// �Ͽ�
				System.out.print("*");
			System.out.println();
		}
	}
}
