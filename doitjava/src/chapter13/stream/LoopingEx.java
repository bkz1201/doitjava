package chapter13.stream;

import java.util.Arrays;

public class LoopingEx {
	public static void main(String[] args) {
		int[] iArr = { 1, 2, 3, 4, 5 };

		System.out.println("[peek()�� �������� ȣ���� ���]");
		Arrays.stream(iArr).filter(a -> a % 2 == 0).peek(n -> System.out.println(n));

		System.out.println("[���� ó�� �޼ҵ带 �������� ȣ���� ���]");
		int total = Arrays.stream(iArr).filter(a -> a % 2 == 0).peek(n -> System.out.println(n)).sum();

		System.out.println("���� : " + total);

		System.out.println("[forEach()�� �������� ȣ���� ���]");
		Arrays.stream(iArr).filter(a -> a % 2 == 0).forEach(n -> System.out.println(n));
	}
}
