
public class Exam04�輭��ã�� {

	public static void main(String[] args) {

		String[] names = { "Queen", "Tod", "Kim" };
		System.out.println("�輭���� " + findKim(names) + "�� �ִ�.");

	}

	public static int findKim(String[] names) {

		int i = 0;
		int answer = -1;

		for (i = 0; i < names.length; i++) {
			if (names[i].equals("Kim")) {
				answer = i + 1;
			}
		}
		return answer;

	}

}
