package example;

import java.util.HashSet;
import java.util.Set;

public class Ex18 {
	public static void main(String[] args) {
		int num = 0;
		Set<Integer> set = new HashSet<Integer>();	//set이란 이름의 정수형Set
		while (set.size() < 6) {					//set의 사이즈는 6
			num = (int) (Math.random() * 48) + 1;	//난수발생기
			set.add(num);							//set에 추가
		}
		System.out.println("로또 번호 생성기");
		for (int n : set) {
			System.out.print(n + " ");
		}
	}
}
/*
 * Set : 데이터를 담을수있는 공간
*/