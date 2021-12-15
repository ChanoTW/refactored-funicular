import java.util.ArrayList;
import java.util.Scanner;

public class LandMemberMain {

	public static void main(String[] args) {
		LandMemberDAO dao = new LandMemberDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("====ȸ������ �ý���====");

		while (true) {
			System.out.print("1.�α��� 2.ȸ������ 3.ȸ����Ϻ��� 4.ȸ���������� 5.ȸ��Ż�� 6.���� >>");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.println("====�α���====");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PASSWORD : ");
				String pw = sc.next();

				String nick = dao.login(id, pw);

				if (nick != null) {
					while (nick != null) {
						System.out.println(nick + "�� ȯ���մϴ�!");
						System.out.println("���� ����");
						break;
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						

					}
					while (true) {
						if (id.equals("admin")) {
							System.out.println("====������ ���====");
							System.out.println("1. ȸ���������� 2. ȸ������ 3. ��üȸ��ID���� 4. ������ �α׾ƿ�");
							System.out.print("�����Է� >> ");
							choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("====������ ȸ����������====");
								System.out.print("���̵� �Է� : ");
								String change_id = sc.next();
								System.out.print("������ �г��� �Է� : ");
								String change_nick = sc.next();

								int cnt = dao.adminUpdate(change_id, change_nick);

								if (cnt > 0) {
									System.out.println(change_nick + "���� ȸ������ ���� �Ϸ�!!!");
								} else {
									System.out.println("ȸ������ ���� ����...");
								}
							} else if (choice == 2) {

								System.out.println("====ȸ������====");
								System.out.println("������ ȸ���� �����մϴ�.");
								System.out.print("ID : ");
								String removeId = sc.next();

								if (dao.check(removeId)) {

									System.out.print(nick + "ȸ���� ��¥ Ż�� ��Ű�ðڽ��ϱ�? Y/N");
									String yn = sc.next();

									if (yn.equals("y") || yn.equals("Y")) {
										int cnt = dao.deleteId(removeId);
										if (cnt > 0) {
											System.out.println("ȸ������ �Ϸ�!!!");
										}
									} else if (yn.equals("n") || yn.equals("N")) {
										System.out.println("ó������ �ٽ� �����մϴ�.");
									} else {
										System.out.println("�߸� �Է��߽��ϴ�.");
									}
								} else {
									System.out.println("ȸ���� �������� �ʽ��ϴ�.");
								}
							} else if (choice == 3) {
								System.out.println("====��üȸ��ID����====");
								ArrayList<LandMemberDTO> list = dao.selectAll();

								int listNum = 1;
								for (int i = 0; i < list.size(); i++) {
									LandMemberDTO m = list.get(i);
									if (!m.getId().equals("admin")) {
										System.out.println((listNum++) + ". " + m.getId());
									}
								}
							} else if (choice == 4) {
								System.out.println("===������ ��� ����====");
							} else {
								System.out.println("�ٽ� �Է����ּ���.");
							}
							System.out.println();
						}
					}
				} else {
					System.out.println("�α��� ����...");
				}

			} else if (choice == 2) {
				System.out.println("====ȸ������====");
				System.out.print("���̵� �Է� :");
				String id = sc.next();
				System.out.print("��й�ȣ�� �Է� :");
				String pw = sc.next();
				System.out.print("�г��� �Է� :");
				String nick = sc.next();
				int cnt = dao.join(id, pw, nick);

				if (cnt > 0) {
					System.out.println("ȸ������ ����");
				} else {
					System.out.println("ȸ������ ����");
				}

			} else if (choice == 3) {
				// ȸ�� ��� ����
				System.out.println("====ȸ����Ϻ���====");
				ArrayList<LandMemberDTO> list = dao.selectAll();

				// pbk - 1234 - ȣ�ξƺ�
				for (int i = 0; i < list.size(); i++) {
					LandMemberDTO m = list.get(i);
					System.out.print(m.getId() + "-");
					System.out.print(m.getPw() + "-");
					System.out.println(m.getNick());

				}

			} else if (choice == 4) {
				System.out.println("====ȸ����������====");
				System.out.println("ȸ�������� Ȯ���մϴ�.");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PASSWORD : ");
				String pw = sc.next();
				String nick = dao.login(id, pw);
				System.out.println(nick + "�� ȸ�������� ��ġ�մϴ�. ȸ������ �����ϼ���.");

				System.out.print("������ NICKNAME : ");
				String new_nick = sc.next();

				System.out.print("������ PASSWORD : ");
				String new_pw = sc.next();

				int cnt = dao.update(id, pw, new_nick, new_pw);

				if (cnt > 0) {
					System.out.println("ȸ������ ���� ����!!!");
				} else {
					System.out.println("ȸ������ ���� ����...");
				}

			} else if (choice == 5) {
				// ȸ�� Ż��
				System.out.println("====ȸ��Ż��====");
				System.out.println("���̵� �Է�  : ");
				String id = sc.next();
				System.out.println("��й�ȣ �Է� : ");
				String pw = sc.next();
				int cnt = dao.delete(id, pw);

				if (cnt > 0) {
					System.out.println("ȸ������ �Ϸ�");
				} else {
					System.out.println("ȸ������ ����");
				}

			} else if (choice == 6) {
				System.out.println("���α׷��� �����մϴ�...");
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �ٽ� �Է����ּ���.");
			}
		}

	}

}
