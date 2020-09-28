package chapter13.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelEx {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�", "���ٽ�", "�ں���");

		Stream<String> stream = list.stream();
		stream.forEach(ParallelEx::print);

		System.out.println();

		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelEx::print);
	}

	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}
