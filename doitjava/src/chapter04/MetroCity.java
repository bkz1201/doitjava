package chapter04;

public class MetroCity {
	public static void main(String[] args) {
		boolean isCapital = false;
		boolean isMetro = false;
		int citizen = 0;
		int rich = 0;

		System.out.println("���� ���ô� ��Ʈ�������� �Դϱ�?");

		isCapital = true;
		citizen = 150; // '��'���� ���
		rich = 50;

//		if (isCapital) {
//			if (citizen >= 100) {
//				isMetro = true;
//			} else if (rich >= 50) {
//				isMetro = true;
//			}
//		} else {
//			if (rich >= 50) {
//				isMetro = true;
//			}
//		}
		
//		if (isCapital && (citizen >= 100)) {
//			isMetro = true;
//		} else if (rich >= 50) {
//			isMetro = true;
//		} else {
//			isMetro = false;
//		}
		
		isMetro = (isCapital && citizen >= 100) || rich >= 50 ? true : false;
		
		System.out.println("�������� : "+isCapital);
		System.out.println("�α��� : "+citizen +"����");
		System.out.println("���ڼ� : "+rich+"����");
		System.out.println(isMetro ? "��Ʈ���������Դϴ�." : "��Ʈ���������� �ƴմϴ�");

	}
}
