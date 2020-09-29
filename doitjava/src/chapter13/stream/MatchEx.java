package chapter13.stream;

import java.util.Arrays;

public class MatchEx {
	public static void main(String[] args) {
		int[] iArr = { 2, 4, 6 };

		boolean result = Arrays.stream(iArr).allMatch(a -> a % 2 == 0);
		System.out.println("��� 2�� ����ΰ�? " + result);

		result = Arrays.stream(iArr).anyMatch(a -> a % 3 == 0);
		System.out.println("�ϳ��� 3�� ����� �ִ°�? " + result);

		result = Arrays.stream(iArr).noneMatch(a -> a % 3 == 0);
		System.out.println("3�� ����� ���°�? " + result);
	}
}
