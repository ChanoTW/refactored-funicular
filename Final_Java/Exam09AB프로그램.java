package Final_Java;

import java.util.Scanner;

public class Exam09AB프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("A 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("B 입력 : ");
			int num2 = sc.nextInt();
			if(num1 == 0 && num2 == 0) {
				System.out.println("프로그램 종료!");
				break;
			} else {
				System.out.println("결과 >> " + (num1-num2));
			}
			
			
		}

	}

}
