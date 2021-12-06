package Final_Java;

import java.util.Scanner;

public class Exam13NX프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 : ");
		int n = sc.nextInt();
		System.out.print("X 입력 : ");
		int x = sc.nextInt();
		
		int[] arr = new int[10];
		
		for(int i = 0; i<10; i++) {
			System.out.print(i+1 + "번째 정수 입력 >>");
			int num = sc.nextInt();
			arr[i] = num;
		}
		System.out.print("결과 >>");
		for(int i = 0; i<10; i++) {
			if(x>arr[i]) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
