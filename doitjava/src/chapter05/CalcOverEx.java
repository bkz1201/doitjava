package chapter05;

public class CalcOverEx {
	public static void main(String[] args) {
		CalcOver myCalcu = new CalcOver();

		double res1 = myCalcu.areaRectangle(10);
		double res2 = myCalcu.areaRectangle(10, 20);

		System.out.println("���簢�� ���� : " + res1);
		System.out.println("���簢�� ���� : " + res2);
	}
}
