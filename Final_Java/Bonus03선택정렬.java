package Final_Java;

import java.util.Scanner;

public class Bonus03선택정렬 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [5];
		
		for(int i = 0; i<5; i++) {
			System.out.print(i+1 + "번째 수 입력 : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = i; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.print("정렬 후 : ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}


		
	}

}
