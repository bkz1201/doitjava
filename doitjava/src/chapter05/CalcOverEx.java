package chapter05;

public class CalcOverEx {
	public static void main(String[] args) {
		CalcOver myCalcu = new CalcOver();

		double res1 = myCalcu.areaRectangle(10);
		double res2 = myCalcu.areaRectangle(10, 20);

		System.out.println("정사각형 넓이 : " + res1);
		System.out.println("직사각형 넓이 : " + res2);
	}
}
