package Final_Java;

public class Exam20_90��ȸ�� {

	public static void main(String[] args) {
		
		int[][] arr = new int [5][5];
		int cnt = 0;
		System.out.println("����");
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				cnt++;
				arr[i][j] = cnt;
			}
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}System.out.println();
		}
		
		System.out.println("90�� ȸ��");
		for(int i = arr.length-1; i>=0; i--) {//���� �ſ���� ������
			for(int j = 0; j<arr.length; j++) {
				System.out.printf("%3d",arr[j][i]);//�밢�� ���� �ſ���� ������
			}System.out.println();
		}

	}

}
