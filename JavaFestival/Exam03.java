package JavaFestival;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("À±³â : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("À±³â");
		} else {
			System.out.println("À±³â¾Æ´Ô");
		}

	}

}
