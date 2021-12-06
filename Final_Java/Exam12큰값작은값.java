package Final_Java;

import java.util.Random;

public class Exam12큰값작은값 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] arr = new int[8];
		int num;
		int max = 0;
		int min = 100;
		
		System.out.print("배열에 있는 모든 값 : ");
		for(int i = 0; i<arr.length; i++) {
			num = rd.nextInt(99)+1;
			arr[i] = num;
			System.out.print(arr[i] + " ");
		}System.out.println();
		
		for(int i = 0; i<arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
		
		
		
	}

}
