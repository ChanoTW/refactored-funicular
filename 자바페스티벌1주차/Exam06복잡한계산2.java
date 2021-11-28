package 자바페스티벌1주차;

public class Exam06복잡한계산2 {

	public static void main(String[] args) {
		
		int j = 1;
		int ans = 0;
		
		for(int i = 77; i>0; i--) {
			ans += i*j; 
			j++;
		}
		System.out.print(ans);

	}

}
