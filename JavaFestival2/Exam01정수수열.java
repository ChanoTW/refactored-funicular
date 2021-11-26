package Practice;

import java.util.Scanner;

public class Exam01정수수열 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		int j = 1;
		
		for(int i = 1; i<=num; i++) {
			System.out.print(j+" ");
			j += i;
		}
		

	}

}
