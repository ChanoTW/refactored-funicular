package ÀÚ¹ÙÆä½ºÆ¼¹ú1ÁÖÂ÷;

import java.util.Scanner;

public class Exam02ÀÜµ· {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("±Ý¾× : ");
		int money = sc.nextInt();
		
		System.out.println("==ÀÜµ·º¯È¯==");
		System.out.println("10000¿ø : " + (money/10000));
		System.out.println("5000¿ø : " + (money%10000/5000));
		System.out.println("1000¿ø : " + (money%5000/1000));
		System.out.println("500¿ø : " + (money%1000/500));
		System.out.println("100¿ø : " + (money%500/100));

	}

}
