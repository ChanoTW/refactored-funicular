package �ڹ��佺Ƽ��1����;

import java.util.Scanner;

public class Exam09���μ����� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���μ����� �� �� : ");
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
