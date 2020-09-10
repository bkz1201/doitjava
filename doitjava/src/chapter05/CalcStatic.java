package chapter05;

public class CalcStatic {
	//static Á¤Àû ¸â¹ö
	static double pi = 3.14159;

	//ÀÎ½ºÅÏ½º ¸â¹ö
	int num1 = 10;
	static int num2 = 20;

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int x, int y) {
		return x - y;
	}

	int multiply(int x, int y) {
		return x * y;
	}
}
