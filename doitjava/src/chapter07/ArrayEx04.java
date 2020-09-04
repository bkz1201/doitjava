package chapter07;

public class ArrayEx04 {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// arr1={10,20,30,40,50}; 중괄호는 선언후 초기화할때 사용 가능
		arr1[0] = 10; // 배열의 요소들은 모두 변수처럼 사용 가능하다
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println();
		int[] arr2 = new int[10];
		System.out.println(arr2.length);
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println();
		arr2 = arr1; // 배열은 객체(메모리주소)를 가르키고있기 때문에 서로 대입할수있다
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println(arr2.length);

		System.out.println();
		int a = 10;
		int b = 20;
		b = a;
		System.out.println(b); // 변수는 객체(메모리주소)가 아닌 값을 다룸

		arr2 = new int[] { 100, 200, 300 };	//19번줄의 연장으로 새로운 배열을 만들어서 대입하는것도 가능
	}
}
