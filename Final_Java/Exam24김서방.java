package Final_Java;

public class Exam24�輭�� {

	public static void main(String[] args) {
		String[] names = {"Queen", "Tod", "Kim"};
		System.out.println(findKim(names));

	}

	private static String findKim(String[] names) {
		
		String str = "";
		
		for(int i = 0; i<names.length; i++) {
			if(names[i].equals("Kim")) {
				str = "�輭���� " + (i+1) + "��°�� �ֽ��ϴ�.";
			}
		}
		
		
		return str;
	}

}
