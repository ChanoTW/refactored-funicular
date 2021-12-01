
public class Exam03알파벳순서정렬 {

	public static void main(String[] args) {

		String str = "ZAbcdVefEg";
		reverseStr(str);
	}

	public static String reverseStr(String s) {

		char[] str = s.toCharArray();

		for (int i = 0; i < s.toCharArray().length - 1; i++) {
			int minNum = str[i];
			int minNumIndex = i;
			for (int j = i + 1; j <= s.toCharArray().length - 1; j++) {
				if (minNum > str[j]) {
					minNum = str[j];
					minNumIndex = j;
				}
			}
			int temp = str[i];
			str[i] = str[minNumIndex];
			str[minNumIndex] = (char) temp;
		}

//	    	for(int i = 0; i<s.toCharArray().length; i++) {
//	    		System.out.println(str[i]);
//	    	}

		return "미니팀화이팅";

	}

}