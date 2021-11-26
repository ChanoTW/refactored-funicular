package JavaFestival;

import java.util.Scanner;

public class Exam07최소최대 {

	public static void main(String[] args) {
		//최대공약수 최소공배수 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		int i = 1;
		
		//약수 구하기
		System.out.print("숫자 1의 약수 : ");
		for(i = 1; i<=num1; i++) {
			if(num1 % i == 0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.print("숫자 2의 약수 : ");
		for(i = 1; i<=num2; i++) {
			if(num2 % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		//공약수 구하기
		int j = 0;
		System.out.println();
		System.out.print("숫자1과 숫자2의 공약수 : ");
		for(i = 1; i<=num1 && i<=num2; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.print(i+" ");
				j = i;
			}
		}
		
		//최소공약수 최대공배수 구하기
		System.out.println();
		System.out.println("최대 공약수 :" + j);
		System.out.println("최소 공배수 :" + num1/j*num2/j*j);
		
		
		
	}

}
