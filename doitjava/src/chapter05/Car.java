package chapter05;

public class Car {
	private String model;
	private String color;
	private int gear;
	private int speed;
	private int max_speed;

	void info() {
		System.out.println(model + ", " + color);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSpeed() {
		if (speed < 0) {
			this.speed = 0;
//			return 0;
		}
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getMax_speed() {
		return max_speed;
	}

	public void setMax_speed(int max_speed) {
		this.max_speed = max_speed;
	}

//	String getModel() {
//		return model;
//	}
//
//	void setModel(String model) {
//		this.model = model;
//	}

//	String getColor() {
//		return color;
//	}
//
//	void setColor(String color) {
//		this.color = color;
//	}

}
