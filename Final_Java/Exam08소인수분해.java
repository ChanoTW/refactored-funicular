package Final_Java;

import java.util.Scanner;

public class Exam08소인수분해 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int num = sc.nextInt();
		int index = 0;

		System.out.print(num + " = ");

		for (int i = 2; i <=num; i++) {
			while (num % i == 0) {
				if(num != i && num % i == 0) {
					System.out.print(i + "*");
					num /= i;
				} else if (i==num) {
					System.out.println(i);
					break;
				}
			}

		}
		if(num == 1) {
			System.out.print("1");
		}

	}

}
