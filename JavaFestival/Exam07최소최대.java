package JavaFestival;

import java.util.Scanner;

public class Exam07�ּ��ִ� {

	public static void main(String[] args) {
		//�ִ����� �ּҰ���� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 1 : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 : ");
		int num2 = sc.nextInt();
		int i = 1;
		
		//��� ���ϱ�
		System.out.print("���� 1�� ��� : ");
		for(i = 1; i<=num1; i++) {
			if(num1 % i == 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.print("���� 2�� ��� : ");
		for(i = 1; i<=num2; i++) {
			if(num2 % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		//����� ���ϱ�
		int j = 0;
		System.out.println();
		System.out.print("����1�� ����2�� ����� : ");
		for(i = 1; i<=num1 && i<=num2; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.print(i+" ");
				j = i;
			}
		}
		
		//�ּҰ���� �ִ����� ���ϱ�
		System.out.println();
		System.out.println("�ִ� ����� :" + j);
		System.out.println("�ּ� ����� :" + num1/j*num2/j*j);
		
		
		
	}

}
