package Practice;

public class Exam14_90��ȸ�� {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int num = 1;
		
		
		System.out.println("==����==");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.printf(" %2d", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("==90��ȸ��==");
		for (int i = arr.length-1; 0 <= i; i--) {//�ſ���� ������
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf(" %2d", arr[j][i]);//�밢������ ������
			}
			System.out.println();
		}
		
		
		
		

	}

}
