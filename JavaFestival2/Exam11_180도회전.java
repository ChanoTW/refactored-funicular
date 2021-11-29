package Practice;

public class Exam11_180도회전 {

	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		int i = 0;
		int j = 0;
		int num = 1;
		
		System.out.println("===원본===");
		for (i = 0; i<arr.length; i++) {
			for(j = 0; j<arr[i].length; j++) {
				arr[i][j] = num;
				System.out.printf(" %2d", arr[i][j]);
				num++;	
			}
			System.out.println();
		}
		
		System.out.println("===180도 회전===");
		for (i = arr.length-1; 0<=i; i--) {
			for(j = arr[i].length-1; 0<=j; j--) {
				System.out.printf(" %2d", arr[i][j]);
			}
			System.out.println();
		}

		
		

	}

}
