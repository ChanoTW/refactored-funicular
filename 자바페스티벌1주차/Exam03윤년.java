package ÀÚ¹ÙÆä½ºÆ¼¹ú1ÁÖÂ÷;

import java.util.Scanner;

public class Exam03À±³â {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("³âµµ : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0) {
			System.out.println("À±´Þ");
		} else if(year % 400 == 0){
			System.out.println("À±´Þ");
		} else {
			System.out.println("À±´Þ¾Æ´Ô");
		}
		
		
		
	}

}
