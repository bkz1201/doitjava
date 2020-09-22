package chapter12;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.sun.jmx.snmp.Enumerated;

public class IterTest {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);// aslist로 생성된 리스트는 추가 삭제가 불가능하다.
		System.out.println(list.size());
		System.out.println();

		Iterator<Integer> ir = list.iterator();
		while (ir.hasNext()) {
			int number = ir.next();
			System.out.println(number);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		for (int num : list) {
			System.out.println(num);
		}
//
//		while (!list.isEmpty()) {
//			int number = list.remove(0);
//			System.out.println(number);
//		}
	}
}
