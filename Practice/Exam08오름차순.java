package Practice;

import java.util.Scanner;

public class Exam08�������� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		int num = 0;
		int i = 0;
		int j = 0;
		int save = 0;
		int save_num = 0;
		int min = 0;

		//��������
		for (num = 0; num < 5; num++) {
			System.out.print(num + 1 + "��° �����Է� >> ");
			arr[num] = sc.nextInt();
		}

		//���� ��
		System.out.println("���� �� >> ");
		for (i = 0; i < 5; i++) {
			save = i;//save������ �迭 n��° �غ� �Ϸ�
			save_num = arr[i];//n��° ���� �� �غ� �Ϸ� 
			for (j = i + 1; j < 5; j++) {
				if (arr[i] < arr[j]) {
					min = arr[i];//�ּҰ��� ó��
					arr[i] = arr[j];
					arr[j] = min;
					
				}
			}
			System.out.println(min);
		}

		
		
		
	}
}