package Final_Java;

import java.util.Scanner;

public class Exam26대쉬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = sc.next();
		System.out.println("대시('-')의 총합 >> " + dashCount(num));

	}

	private static int dashCount(String num) {
		
		String[] dash = num.split("");
		int dashcount = 0;
		
		for(int i = 0; i<dash.length; i++) {
			if(dash[i].equals("1")) {
				dashcount += 2;
			} else if (dash[i].equals("2") || dash[i].equals("3") || dash[i].equals("5")) {
				dashcount += 5;
			} else if (dash[i].equals("4")) {
				dashcount += 4;
			} else if (dash[i].equals("6") || dash[i].equals("9") || dash[i].equals("0")) {
				dashcount += 6;
			} else if (dash[i].equals("7")) {
				dashcount += 3;
			} else if (dash[i].equals("8")) {
				dashcount += 7;
			} 
		}
		
		
		return dashcount;
	}

}
