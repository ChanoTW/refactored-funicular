package Practice;

public class Exam14_90도회전 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		
		System.out.println("==원본==");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.printf(" %2d", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("==90도회전==");
		for (int i = arr.length-1; 0 <= i; i--) {//거울방향 뒤집기
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf(" %2d", arr[j][i]);//대각선기준 뒤집기
			}
			System.out.println();
		}
		
		
		
		

	}

}
