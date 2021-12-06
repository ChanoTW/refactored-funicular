package Final_Java;

public class Exam18_180도회전 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int cnt = 0;
		
		System.out.println("원본");
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				cnt++;
				arr[i][j] = cnt;
				System.out.printf("%3d",arr[i][j]);
			}System.out.println();
		}
		
		System.out.println("180도 회전");
		for(int i = arr.length-1; i>=0; i--) { //상하 거울모드
			for(int j = arr.length-1; j>=0; j--) { //좌우 거울모드 동시발동
				System.out.printf("%3d",arr[i][j]);
			}System.out.println();
		}

	}

}
