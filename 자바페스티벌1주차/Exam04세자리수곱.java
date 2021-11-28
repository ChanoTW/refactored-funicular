package 자바페스티벌1주차;

import java.util.Scanner;

public class Exam04세자리수곱 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		
		int num3 = num2%10*num1;
		int num4 = num2%100/10*num1;
		int num5 = num2/100*num1;
		int num6 = num1*num2;
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		
	}

}
