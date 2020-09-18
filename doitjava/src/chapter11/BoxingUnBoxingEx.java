package chapter11;

public class BoxingUnBoxingEx {
	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		int val1 = obj1.intValue();
		int val2 = obj2.intValue();
		int val3 = obj3.intValue();

		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
	}
}
