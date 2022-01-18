package Practice;

import java.util.Scanner;

public class Exam01Á¤¼ö¼ö¿­ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n ÀÔ·Â : ");
		int num = sc.nextInt();
		int j = 1;
		
		for(int i = 1; i<=num; i++) {
			System.out.print(j+" ");
			j += i;
		}

	}

}
