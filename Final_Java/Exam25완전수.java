package Final_Java;

public class Exam25¿ÏÀü¼ö {

	public static void main(String[] args) {
		
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	private static void getPerfectNumber(int startValue, int endValue) {
		
		int index = 0;
		
		for(int i = startValue; i<=endValue; i++) {
			for(int j = 1; j<i; j++) {
				if(i % j == 0) { 
					index += j;
				}
			}
			if (index == i) {
				System.out.println(index);
			}
			index = 0;
		}
		
		
	}

}
