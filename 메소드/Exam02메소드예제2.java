package �޼ҵ�;

import java.util.Scanner;

public class Exam02�޼ҵ忹��2 {

	public static void main(String[] args) {
		//������ ���� num1�� num2�� ���� �ʱ�ȭ �ϰ�
		//������ ���� op�� ������ ���ϴ� �����ڷ� �ʱ�ȭ �ϼ���
		//num1, num2, op�� �޾� num1�� num2�� op�� �°� ������
		//���� ���� ��ȯ���ִ� cal �޼ҵ带 �ۼ��ϼ���
		
		
		//1. ����ڷκ��� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� >>");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� >>");
		int num2 = sc.nextInt();
		
		//1-2. ������ �Է¹ޱ� (String�� �Ἥ) 
		System.out.print("������ �Է�(+, -, *, /) >> ");
		String op = sc.next();
		
		//1-3 (char�� �Ἥ)
		//char op = '-';
		
		
		//��� �� ���
		System.out.print("����� : " + cal(num1, num2, op));

	}
	//cal�޼ҵ� ����
	public static int cal(int num1, int num2, String op) {
		
		//����� ���� �� �ִ� ���� ����
		//int result = 0;
		
		//�����ڸ� �� �ϱ�
		if(op.equals("+")) {
			return num1 + num2;
		}else if(op.equals("-")){
			return num1 - num2;
		}else if(op.equals("*")){
			return num1 * num2;
		}else if(op.equals("/")) {
			return num1 / num2;
		}else {
			return 0;
		}
		
		//return result;
		
	}
	
//	public static int cal(int num1, int num2, char op) {
//		if(op == '-') {
//			return num1-num2;
//		} else {
//			return num1*num2;
//		}
//		
//		
//	}

}
