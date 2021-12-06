package Final_Java;

public class Exam17_N배열출력 {

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
				System.out.printf("%3d", arr[j][i]);//대각선 방향 거울반전
			}System.out.println();
		}

	}

}
