package chapter04;

public class DoWhileEx {
	public static void main(String[] args) {
		int n = 20;
		int s = 0;

		do {
			s += n;
			n++;
		} while (n <= 10);

		System.out.println("1부터 10까지의 합은 " + s + "입니다.");

		n = 20;
		s = 0;
		while (!(n > 10)) {
			s += n++;
		}
		System.out.println("1부터 10까지의 합은 " + s + "입니다.");
	}
}
