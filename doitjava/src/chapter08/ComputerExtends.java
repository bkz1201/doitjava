package chapter08;

import com.sun.javafx.geom.Area;

public class ComputerExtends extends CalculatorExtends {
	@Override		//컴퓨터를 위한 주석 없어도 상관없음
	//메소드의 형태 리턴값 매개변수의 종류와 수도 동일해야함
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle()");
		return Math.PI * r * r;
	}
}
