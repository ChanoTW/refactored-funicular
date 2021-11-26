package JavaFestival;

public class Exam05복잡한계산 {

	public static void main(String[] args) {

		int a = 1;
		int b = 0;

		for(a = 1; a<=100; a++) {
			if(a % 2 != 0) {
				b = b+a;
				System.out.print(a+" ");
			}else {
				b = b-a;
				System.out.print(-a+" ");
			}
		}
		System.out.println(" ");
		System.out.println(b);
		
		
	}

}
