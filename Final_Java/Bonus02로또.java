package Final_Java;

import java.util.Random;

public class Bonus02�ζ� {

	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[6];
		int num;
		
		for(int i = 0; i<arr.length; i++) {
			num = rd.nextInt(45)+1;
			arr[i] = num;
			for(int j = 0; j<i; j++) {//���� ��� �迭�� �������� �Ⱦ����� i�迭�� �������� ������ �ݺ��Ѵ�.
				if(arr[i] == arr[j]) {
					i--;
				}
			}
			
		}
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("����� ���� : " + arr[i]);
		}

	}

}
