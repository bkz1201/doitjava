package chapter05;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();

		car.setModel("�׷���");
		car.setColor("����");
//		car.model = "�׷���";
//		car.color = "����";
		
		car.info();
		System.out.println(car.getModel());
	}
}
