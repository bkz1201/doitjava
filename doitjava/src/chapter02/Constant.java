package chapter02;

public class Constant {
	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
//		MAX_NUM = 1000;	상수로 선언된 변수는 값의 변경이 불가능하다.
	}
}
