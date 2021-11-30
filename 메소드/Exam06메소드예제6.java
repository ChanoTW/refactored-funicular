package 메소드;

import java.util.Arrays;

public class Exam06메소드예제6 {

	public static void main(String[] args) {
		//array에 들어있는 데이터를 출력하는 arrayToString() 메소드를 구현하세요.
		
		int[] array = {1,3,4,8,7,9,10};
		arrayToString(array);
		
		

	}
	
	public static void arrayToString(int[] array) {
		//내 방법
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		//Arrays 클래스의 toString() 함수 사용하기
		System.out.println(Arrays.toString(array));
		
	}
}
