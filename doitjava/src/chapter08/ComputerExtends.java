package chapter08;

import com.sun.javafx.geom.Area;

public class ComputerExtends extends CalculatorExtends {
	@Override		//��ǻ�͸� ���� �ּ� ��� �������
	//�޼ҵ��� ���� ���ϰ� �Ű������� ������ ���� �����ؾ���
	double areaCircle(double r) {
		System.out.println("Computer ��ü�� areaCircle()");
		return Math.PI * r * r;
	}
}
