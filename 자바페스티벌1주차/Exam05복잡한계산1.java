package �ڹ��佺Ƽ��1����;

public class Exam05�����Ѱ��1 {

	public static void main(String[] args) {

		int i = 0;
		int j = 0;
		int k = 0;

		for (i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
				j+=i;
			} else {
				System.out.print(-i + " ");
				k+=i;
			}
			
		}System.out.println();
		
		System.out.println("��� : " + (j-k));

	}

}
