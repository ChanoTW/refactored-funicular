package JavaFestival;

import java.util.Scanner;

public class Exam04���ڸ����� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		
		int num3 = num2%10;
		int num4 = num2%100/10;
		int num5 = num2/100;
		
		System.out.println(num1*num3);
		System.out.println(num1*num4);
		System.out.println(num1*num5);
		System.out.println(num1*num2);

	}

}
