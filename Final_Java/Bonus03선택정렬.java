package Final_Java;

import java.util.Scanner;

public class Bonus03�������� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [5];
		
		for(int i = 0; i<5; i++) {
			System.out.print(i+1 + "��° �� �Է� : ");
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
		
		System.out.print("���� �� : ");
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		
	}

}
