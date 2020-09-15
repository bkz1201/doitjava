package chapter09;

public class AICar extends Car {
	@Override
	public void drive() {
		System.out.println("자율주행");
		System.out.println("방향전환자동");
	}

	@Override
	public void stop() {
		System.out.println("스스로 그만! 멈춥니다");
	}
}
