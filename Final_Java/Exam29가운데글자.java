package Final_Java;

public class Exam29가운데글자 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("test"));

	}

	private static String getMiddle(String str) {
		
		String[] wordlist = str.split("");
		
		if(wordlist.length%2 == 1) {
			str = wordlist[wordlist.length/2];
		} else {
			str = wordlist[(wordlist.length/2)-1] + wordlist[wordlist.length/2];
		}
		
		return str;
	}

}
