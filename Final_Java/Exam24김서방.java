package Final_Java;

public class Exam24김서방 {

	public static void main(String[] args) {
		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(findKim(names));

	}

	private static String findKim(String[] names) {
		
		String str = "";
		
		for(int i = 0; i<names.length; i++) {
			if(names[i].equals("Kim")) {
				str = "김서방은 " + (i+1) + "번째에 있습니다.";
			}
		}
		
		
		return str;
	}

}
