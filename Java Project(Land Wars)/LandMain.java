import java.util.ArrayList;
import java.util.Scanner;

public class LandMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LandDAO dao = new LandDAO();
//		ArrayList<LandDTO> list = new ArrayList<LandDTO>();

		ArrayList<LandDTO> list = dao.selectAll();

		for (int i = 0; i < list.size(); i++) {
			if (i % 8 == 0 || i == 4 || i == 13 || i == 22 || i == 27) {
				i++;
			}

			LandDTO m = list.get(i);
			System.out.println(i + ". " + m.getLandName());
		}
		int cnt = 1;
		System.out.print("�� ��ȣ �Է� : ");
		int input = sc.nextInt();
		for (int i = 0; i < list.size(); i++) {

			if (i % 8 == 0 || i == 4 || i == 13 || i == 22 || i == 27) {
				i++;
			}
			if (input == i) {

				LandDTO m = list.get(i);
				System.out.println("<< ���� ���� >>");
				System.out.println("����\t���װ���\t��������\tȣ�ڰ���\t�����\t��������\tȣ�ں�\t�μ����\t�����μ�\tȣ���μ�");
				System.out.println(m.toString());
			}

		}

	}
}
