package example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {
		// 실행시마다 값이 달라지는 랜덤함수를 사용하여
		// 6개의 요소를 가진 배열을 만든 후 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 번호 생성기입니다. 몇게임을 생성 하시겠습니까?");
		int game = sc.nextInt();
		int[] arr = new int[6];
		for (int z = 0; z < game; z++) {// 입력받은 숫자만큼 게임횟수 반복
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (int) (Math.random() * 45) + 1;// 로또 번호 생성
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {// 번호 중복 검사 이전에 생성된 번호와 이번에 생성된 번호
						i--;// 중복일시 이번에 생성된번호 다시 생성을위해 i값 감소
						break;// i 증감식으로 이동하면서 i값 변동없음
					}
				}
			}

			Arrays.sort(arr);// 오름차순으로 정렬
			System.out.print(z + 1 + "회차 : ");
			for (int i = 0; i < arr.length; i++) {// 로또번호 z+1회차분 출력
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
}
