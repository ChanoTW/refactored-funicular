package Final_Java;

import java.util.Scanner;

public class Exam15_2���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� >>");
		int num = sc.nextInt();
		String index = ""; 
		
		for(int i = num; num>0; num/=2) {
			if(num % 2 == 0) {
				index = "0"+index;
			} else {
				index = "1"+index;
			}
			
		}
		
		System.out.println(index);

	}

}
