package 자바페스티벌1주차;

import java.util.Scanner;

public class Exam08팩토리얼 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int num = sc.nextInt();
		int j = 1;
		
		for(int i = 1; i<=num; i++) {
			j*=i;
		}
		System.out.println("출력 : " + j);

	}

}
