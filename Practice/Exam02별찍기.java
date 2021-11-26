package Practice;

import java.util.Scanner;

public class Exam02별찍기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int star = sc.nextInt();
		
		for(int j = star; j>0; j--) {
			for(int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		

	}

}
