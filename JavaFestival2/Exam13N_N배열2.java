package Practice;

public class Exam13N_N?迭2 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int num = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.printf(" %2d", arr[i][j]);
			}
			System.out.println();
		}

	}

}
