package chapter13;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("출근");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어남");
			work();
		}
	};
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책");
			}
			@Override
			void wake() {
				System.out.println("8시기상");
				walk();
			}
		};
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
