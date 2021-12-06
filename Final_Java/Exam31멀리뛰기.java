package Final_Java;

import java.util.Scanner;

public class Exam31¸Ö¸®¶Ù±â {

	public static void main(String[] args) {
		
		System.out.println(jumpCase(7));

	}

	private static int jumpCase(int jump) {
		
		int[] arr = new int[jump];
		int result = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(i == 0) {
				arr[i] = 1;
			} else if (i == 1) {
				arr[i] = 2;
			} else {
				arr[i] = arr[i-2] + arr[i-1];
				result = arr[i];
			}
		}

		return result;
	}
	

}
