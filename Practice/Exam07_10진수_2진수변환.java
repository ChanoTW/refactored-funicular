package Practice;

import java.util.Scanner;

public class Exam07_10진수_2진수변환 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >>");
		int num = sc.nextInt();
		String result = "";
		String[] arr = new String[num];
		int i = 0;
		int j = 0;
		// 2진법 만들기

		for (i = num; num > 0; num /= 2) {
			if (num % 2 == 0) {
				result = "0";
			} else {
				result = "1";
			}
			arr[j] = result;
			j++;
		}
		
		for (j = j-1; j>=0; j--) {
			System.out.print(arr[j]);
		}

//		for (int j = 1; j < num; j++) {
//			
//		}
//
//		for (i = 0; i < num; i++) {
//			if (i % 2 == 0) {
//				arr[i] = 0;
//			} else {
//				arr[i] = 1;
//			}
//		}

	}

}
