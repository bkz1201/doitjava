package chapter04;

public class ForEx {
	public static void main(String[] args) {
		
		int n = 1;
		int s = 0;

		while (n < 11) {
			s += n;
			n++;
		}
		System.out.println(s);
		
		int i = 0;
		int r = 0;
		for (i = 1; i <= 10; i++) {
			r += i;
		}
		System.out.println(r);
	}
}
