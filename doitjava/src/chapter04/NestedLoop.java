package chapter04;

public class NestedLoop {
	public static void main(String[] args) {
		for (int i = 3; i < 8; i++) {
			System.out.println("������ " + i + "��");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
