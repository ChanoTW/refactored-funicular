package Final_Java;

public class Exam28배열합병 {

	public static void main(String[] args) {
		int A[] = {1,3,5,7,9,11,13,15,17,19};
		int B[] = {2,4,6,8,10,12,14,16,18,20};
		int Merge = mergeArray(A,B);

	}

	private static int mergeArray(int[] a, int[] b) {
		
		int[] c = new int[a.length+b.length];
		int cnt = 0;
		
		for(int i = 0; i<a.length; i++){
			//System.out.print(c[cnt] + " ");
			c[cnt] = a[i];
			cnt++;
			
			//System.out.print(c[cnt] + " ");
			
			c[cnt] = b[i];
			cnt++;
		}
		
		System.out.print("Merge : [");
		for(int i = 0; i<c.length; i++) {
			if(i<c.length-1) {
				System.out.print(c[i] + ",");
			} else {
				System.out.print(c[i] + "]");
			}
			
		}
		
		return 0;
		
		
		
		
		
	}


}
