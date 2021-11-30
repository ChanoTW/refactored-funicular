package 메소드;

import java.util.Scanner;

public class Exam05메소드예제5 {

	public static void main(String[] args) {
		// 키보드로부터 입력받은 두개의 정수를 인자(매개변수)로 넘겨받아
		// num1에서 num2를 뺀 결과값을 절대값으로 바꾸어 출력하는
		// getAbsoluteValue() 메소를 구현하세요

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 >> ");
		int num2 = sc.nextInt();

		System.out.println(getAbsoluteValue(num1, num2));

	}

	public static int getAbsoluteValue(int x1, int x2) {
		
		int abs = x1 - x2;

//		if (abs < 0) {
//			abs = -abs;
//			return abs;
//		} else {
//			return abs;
//		}
		
		return (abs > 0 ? abs : -abs);
		

	}

}
