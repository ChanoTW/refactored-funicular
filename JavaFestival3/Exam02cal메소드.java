import java.util.Scanner;

public class Exam02cal메소드 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 >>");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 >>");
		int num2 = sc.nextInt();
		
		char op = '-';
		
		System.out.println(cal(num1,num2,op));

	}
	
	public static int cal(int x1, int x2, char x3) {
		return x1 - x2;
		
		
		
		
		
	}

}
