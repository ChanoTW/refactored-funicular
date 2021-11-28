package 자바페스티벌1주차;

import java.util.Scanner;

public class Exam09소인수분해 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수 : ");
		int num = sc.nextInt();
		int i = 1;
		int j = 0;
		
		System.out.print(num + " = ");
		for(i = 2; i<=num; i++) {
			while(num % i == 0) {
				if(num>i) {
					System.out.print(i + "*");
					num/=i;
				} else {
					System.out.println(i);
					break;
				}
				
			}
		}
		if(num == 1) {
			System.out.print("1");
		}

	}

}
