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
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "Hankook타이어 펑크 ***");
			return false;
		}
	}
}
