package JavaFestival;

import java.util.Scanner;

public class Exam01반올림 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int num = sc.nextInt();
		int a = num%10;
		
		if(a >= 5) {
			System.out.println("반올림 후 값 : "+(num/10*10+10));
		}else {
			System.out.println("반올림 후 값 : "+(num/10*10));
		}
		
		
	}
}
