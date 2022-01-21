import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//1.로그인 2.회원가입 3.회원목록보기 4.회원정보수정 5.회원탈퇴 6.종료
		
		Scanner sc = new Scanner(System.in);
		MemberDAO dao = new MemberDAO();
		
		System.out.println("====회원관리 시스템====");

		while(true) {
			System.out.print("1.로그인 2.회원가입 3.회원목록보기 4.회원정보수정 5.회원탈퇴 6.종료 >> ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.println("====로그인====");
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				String nick = dao.login(id, pw);
				
				if(nick != null) {
					System.out.println(nick + "님 환영합니다.");
				} else {
					System.out.println("로그인 실패...");
				}
				
			} else if (choice == 2) {
				System.out.println("====회원 가입====");
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				System.out.print("닉네임 입력 : ");
				String nick = sc.next();
				
				int cnt = dao.join(id, pw, nick);
				
				if(cnt > 0) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("회원가입 실패");
				}
				
			} else if (choice == 3) {
				System.out.println("====회원목록보기====");
				ArrayList<MemberDTO> list = dao.selectAll();
				
				for(int i = 0; i<list.size(); i++) {
					System.out.print(list.get(i).getId()+ " - ");
					System.out.print(list.get(i).getPw()+ " - ");
					System.out.println(list.get(i).getNick());
				}
				
				
			} else if (choice == 4) {
				
				System.out.println("====회원정보수정====");
				System.out.println("변경 시킬 닉네임을 입력해주세요 >>");
				String inputNick =sc.next();
				int cnt = dao.update(inputNick);
				
				if (cnt > 0) {
					System.out.println("수정 성공");
				} else {
					System.out.println("수정 실패");
				}
				
			} else if (choice == 5) {
				
			} else if (choice == 6) {
				System.out.println("프로그램을 종료합니다...");
				break;
			} else {
				System.out.println("정확한 숫자를 다시 입력해주세요.");
			}
		}
		
		
	}

}
