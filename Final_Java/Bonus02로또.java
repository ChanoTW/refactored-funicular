package Final_Java;

import java.util.Random;

public class Bonus02로또 {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[6];
		int num;
		
		for(int i = 0; i<arr.length; i++) {
			num = rd.nextInt(45)+1;
			arr[i] = num;
			for(int j = 0; j<i; j++) {//아직 모든 배열이 정해지지 안았으니 i배열이 정해진데 까지만 반복한다.
				if(arr[i] == arr[j]) {
					i--;
				}
			}
		}
		
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("행운의 숫자 : " + arr[i]);
		}
		
		

		
	}

}
