package JavaFestival;

import java.util.Scanner;

public class Exam09���μ����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
		int num = sc.nextInt();

		System.out.print(num + "=");
		if (num == 1) {
			System.out.print("1");
		}
		for (int i = 2; i <= num; i++) {
			while (num % i == 0) {
				num /= i;
				System.out.print(i);
				if (i < num) {
					System.out.print("*");
				}
			}
		}
		

	}

}
