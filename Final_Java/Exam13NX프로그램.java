package Final_Java;

import java.util.Scanner;

public class Exam13NX���α׷� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� : ");
		int n = sc.nextInt();
		System.out.print("X �Է� : ");
		int x = sc.nextInt();
		
		int[] arr = new int[10];
		
		for(int i = 0; i<10; i++) {
			System.out.print(i+1 + "��° ���� �Է� >>");
			int num = sc.nextInt();
			arr[i] = num;
		}
		System.out.print("��� >>");
		for(int i = 0; i<10; i++) {
			if(x>arr[i]) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
