package Practice;

import java.util.Random;

public class Exam03배열큰거작은거 {
	public static void main(String[] args) {
		
		Random random = new Random();

		int[] array = new int[8];
		int j = 0;
		int k =100;
		
		for(int i = 0; i<7; i++) {
			int num = random.nextInt(100);
			array[i] = num;
			System.out.print(num + " ");
			if (num > j) {
				j = num;
			}
			if (num < k) {
				k = num;
			}
		}
		
		System.out.println();
		System.out.println("가장 큰 값 : " + j);
		System.out.println("가장 작은 값 : " + k);
		
		
		
			
		
		
	}
}
