package �ڹ��佺Ƽ��1����;

import java.util.Scanner;

public class Exam01�ݿø��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݿø� �� �� : ");
		int num = sc.nextInt();
		
		if (num % 10 >= 5) {
			System.out.print("�ݿø� �� �� : " +(num/10*10+10));
		} else {
			System.out.print("�ݿø� �� �� : " +(num/10*10));
		}
		
		
		
	}
}
