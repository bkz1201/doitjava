package chapter04;

public class IfEx01 {
	public static void main(String[] args) {
		int score = 80;

		if (score >= 90) {
			System.out.println("������ 90���� ũ�ų� �����ϴ�.");
			System.out.println("����� A�Դϴ�.");
		} else {	//else�� if���� ������ false�϶� ����˴ϴ�.
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("����� B�Դϴ�.");
		}

//		if (score < 90) {
//			System.out.println("������ 90���� �۽��ϴ�.");
//			System.out.println("����� B�Դϴ�.");
//		}

		System.out.println("The End");
	}
}
