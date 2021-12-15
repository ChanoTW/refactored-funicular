import java.util.ArrayList;
import java.util.Scanner;

public class LandMemberMain {

	public static void main(String[] args) {
		LandMemberDAO dao = new LandMemberDAO();
		Scanner sc = new Scanner(System.in);
		System.out.println("====회원관리 시스템====");

		while (true) {
			System.out.print("1.로그인 2.회원가입 3.회원목록보기 4.회원정보수정 5.회원탈퇴 6.종료 >>");
			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.println("====로그인====");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PASSWORD : ");
				String pw = sc.next();

				String nick = dao.login(id, pw);

				if (nick != null) {
					while (nick != null) {
						System.out.println(nick + "님 환영합니다!");
						System.out.println("게임 시작");
						break;
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						

					}
					while (true) {
						if (id.equals("admin")) {
							System.out.println("====관리자 모드====");
							System.out.println("1. 회원정보수정 2. 회원삭제 3. 전체회원ID보기 4. 관리자 로그아웃");
							System.out.print("숫자입력 >> ");
							choice = sc.nextInt();
							if (choice == 1) {
								System.out.println("====관리자 회원정보수정====");
								System.out.print("아이디 입력 : ");
								String change_id = sc.next();
								System.out.print("변경할 닉네임 입력 : ");
								String change_nick = sc.next();

								int cnt = dao.adminUpdate(change_id, change_nick);

								if (cnt > 0) {
									System.out.println(change_nick + "으로 회원정보 수정 완료!!!");
								} else {
									System.out.println("회원정보 수정 실패...");
								}
							} else if (choice == 2) {

								System.out.println("====회원삭제====");
								System.out.println("삭제할 회원을 선택합니다.");
								System.out.print("ID : ");
								String removeId = sc.next();

								if (dao.check(removeId)) {

									System.out.print(nick + "회원을 진짜 탈퇴를 시키시겠습니까? Y/N");
									String yn = sc.next();

									if (yn.equals("y") || yn.equals("Y")) {
										int cnt = dao.deleteId(removeId);
										if (cnt > 0) {
											System.out.println("회원삭제 완료!!!");
										}
									} else if (yn.equals("n") || yn.equals("N")) {
										System.out.println("처음부터 다시 시작합니다.");
									} else {
										System.out.println("잘못 입력했습니다.");
									}
								} else {
									System.out.println("회원이 존재하지 않습니다.");
								}
							} else if (choice == 3) {
								System.out.println("====전체회원ID보기====");
								ArrayList<LandMemberDTO> list = dao.selectAll();

								int listNum = 1;
								for (int i = 0; i < list.size(); i++) {
									LandMemberDTO m = list.get(i);
									if (!m.getId().equals("admin")) {
										System.out.println((listNum++) + ". " + m.getId());
									}
								}
							} else if (choice == 4) {
								System.out.println("===관리자 모드 종료====");
							} else {
								System.out.println("다시 입력해주세요.");
							}
							System.out.println();
						}
					}
				} else {
					System.out.println("로그인 실패...");
				}

			} else if (choice == 2) {
				System.out.println("====회원가입====");
				System.out.print("아이디 입력 :");
				String id = sc.next();
				System.out.print("비밀번호를 입력 :");
				String pw = sc.next();
				System.out.print("닉네임 입력 :");
				String nick = sc.next();
				int cnt = dao.join(id, pw, nick);

				if (cnt > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}

			} else if (choice == 3) {
				// 회원 목록 보기
				System.out.println("====회원목록보기====");
				ArrayList<LandMemberDTO> list = dao.selectAll();

				// pbk - 1234 - 호두아빠
				for (int i = 0; i < list.size(); i++) {
					LandMemberDTO m = list.get(i);
					System.out.print(m.getId() + "-");
					System.out.print(m.getPw() + "-");
					System.out.println(m.getNick());

				}

			} else if (choice == 4) {
				System.out.println("====회원정보수정====");
				System.out.println("회원정보를 확인합니다.");
				System.out.print("ID : ");
				String id = sc.next();
				System.out.print("PASSWORD : ");
				String pw = sc.next();
				String nick = dao.login(id, pw);
				System.out.println(nick + "님 회원정보가 일치합니다. 회원정보 변경하세요.");

				System.out.print("변경할 NICKNAME : ");
				String new_nick = sc.next();

				System.out.print("변경할 PASSWORD : ");
				String new_pw = sc.next();

				int cnt = dao.update(id, pw, new_nick, new_pw);

				if (cnt > 0) {
					System.out.println("회원정보 수정 성공!!!");
				} else {
					System.out.println("회원정보 수정 실패...");
				}

			} else if (choice == 5) {
				// 회원 탈퇴
				System.out.println("====회원탈퇴====");
				System.out.println("아이디 입력  : ");
				String id = sc.next();
				System.out.println("비밀번호 입력 : ");
				String pw = sc.next();
				int cnt = dao.delete(id, pw);

				if (cnt > 0) {
					System.out.println("회원삭제 완료");
				} else {
					System.out.println("회원삭제 실패");
				}

			} else if (choice == 6) {
				System.out.println("프로그램을 종료합니다...");
				break;
			} else {
				System.out.println("정확한 숫자를 다시 입력해주세요.");
			}
		}

	}

}
