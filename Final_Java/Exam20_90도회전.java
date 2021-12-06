package Final_Java;

public class Exam20_90도회전 {

	public static void main(String[] args) {
		
		int[][] arr = new int [5][5];
		int cnt = 0;
		System.out.println("원본");
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				cnt++;
				arr[i][j] = cnt;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}System.out.println();
		}
		
		System.out.println("90도 회전");
		for(int i = arr.length-1; i>=0; i--) {//상하 거울방향 뒤집기
			for(int j = 0; j<arr.length; j++) {
				System.out.printf("%3d",arr[j][i]);//대각선 기준 거울방향 뒤집기
			}System.out.println();
		}

	}

}
