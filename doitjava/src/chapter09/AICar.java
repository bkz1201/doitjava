package chapter09;

public class AICar extends Car {
	@Override
	public void drive() {
		System.out.println("��������");
		System.out.println("������ȯ�ڵ�");
	}

	@Override
	public void stop() {
		System.out.println("������ �׸�! ����ϴ�");
	}
}
