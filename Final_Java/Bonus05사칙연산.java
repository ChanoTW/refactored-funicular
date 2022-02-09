package Final_Java;

public class Bonus05»çÄ¢¿¬»ê {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		System.out.println(cal(num1,num2,op));

	}

	private static int cal(int num1, int num2, char op) {
		
		if(op == '+') {
			return num1 + num2;
		} else if (op == '-') {
			return num1 - num2;
		} else if (op == '*') {
			return num1 * num2;
		} else if (op == '/') {
			return num1 / num2;
		} else {
			return 0;
		}
		
		
		
	}

}
