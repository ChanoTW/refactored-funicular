package Practice;

import java.util.Random;

public class Exam03�迭ū�������� {
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
		System.out.println("���� ū �� : " + j);
		System.out.println("���� ���� �� : " + k);
		
		
		
			
		
		
	}
}
