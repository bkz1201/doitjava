package chapter05;

public class Operator {
	int add(int n, int m) {// ()안의 매개변수의 이름은 마음대로 설정하면 됩니다.
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
			System.out.println("0으로 나눌 수 없습니다.");
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
