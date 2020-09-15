package chapter09;

public class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("사람 한다 운전");
		System.out.println("사람 한다 조작 핸들을");
	}

	@Override
	public void stop() {
		System.out.println("한다 정지 브레이크로");
	}
}
