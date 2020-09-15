package chapter08;

public class KumhoTire extends Tire {
//	public int maxRotation;
//	public int accumulatedRotation;
//	public String location;
//
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " Kumho ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoŸ�̾� ��ũ ***");
			return false;
		}
	}
}
