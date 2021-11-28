package 자바페스티벌1주차;

import java.util.Scanner;

public class Exam07최소공배수최대공약수 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		int i = 1;
		int j = 0;
		
		System.out.print("공약수 : ");
		for(i = 1, j = 1; i<=num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.print(i+" ");
				j=i;
			}
		}System.out.println();
		System.out.println("최대공약수 : " + j);
		System.out.println("최소공배수 : " + num1*num2/j);

		
	}

}
