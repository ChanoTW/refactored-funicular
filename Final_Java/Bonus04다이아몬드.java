package Final_Java;

public class Bonus04´ÙÀÌ¾Æ¸óµå {

	public static void main(String[] args) {
		
		int[][] d = new int [7][7];
		int cnt = 0;
		
		
		for(int i = 0; i<d.length; i++) {
			for(int j = 0; j<d.length; j++) {
				if((i == 0 || i == 6) && (j == 3)) {
					cnt++;
					d[i][j] = cnt;
				} else if ((i == 1 || i == 5) && (j == 2 || j == 3 || j == 4)) {
					cnt++;
					d[i][j] = cnt;
				} else if ((i == 2 || i == 4) && (j == 1 || j == 2 || j == 3 || j == 4 || j == 5)) {
					cnt++;
					d[i][j] = cnt;
				} else if (i == 3) {
					cnt++;
					d[i][j] = cnt;
				}
			}
		}
		
		for(int i = 0; i<d.length; i++) {
			for(int j = 0; j<d.length; j++) {
				System.out.printf("%3d",d[i][j]);
			}System.out.println();
		}

	}

}
