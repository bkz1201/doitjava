package chapter08;

public class MixerEx {
	public static void main(String[] args) {
		Mixer m = new Mixer();
		Fruit f = new Fruit();
		m.mixing(f);

		m.mixing(new Apple());
		m.mixing(new Melon());
		m.mixing(new Meat());
		
		Mixer2 m2 = new Mixer2();
		m2.Mixing(new Apple());
//		m2.Mixing(new Melon());
	}
}
