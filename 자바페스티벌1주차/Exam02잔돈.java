package �ڹ��佺Ƽ��1����;

import java.util.Scanner;

public class Exam02�ܵ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ� : ");
		int money = sc.nextInt();
		
		System.out.println("==�ܵ���ȯ==");
		System.out.println("10000�� : " + (money/10000));
		System.out.println("5000�� : " + (money%10000/5000));
		System.out.println("1000�� : " + (money%5000/1000));
		System.out.println("500�� : " + (money%1000/500));
		System.out.println("100�� : " + (money%500/100));

	}

}
