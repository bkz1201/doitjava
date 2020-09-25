package chapter13;

public class ImplNum implements MyNumber {
	public int getMax(int num1, int num2) {
		return num1 >= num2 ? num1 : num2;
	}
}
