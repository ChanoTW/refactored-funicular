package �޼ҵ�;

import java.util.Scanner;

public class Exam08�޼ҵ�����ε� {

	public static void main(String[] args) {
		//�޼ҵ� �����ε� ���� ����!!!
		
		int a = 10;
		int b = 2;
		
		//�ΰ� ���� ������ �� �ִ� add() �����
		add(10, 2);
		add1(10, 2.4);

		Scanner sc = new Scanner(System.in);
		sc.next();
		
	}
	
	//������ add �޼ҵ� �Լ�
	public static void add(int a, int b) {
		System.out.println(a+b);

	}
	
	//�������� add�޼ҵ带 �ߺ����� �Ͽ� ������ �޼ҵ�
	public static void add1(int a, double b) {
		System.out.println(a+b);
	}

}
