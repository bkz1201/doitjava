package chapter04;

public class BreakEx {
	public static void main(String[] args) {
		int n = 1;
		switch (n) {
		case 1:
			System.out.println("n은 1입니다.");
			break;
		case 2:
			System.out.println("n은 2입니다.");
			break;
		default:
			System.out.println("n은 1과 2가 아닌 다른 수입니다.");
		}

		while (true) {
			System.out.println("반복중.." + n);
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
