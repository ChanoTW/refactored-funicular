package Practice;

import java.util.Random;

public class Exam04�ζ� {

	public static void main(String[] args) {

		Random rd = new Random();
		int lotto[] = new int[6];
		int i = 0;
		int j = 0;

		// ��ȣ ����
		for (i = 0; i < lotto.length; i++) {
			lotto[i] = rd.nextInt(45) + 1;
			System.out.println((i + 1) + "��° ���� : " + lotto[i]);
			while(j!=lotto[i]) {
				if(j==lotto[i]) {
					j = lotto[i];
					lotto[i] = rd.nextInt(45) + 1;
				} else {
					
				}
			}
		}

		// �ߺ� ��ȣ ����


	}
}
