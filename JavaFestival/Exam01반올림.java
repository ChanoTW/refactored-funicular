package JavaFestival;

import java.util.Scanner;

public class Exam01�ݿø� {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݿø� �� �� : ");
		int num = sc.nextInt();
		int a = num%10;
		
		if(a >= 5) {
			System.out.println("�ݿø� �� �� : "+(num/10*10+10));
		}else {
			System.out.println("�ݿø� �� �� : "+(num/10*10));
		}
		
		
	}
}
