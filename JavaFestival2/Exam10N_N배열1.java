package Practice;

public class Exam10N_N�迭1 {

	public static void main(String[] args) {

		int[][] arr = new int[5][5];
		int num = 1;
		int i = 0;
		int j = 0;
		
		//�迭 �� ����
		for(i = 0; i<arr.length; i++) {
			for(j = 0; j<arr[i].length; j++) {
				arr[i][j] = num;
				num++;
			}
		}
		
		//N_N �迭 ������
		for(i = 0; i<arr.length; i++) {
			for(j = 0; j<arr[i].length; j++) {
				System.out.printf(" %2d", arr[j][i]);
			}
			System.out.println();
		}
		
		


		
		
	}
}
