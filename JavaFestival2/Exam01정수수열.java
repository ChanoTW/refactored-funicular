package Practice;

import java.util.Scanner;

public class Exam01�������� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n �Է� : ");
		int num = sc.nextInt();
		int j = 1;
		
		for(int i = 1; i<=num; i++) {
			System.out.print(j+" ");
			j += i;
		}
		

	}

}
