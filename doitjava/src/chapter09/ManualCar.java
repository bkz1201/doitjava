package chapter09;

public class ManualCar extends Car {
	@Override
	public void drive() {
		System.out.println("��� �Ѵ� ����");
		System.out.println("��� �Ѵ� ���� �ڵ���");
	}

	@Override
	public void stop() {
		System.out.println("�Ѵ� ���� �극��ũ��");
	}
}
