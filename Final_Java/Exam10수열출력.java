package Final_Java;

import java.util.Scanner;

public class Exam10������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n �Է� : ");
		int num = sc.nextInt();
		int index = 1;
		for(int i = 1; i<=num; i++) {
			System.out.print(index + " ");
			index += i;
		}

	}

}
