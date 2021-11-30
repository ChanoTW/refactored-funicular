package 메소드;

import java.util.Scanner;

public class Exam04메소드예제4 {

	public static void main(String[] args) {
		//2개의 정수를 받아 2개의 숫자중 10에 더 가까운 수를 반환하는 메소드 close10을 만들어보세요
		//(만약 두 숫자 모두 10과의 차이가 같다면 0을 반환)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 >>");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 >>");
		int num2 = sc.nextInt();
		
		System.out.println(close10(num1,num2));

	}
	
	
	public static int close10(int x1, int x2) {
		
//		//(절대값 x1,x2를 각각 찾아서 비교하기)
//		int result = 0;
//		
//		//1. 10으로부터 차이나는 값을 양수로 수정
//		int chai1 = x1-10;
//		
//		if(chai1 < 0) {
//			chai1 = -chai1;
//		}
//		
//		chai1 = chai1>0? chai1 : -chai1;
//		
//		int chai2 = x2-10;
//		if(chai2 < 0) {
//			chai2 = -chai2;
//		}
//		
//		chai2 = chai2>0? chai2 : -chai2;
//		
//		2. 10으로부터 가까운 수 찾기
//		
//		if(chai1 > chai2) {
//			result = x2;
//		} else if (chai1 < chai2) {
//			result = x1;
//		}
//		
//		return result;
		
		//Math class에 있는 abs() 절대값 함수 사용하기
		int a = Math.abs(10 - x1);
		int b = Math.abs(10 - x2);
		
		if(a > b) {
			return x1;
		} else if (a < b) {
			return x2;
		} else {
			return 0;
		}
		
		
		
		
		
	}

	
	
	
}
