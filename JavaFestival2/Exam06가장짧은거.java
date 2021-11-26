package Practice;

public class Exam06가장짧은거 {

	public static void main(String[] args) {

		int[] point = { 92, 32, 52, 9, 81, 2, 68 };
		int i = 0;
		int j = 0;
		int k = 0;
		int l = 100;
		int result1 = 0;
		int result2 = 1;

		for (i = 0; i < point.length; i++) {
			for (j = 0; j < point.length; j++) {
				if (point[i] > point[j]) {
					k = point[i] - point[j];
				} else if (point[j] > point[i]) {
					k = point[j] - point[i];
				}
				
				if (i == j) {
				} else {
					if (k < l) {
						l = k;
						result1 = i;
						result2 = j;
					}
				}

			}
		}
		System.out.println("가장짧은수 : " + l);
		System.out.println("result = [" + result1 +", " + result2 +"]");
		
		

	}
}
