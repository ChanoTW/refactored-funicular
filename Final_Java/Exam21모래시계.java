package Final_Java;

public class Exam21모래시계 {

	public static void main(String[] args) {

		char a = 'A';// 첫 알파벳 선언
		char[][] a1 = new char[5][5]; // 이차원 배열 지정

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				if (i == 0 || i == 4) {
					a1[i][j] = a;
					a++;
				} else if ((i == 1 || i == 3) && (j == 1 || j == 2 || j == 3)) {
					a1[i][j] = a;
					a++;
				} else if (i == 2 && j == 2) {
					a1[i][j] = a;
					a++;
				}
			}
		}

		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1.length; j++) {
				System.out.printf("%2c",a1[i][j]);
			}System.out.println();
		}

	}

}
