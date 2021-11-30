package 메소드;

import java.util.Scanner;

public class Exam03메소드예제3 {

	public static void main(String[] args) {
		// 2개의 양수를 받아 2개의 숫자 중 더 큰 수를 반환하는 메소드 largerNumbers()를 만들어보세요
		// 만약, 두 숫자가 같다면 0을 반환하고요

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();

		int result = (largerNumber(num1, num2));
		System.out.println("더 큰 값 : " + result);

	}

	public static int largerNumber(int x1, int x2) {
		// if문 사용
//		if (x1 > x2) {
//			return x1;
//		} else if (x1 < x2) {
//			return x2;
//		} else {
//			return 0;
//		} 

		// 삼항연산자를 이용한 알고리즘 만들기 (조건 ? 참 : 거짓)
		return (x1 == x2 ? 0 : (x1 > x2 ? x1 : x2));
		//(조건 ? 참 : (거짓일 때의 조건 ? 참 : 거짓))으로 표현가능

	}

}
