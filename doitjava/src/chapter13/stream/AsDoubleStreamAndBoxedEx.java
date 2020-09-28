package chapter13.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AsDoubleStreamAndBoxedEx {
	public static void main(String[] args) {
		int[] intArr = { 1, 2, 3, 4, 5 };

		IntStream intStream = Arrays.stream(intArr);
		intStream = IntStream.of(intArr);
		intStream.asDoubleStream().forEach(d -> System.out.println(d));

		System.out.println();

		intStream = Arrays.stream(intArr);
		intStream.boxed().forEach(obj -> System.out.println(obj.intValue()));
//		IntStream iS = intStream.boxed();
		Stream<Integer> iS2= intStream.boxed();
	}
}
