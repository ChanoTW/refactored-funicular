import java.util.Scanner;

public class Exam01isDivide메소드 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 >>");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 >>");
		int num2 = sc.nextInt();
		
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);
		
		
		
	}
	
	public static boolean isDivide(int x1, int x2) {
		
		if(x1 % x2 == 0) {
			return true;
		} else {
			return false;
		}
		
		
		
	}

}
