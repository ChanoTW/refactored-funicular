package JavaFestival;

import java.util.Scanner;

public class Exam09소인수분해 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
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
