package Practice;

import java.util.Random;
import java.util.Scanner;

public class Exam05NX���α׷� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� >> ");
		int n = sc.nextInt();
		System.out.print("X �Է� >> ");
		int x = sc.nextInt();
		int i = 0;

		int[] arr = new int[n];
		for (i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° ���� �Է� >> ");
			arr[i] = sc.nextInt();
		} System.out.println();
		
		System.out.print("��� >> ");
		for(i = 0; i < arr.length; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}

	}

}
