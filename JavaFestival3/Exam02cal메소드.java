import java.util.Scanner;

public class Exam02cal�޼ҵ� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� >>");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� >>");
		int num2 = sc.nextInt();
		
		char op = '-';
		
		System.out.println(cal(num1,num2,op));

	}
	
	public static int cal(int x1, int x2, char x3) {
		return x1 - x2;
		
		
		
		
		
	}

}
