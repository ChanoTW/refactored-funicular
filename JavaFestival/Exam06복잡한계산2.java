package JavaFestival;

public class Exam06�����Ѱ��2 {

	public static void main(String[] args) {
		//(77*1) + (76*2) + (75*3)+��+(1*77)�� ����Ͽ� ����� ����Ͻÿ�.
		
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
