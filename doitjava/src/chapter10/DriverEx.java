package chapter10;

public class DriverEx {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);

		Vehicle d;
		d = new Vehicle() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("슈퍼카가 달린");
			}
		};
		d.run();
			
		
	}
}
