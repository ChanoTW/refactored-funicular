package Final_Java;

import java.util.Scanner;

public class Exam11����� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int star = sc.nextInt();
		
		for(int i = 0; i<star; i++) {
			for(int j = i; j<star; j++) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
