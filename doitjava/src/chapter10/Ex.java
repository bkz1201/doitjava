package chapter10;

public class Ex {
	public static void main(String[] args) {
		ImpleC impl = new ImpleC();

		A ia = impl;
		ia.methodA();

		B ib = impl;
		ib.methodB();

		C ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
