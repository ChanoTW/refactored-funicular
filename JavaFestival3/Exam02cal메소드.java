import java.util.Scanner;

public class Exam02cal메소드 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		System.out.println(cal(num1,num2,op));
		
	}
	public static int cal(int a, int b, char c) {
		
		if(c == '+') {
			return a + b;
		} else if (c == '-') {
			return a - b;
		}
		else if (c == '*') {
			return a * b;
		}
		else if (c == '/') {
			return a / b;
		}
		
	}

}

