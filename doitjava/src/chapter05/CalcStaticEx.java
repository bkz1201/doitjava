package chapter05;

public class CalcStaticEx {
	public static void main(String[] args) {
		double res1 = 10 * 10 * CalcStatic.pi;
		int res2 = CalcStatic.plus(10, 5);
		int res3 = CalcStatic.minus(10, 5);

		CalcStatic calcs = new CalcStatic();
		CalcStatic calcs2 = new CalcStatic();

		System.out.println("result1 = " + res1);
		System.out.println("result2 = " + res2);
		System.out.println("result3 = " + res3);
		System.out.println("calcs.pi = " + calcs.pi);
		System.out.println("result4 = " + calcs.multiply(10, 20));

		System.out.println(calcs.num1);
		System.out.println(calcs2.num1);

		calcs.num1 = 20;
		calcs2.num1 = 200;
		System.out.println(calcs.num1);
		System.out.println(calcs2.num1);
		
		System.out.println(calcs.num2);
		System.out.println(calcs2.num2);
		
		calcs.num2 = 30;
		System.out.println(calcs.num2);
		System.out.println(calcs2.num2);
		calcs2.num2 = 300;
		System.out.println(calcs.num2);
		System.out.println(calcs2.num2);
	}
}
