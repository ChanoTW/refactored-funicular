package Final_Java;

import java.util.Scanner;

public class Exam26�뽬 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù�ڸ� 0�� ������ ���ڸ� �Է����ּ��� >> ");
		String num = sc.next();
		System.out.println("���('-')�� ���� >> " + dashCount(num));

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
