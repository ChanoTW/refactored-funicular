package �޼ҵ�;

import java.util.Scanner;

public class Exam04�޼ҵ忹��4 {

	public static void main(String[] args) {
		//2���� ������ �޾� 2���� ������ 10�� �� ����� ���� ��ȯ�ϴ� �޼ҵ� close10�� ��������
		//(���� �� ���� ��� 10���� ���̰� ���ٸ� 0�� ��ȯ)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� >>");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� >>");
		int num2 = sc.nextInt();
		
		System.out.println(close10(num1,num2));

	}
	
	
	public static int close10(int x1, int x2) {
		
//		//(���밪 x1,x2�� ���� ã�Ƽ� ���ϱ�)
//		int result = 0;
//		
//		//1. 10���κ��� ���̳��� ���� ����� ����
//		int chai1 = x1-10;
//		
//		if(chai1 < 0) {
//			chai1 = -chai1;
//		}
//		
//		chai1 = chai1>0? chai1 : -chai1;
//		
//		int chai2 = x2-10;
//		if(chai2 < 0) {
//			chai2 = -chai2;
//		}
//		
//		chai2 = chai2>0? chai2 : -chai2;
//		
//		2. 10���κ��� ����� �� ã��
//		
//		if(chai1 > chai2) {
//			result = x2;
//		} else if (chai1 < chai2) {
//			result = x1;
//		}
//		
//		return result;
		
		//Math class�� �ִ� abs() ���밪 �Լ� ����ϱ�
		int a = Math.abs(10 - x1);
		int b = Math.abs(10 - x2);
		
		if(a > b) {
			return x1;
		} else if (a < b) {
			return x2;
		} else {
			return 0;
		}
		
		
		
		
		
	}

	
	
	
}
