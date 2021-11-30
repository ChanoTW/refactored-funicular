package 메소드;

import java.util.Scanner;

public class Exam07메소드예제7 {

	public static void main(String[] args) {
		//약수의 합을 구하여 반환하는 getSumOfDivisors()메소드를 구현하세요.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 >> ");
		int num = sc.nextInt();
		
		//num의 약수의 대한 합계
		int result = getSumOfDivisors(num);
		System.out.println(num + "의 약수의 합 : " + result);
		
		//num의 약수들을 출력
		getDivisors(num);

	}
	
	
	public static int getSumOfDivisors(int x1){
		
		int save = 0;
		//약수 : 1에서 지정한 수 까지 나뉜값이 0으로 된 수들이 약수이다.
		for(int i = 1; i<=x1; i++) {
			if(x1 % i == 0) {
				save += i;
			}
			
		}
		return save;
	}
	
	public static void getDivisors(int x1) {
		
		System.out.print(x1 + "의 약수 : ");
		for(int i = 1; i<=x1; i++) {
			if(x1 % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
