package JavaFestival;

import java.util.Scanner;

public class Exam02�Ž����� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ� : ");
		int money = sc.nextInt();
		
		int a = money/10000;
		int b = money%10000/5000;
		int c = money%5000/1000;
		int d = money%1000/500;
		int e = money%500/100;
		
		System.out.println("10000�� : "+a);
		System.out.println("5000�� : "+b);
		System.out.println("1000�� : "+c);
		System.out.println("500�� : "+d);
		System.out.println("100�� : "+e);
		
	}
}
