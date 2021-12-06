package Final_Java;

public class Exam14가장짧은점 {

	public static void main(String[] args) {
		
		int[] point = {92,32,52,9,81,2,68};
		
		int index = 0;
		int min = 100;
		int pt1 = 0;
		int pt2 = 0;
		
		for(int i = 0; i<point.length; i++) {
			for(int j = i; j<point.length; j++) {
				if(point[i] - point[j] > 0) {
					index = point[i] - point[j];
				} else if (point[j] - point[i] > 0) {
					index = point[j] - point[i];
				} 
				if(i != j && min > index ){
					min = index;
					pt1 = i;
					pt2 = j;
				} 	
			}
		}
		
		System.out.println("result = [" + pt1 + ", " + pt2 + "]");

	}

}
