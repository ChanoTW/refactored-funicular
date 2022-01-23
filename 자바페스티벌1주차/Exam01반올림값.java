package 자바페스티벌1주차;

import java.util.Scanner;

public class Exam01반올림값 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int num = sc.nextInt();
		
		if (num % 10 >= 5) {
			System.out.print("반올림 후 값 : " +(num/10*10+10));
		} else {
			System.out.print("반올림 후 값 : " +(num/10*10));
		}
		
		
	}
}
