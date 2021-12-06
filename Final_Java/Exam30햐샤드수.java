package Final_Java;

public class Exam30Çá»þµå¼ö {

	public static void main(String[] args) {
		System.out.println(isHarshad(18));

	}

	private static boolean isHarshad(int x) {
		
		if(x % (x % 10 + x/10) == 0 ) {
			return true;
		}

		return false;
	}

}
