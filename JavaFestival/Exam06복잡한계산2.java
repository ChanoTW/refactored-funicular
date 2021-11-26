package JavaFestival;

public class Exam06복잡한계산2 {

	public static void main(String[] args) {
		//(77*1) + (76*2) + (75*3)+…+(1*77)를 계산하여 결과를 출력하시오.
		
		int a = 77;
		int b = 1;
		int c = 0;
		
		for(a = 77; a>0; a--) {
			c = c+(a*b);
			b++;
		}
		System.out.println(c);
	}

}
