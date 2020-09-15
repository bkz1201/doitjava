package chapter08;

public class HankookTire extends Tire {
//	public int maxRotation;
//	public int accumulatedRotation;
//	public String location;
//
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ���� : " + (maxRotation - accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*** " + location + "HankookŸ�̾� ��ũ ***");
			return false;
		}
	}
}
