package 메소드;

import java.util.Scanner;

public class Exam02메소드예제2 {

	public static void main(String[] args) {
		//정수형 변수 num1과 num2를 각각 초기화 하고
		//문자형 변수 op를 선언해 원하는 연산자로 초기화 하세요
		//num1, num2, op를 받아 num1과 num2를 op에 맞게 연산한
		//최종 값을 반환해주는 cal 메소드를 작성하세요
		
		
		//1. 사용자로부터 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 >>");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 >>");
		int num2 = sc.nextInt();
		
		//1-2. 연산자 입력받기 (String을 써서) 
		System.out.print("연산자 입력(+, -, *, /) >> ");
		String op = sc.next();
		
		//1-3 (char를 써서)
		//char op = '-';
		
		
		//결과 값 출력
		System.out.print("결과값 : " + cal(num1, num2, op));

	}
	//cal메소드 정의
	public static int cal(int num1, int num2, String op) {
		
		//결과를 담을 수 있는 변수 생성
		//int result = 0;
		
		//연산자를 비교 하기
		if(op.equals("+")) {
			return num1 + num2;
		}else if(op.equals("-")){
			return num1 - num2;
		}else if(op.equals("*")){
			return num1 * num2;
		}else if(op.equals("/")) {
			return num1 / num2;
		}else {
			return 0;
		}
		
		//return result;
		
	}
	
//	public static int cal(int num1, int num2, char op) {
//		if(op == '-') {
//			return num1-num2;
//		} else {
//			return num1*num2;
//		}
//		
//		
//	}

}
