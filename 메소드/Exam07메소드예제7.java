package �޼ҵ�;

import java.util.Scanner;

public class Exam07�޼ҵ忹��7 {

	public static void main(String[] args) {
		//����� ���� ���Ͽ� ��ȯ�ϴ� getSumOfDivisors()�޼ҵ带 �����ϼ���.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� >> ");
		int num = sc.nextInt();
		
		//num�� ����� ���� �հ�
		int result = getSumOfDivisors(num);
		System.out.println(num + "�� ����� �� : " + result);
		
		//num�� ������� ���
		getDivisors(num);

	}
	
	
	public static int getSumOfDivisors(int x1){
		
		int save = 0;
		//��� : 1���� ������ �� ���� �������� 0���� �� ������ ����̴�.
		for(int i = 1; i<=x1; i++) {
			if(x1 % i == 0) {
				save += i;
			}
			
		}
		return save;
	}
	
	public static void getDivisors(int x1) {
		
		System.out.print(x1 + "�� ��� : ");
		for(int i = 1; i<=x1; i++) {
			if(x1 % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
