package �ڹ��佺Ƽ��1����;

import java.util.Scanner;

public class Exam08���丮�� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� : ");
		int num = sc.nextInt();
		int j = 1;
		
		for(int i = 1; i<=num; i++) {
			j*=i;
		}
		System.out.println("��� : " + j);

	}

}
