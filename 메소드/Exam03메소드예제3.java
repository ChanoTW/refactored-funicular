package �޼ҵ�;

import java.util.Scanner;

public class Exam03�޼ҵ忹��3 {

	public static void main(String[] args) {
		// 2���� ����� �޾� 2���� ���� �� �� ū ���� ��ȯ�ϴ� �޼ҵ� largerNumbers()�� ��������
		// ����, �� ���ڰ� ���ٸ� 0�� ��ȯ�ϰ��

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();

		int result = (largerNumber(num1, num2));
		System.out.println("�� ū �� : " + result);

	}

	public static int largerNumber(int x1, int x2) {
		// if�� ���
//		if (x1 > x2) {
//			return x1;
//		} else if (x1 < x2) {
//			return x2;
//		} else {
//			return 0;
//		} 

		// ���׿����ڸ� �̿��� �˰��� ����� (���� ? �� : ����)
		return (x1 == x2 ? 0 : (x1 > x2 ? x1 : x2));
		//(���� ? �� : (������ ���� ���� ? �� : ����))���� ǥ������

	}

}
