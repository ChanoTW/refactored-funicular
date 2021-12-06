package Final_Java;

public class Exam27성적별학생수 {

	public static void main(String[] args) {
		
		String score = "A,A,B,C,D,A,C,D,D,D,F";
		score(score);

	}
	
	public static void score(String check) {
		
		String[] str = check.split("");
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		
		
		for(int i = 0; i<str.length; i++) {
			
			if(str[i].equals("A")) {
				a++;
			} else if(str[i].equals("B")) {
				b++;
			} else if(str[i].equals("C")) {
				c++;
			} else if(str[i].equals("D")) {
				d++;
			} else if(str[i].equals("F")) {
				f++;
			}
		}
		
		System.out.println("A : " + a + "명");
		System.out.println("B : " + b + "명");
		System.out.println("C : " + c + "명");
		System.out.println("D : " + d + "명");
		System.out.println("F : " + f + "명");
		
		

	}

}
