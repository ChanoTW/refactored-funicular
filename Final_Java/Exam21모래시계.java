package Final_Java;

public class Exam21�𷡽ð� {

	public static void main(String[] args) {

		char a = 'A';// ù ���ĺ� ����
		char[][] a1 = new char[5][5]; // ������ �迭 ����

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
