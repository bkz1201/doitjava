package chapter13;

public class TestStringConcat {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Wolrd";
		int num = 10;
		StringConcatImpl concat1 = new StringConcatImpl();
		concat1.makeString(s1, s2);

		StringConcat concat2 = (a, b) -> System.out.println(a + ", " + b);
		concat2.makeString(s1, s2);

		StringConcat concat3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				// TODO Auto-generated method stub
				System.out.println(num);
				System.out.println(s1 + ", " + s2);
			}
		};
		concat3.makeString(s1, s2);

	}
}
