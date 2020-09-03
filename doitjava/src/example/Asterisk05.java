package example;

public class Asterisk05 {
	public static void main(String[] args) {
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				if (j == i)
//					System.out.print(i);
//				else
//					System.out.print("@");
//			}
//			System.out.println();
//		}

		for (int i = 5; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("@");
			}
			System.out.println(i);
		}
	}
}
