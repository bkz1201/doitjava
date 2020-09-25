package chapter13;

public class TestMyNumber {
	public static void main(String[] args) {
//		MyNumber max = (x, y) -> (x >= y) ? x : y;
//		System.out.println(max.getMax(10, 20));
		int num1 = 10;
		int num2 = 20;
		
		//클래스기반객체
		ImplNum in = new ImplNum();
		int res = in.getMax(num1, num2);
		System.out.println("in1 : " + res);
		
		//익명구현객체
		MyNumber in2 = new MyNumber() {
			@Override
			public int getMax(int num1, int num2) {
				// TODO Auto-generated method stub
				return num1 >= num2 ? num1 : num2;
			}
		};
		res = in2.getMax(num1, num2);
		System.out.println("in2 : " + res);
		
		//람다식
		MyNumber in3 = (x,y) -> x >= y ? x : y;
		//자료형 생략가능 한줄일 경우 중괄호 생략가능 return생략가능

		res = in3.getMax(num1, num2);
		System.out.println("in3 : " + res);
	}
}
