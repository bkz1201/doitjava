package chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayEx {
	public static void main(String[] args) {
		String[] sArr = { "ȫ�浿", "�ſ��", "��̳�" };
		Stream<String> sStream = Arrays.stream(sArr);
		sStream.forEach(a -> System.out.print(a + ", "));
		System.out.println();

		int[] iArr = { 1, 2, 3, 4, 5 };
		IntStream iStream = Arrays.stream(iArr);
		iStream.forEach(a -> System.out.print(a + ", "));
		System.out.println();
	}
}
