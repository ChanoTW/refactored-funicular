package �ڹ��佺Ƽ��1����;

import java.util.Scanner;

public class Exam07�ּҰ�����ִ����� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		int i = 1;
		int j = 0;
		
		System.out.print("����� : ");
		for(i = 1, j = 1; i<=num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.print(i+" ");
				j=i;
			}
		}System.out.println();
		System.out.println("�ִ����� : " + j);
		System.out.println("�ּҰ���� : " + num1*num2/j);

		
	}

}
