package chapter05;

public class Operator {
	int add(int n, int m) {// ()���� �Ű������� �̸��� ������� �����ϸ� �˴ϴ�.
		return n + m;
	}

	int sub(int n, int m) {
		return n - m;
	}

	int mul(int n, int m) {
		return n * m;
	}

	int div(int n, int m) {
		if (m == 0 || n == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return 0;
		}
		return n / m;
	}

	void printStar() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		return;
	}
}
