package Final_Java;

public class Exam19N�迭��� {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int cnt = 0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				cnt++;
				arr[i][j] = cnt;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(i % 2 == 0) {
					System.out.printf("%3d", arr[i][j]);
				} else {
					System.out.printf("%3d", arr[i][4-j]);//�Ųٷ� �������ֱ�
				}
				
			}System.out.println();
		}

	}

}
