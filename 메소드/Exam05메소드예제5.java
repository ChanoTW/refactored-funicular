package �޼ҵ�;

import java.util.Scanner;

public class Exam05�޼ҵ忹��5 {

	public static void main(String[] args) {
		// Ű����κ��� �Է¹��� �ΰ��� ������ ����(�Ű�����)�� �Ѱܹ޾�
		// num1���� num2�� �� ������� ���밪���� �ٲپ� ����ϴ�
		// getAbsoluteValue() �޼Ҹ� �����ϼ���

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� >> ");
		int num2 = sc.nextInt();

		System.out.println(getAbsoluteValue(num1, num2));

	}

	public static int getAbsoluteValue(int x1, int x2) {
		
		int abs = x1 - x2;

//		if (abs < 0) {
//			abs = -abs;
//			return abs;
//		} else {
//			return abs;
//		}
		
		return (abs > 0 ? abs : -abs);
		

	}

}
