package 메소드;

import java.util.Scanner;

public class Exam08메소드오버로딩 {

	public static void main(String[] args) {
		//메소드 오버로딩 구조 예시!!!
		
		int a = 10;
		int b = 2;
		
		//두개 수를 더해줄 수 있는 add() 만들기
		add(10, 2);
		add1(10, 2.4);

		Scanner sc = new Scanner(System.in);
		sc.next();
		
	}
	
	//기존의 add 메소드 함수
	public static void add(int a, int b) {
		System.out.println(a+b);

	}
	
	//정수형의 add메소드를 중복정의 하여 생성된 메소드
	public static void add1(int a, double b) {
		System.out.println(a+b);
	}

}
