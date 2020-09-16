package chapter09;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("°³ºü¸§");
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("°³³ôÀÌ¶Ü");
	}

	@Override
	public void turn() {
		// TODO Auto-generated method stub
		System.out.println("ºù±×¸£¸£µ·´Ù");
	}

	@Override
	public void showLevelMessage() {
		// TODO Auto-generated method stub
		System.out.println("========Åä³¢°Ïµà========");
	}

}
