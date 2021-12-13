import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1.�α��� 2.ȸ������ 3.ȸ����Ϻ��� 4.ȸ���������� 5.ȸ��Ż�� 6.����
		
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		
		System.out.println("====ȸ������ �ý���====");

		while(true) {
			System.out.print("1.�α��� 2.ȸ������ 3.ȸ����Ϻ��� 4.ȸ���������� 5.ȸ��Ż�� 6.���� >> ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("====�α���====");
				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pw = sc.next();
				String nick = dao.login(id, pw);
				
				if(nick != null) {
					System.out.println(nick + "�� ȯ���մϴ�.");
				} else {
					System.out.println("�α��� ����...");
				}
				
			} else if (choice == 2) {
				System.out.println("====ȸ�� ����====");
				System.out.print("���̵� �Է� : ");
				String id = sc.next();
				System.out.print("��й�ȣ �Է� : ");
				String pw = sc.next();
				System.out.print("�г��� �Է� : ");
				String nick = sc.next();
				
				int cnt = dao.join(id, pw, nick);
				
				if(cnt > 0) {
					System.out.println("ȸ������ ����");
				} else {
					System.out.println("ȸ������ ����");
				}
				
			} else if (choice == 3) {
				System.out.println("====ȸ����Ϻ���====");
				ArrayList<MemberDTO> list = dao.selectAll();
				
				for(int i = 0; i<list.size(); i++) {
					System.out.print(list.get(i).getId()+ " - ");
					System.out.print(list.get(i).getPw()+ " - ");
					System.out.println(list.get(i).getNick());
				}
				
				
			} else if (choice == 4) {
				
				System.out.println("====ȸ����������====");
				System.out.println("���� ��ų �г����� �Է����ּ��� >>");
				String inputNick =sc.next();
				int cnt = dao.update(inputNick);
				
				if (cnt > 0) {
					System.out.println("���� ����");
				} else {
					System.out.println("���� ����");
				}
				
			} else if (choice == 5) {
				
			} else if (choice == 6) {
				System.out.println("���α׷��� �����մϴ�...");
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �ٽ� �Է����ּ���.");
			}
		}
		
		
		
	}

}
