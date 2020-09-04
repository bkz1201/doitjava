package chapter07;

//젤밑에 뭔가 설명있음 참고
public class ArrayEx05 {
	public static void main(String[] args) {
		int[] iArr = { 1, 2, 3 };
		String[] sArr = { "이일", "이이", "사암" };

		for (int i = 0; i < 3; i++) {
			System.out.println(iArr[i] + " : " + sArr[i]);
		}
		System.out.println();

		int[] arr1 = { 1, 2 };
		int[] arr2 = { 3, 4 };
		int[][] array = new int[2][]; // 이차원배열 x,y 표,평면
		array[0] = arr1;
		array[1] = arr2;

		for (int i = 0; i < array.length; i++) {//세로길이
			for (int j = 0; j < array[0].length; j++) {//가로길이
				System.out.println(array[i][j]);
			}
//			System.out.println(array[i]);	//array[0] array[1] 출력(메모리주소)
		}
	}
}

/*
 * String 배열같이 배열의 요소가 객체(메모리주소)일 경우 객체(메모리주소) 가 저장된다. 배열은 배열을 요소로 가질 수 있다.
 */
