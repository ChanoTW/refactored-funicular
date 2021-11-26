package Practice;

import java.util.Scanner;

public class Exam08오름차순 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		int num = 0;
		int i = 0;
		int j = 0;
		int save = 0;
		int save_num = 0;
		int min = 0;

		//숫자지정
		for (num = 0; num < 5; num++) {
			System.out.print(num + 1 + "번째 정수입력 >> ");
			arr[num] = sc.nextInt();
		}

		//숫자 비교
		System.out.println("정렬 후 >> ");
		for (i = 0; i < 5; i++) {
			save = i;//save변수에 배열 n번째 준비 완료
			save_num = arr[i];//n번째 변수 비교 준비 완료 
			for (j = i + 1; j < 5; j++) {
				if (arr[i] < arr[j]) {
					min = arr[i];//최소값을 처장
					arr[i] = arr[j];
					arr[j] = min;
					
				}
			}
			System.out.println(min);
		}

		
		
		
	}
}