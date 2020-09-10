package chapter05;

public class CarEx {
	public static void main(String[] args) {
		Car car = new Car();

		car.setModel("그랜져");
		car.setColor("검정");
//		car.model = "그랜져";
//		car.color = "검정";
		
		car.info();
		System.out.println(car.getModel());
	}
}
