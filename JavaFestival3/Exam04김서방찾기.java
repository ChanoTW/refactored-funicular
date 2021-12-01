
public class Exam04김서방찾기 {

	public static void main(String[] args) {

		String[] names = { "Queen", "Tod", "Kim" };
		System.out.println("김서방은 " + findKim(names) + "에 있다.");

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
