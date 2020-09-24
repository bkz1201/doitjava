package chapter13;

public class AnonymouseEx {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();

		anony.field.wake();

		anony.method1();

		anony.method2(new Person() {
			void study() {
				System.out.println("����");
			}

			@Override
			void wake() {
				System.out.println("8�� ���");
				study();
			}
		});
		Person a = new Person();
		a.wake();
	}
}
