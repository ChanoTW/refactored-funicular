import java.util.Scanner;

public class Exam01isDivide�޼ҵ� {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� >>");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� >>");
		int num2 = sc.nextInt();
		
		boolean result = isDivide(num1, num2);
		System.out.println("��� Ȯ�� : " + result);
		
		
		
	}
	
	public static boolean isDivide(int x1, int x2) {
		
		if(x1 % x2 == 0) {
			return true;
		} else {
			return false;
		}
		
		
	}

}
