package �޼ҵ�;

import java.util.Arrays;

public class Exam06�޼ҵ忹��6 {

	public static void main(String[] args) {
		//array�� ����ִ� �����͸� ����ϴ� arrayToString() �޼ҵ带 �����ϼ���.
		
		int[] array = {1,3,4,8,7,9,10};
		arrayToString(array);
		
		

	}
	
	public static void arrayToString(int[] array) {
		//�� ���
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		//Arrays Ŭ������ toString() �Լ� ����ϱ�
		System.out.println(Arrays.toString(array));
		
	}
}
