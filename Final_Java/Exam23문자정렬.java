package Final_Java;

public class Exam23문자정렬 {

	public static void main(String[] args) {
		System.out.println(reverseStr("ASDHAHsapodfup"));

	}

	private static String reverseStr(String w) {

		String answer = "";
		char[] charArr = w.toCharArray();
		char temp = charArr[0];
		for(int i = 0; i<charArr.length; i++) {
			for(int j = i; j<charArr.length; j++) {
				if(charArr[i] > charArr[j]) {
					temp = charArr[j];
					charArr[j] = charArr[i];
					charArr[i] = temp;
				}
			}
		}
		
		
		for(int i = 0; i<charArr.length; i++) {
			answer = answer + charArr[i];
		}
		return answer;
	}
	

}
