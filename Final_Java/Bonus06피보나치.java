package Final_Java;

public class Bonus06피보나치 {

	public static void main(String[] args) {
		
		int input = 8;
		
		for(int i = 1; i<=input; i++) {
			System.out.print(fibo(i)+" ");
		}

	}

	private static int fibo(int i) {
		
		
		if(i <= 2) {
			return 1;
		} else {
			return fibo(i-2) + fibo(i-1);
		}

	}

}
