import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberDAO {
	//DAO >> 데이터안에 값을 넣고 꺼내주는 역할 >> Controller에 적합
	// DataBase Access Object
	// 데이타 베이스의 접근할 수 있는 객체를 만들수 있는 클래스

	private Connection conn = null;
	private PreparedStatement psmt;// 필드에 놓여진 레퍼런스 변수값은 기본값으로 null값이 들어가서 사실 쓸 필요가 없다.
	private ResultSet rs;

	// 드라이버 로딩과 커넥션 객체를 가져오는 메소드
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (ClassNotFoundException e) {// 예외상황일시 catch가 잡아줌 >> 클래스를 찾을 수 없습니다.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DataBase와 연결을 끊어주는 메소드
	private void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	// 로그인 기능
	public String login(String id, String pw) {
		String nick = null;
		try {
			// JDBC
			// 0. JDBS를 사용하는 프로젝트에 Driver 파일넣기
			// 1. Driver 로딩 (Oracle Driver) -> 동적로딩
			// 내가 사용하는 DBMS의 드라이버 로딩
			// 2.Connection 연결
			// JBDS에는 세가지가 필요하다.
			// DB에 접속하게 도와주는 ID,PW,그리고 접속가능한 url이 필요하다!!
			getConnection();
			// 이 메소드를 처리해주기

			// 3. SQL문 작성 및 실행
			String sql = "select * from bigmember where id = ? and pw = ?"; // 무언가 값이 바뀌는걸 처리할 땐 ?처리한다.

			psmt = conn.prepareStatement(sql); // PrepareStatement로 sql을 가져옴 변수명은 보통 psmt로 한다.
			psmt.setString(1, id); // 1번째 물음표에 id 값을 넣어라!
			psmt.setString(2, pw); // 2번째 물음표에 pw 값을 넣어라!
			// 여기까지 해서 물음표 다 처리했다면 이제 실행단계가 남았다.
			rs = psmt.executeQuery();// executrQuery >> 테이블의 내용이 변화가 없을 때 사용

			if (rs.next()) {
				nick = rs.getString("nick"); //"nick"을 쳐줘야 그 열 값 안에 nick값이 불러와짐!!
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 4. Java와 DataBase간의 연결을 끊어준다.
			// 닫아주는 순서 >> rs -> psmt -> conn
			// id -> pbk인 회원의 닉네임을
			// '킹병관' 으로 바꾸어 주세요
			close();
		}
		return nick;
	}

	// 회원가입 기능을 옮겨보자
	public int join(String id, String pw, String nick) {
		int cnt = 0;
		try {
			getConnection();
			// 3. SQL문 작성 및 실행
			String sql = "insert into bigmember values(?,?,?)"; // 무언가 값이 바뀌는걸 처리할 땐 ?처리한다.
			psmt = conn.prepareStatement(sql); // PrepareStatement로 받아옴 변수명은 보통 psmt로 한다.
			psmt.setString(1, id); // 1번째 물음표에 id 값을 넣어라!
			psmt.setString(2, pw);
			psmt.setString(3, nick); // 여기까지 해서 물음표 다 처리했다면 이제 실행단계가 남았다.
			cnt = psmt.executeUpdate(); // 테이블의 내용이 변경될 때 사용! (값 추가, 값 삭제, 값 수정)
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 회원정보수정을 옮겨보자
	public int update(String inputNick) {
		int cnt = 0;
		try {
			getConnection();
			
			String sql = "update bigmember set nick = ? where id = 'pbk'"; // 무언가 값이 바뀌는걸 처리할 땐 ?처리한다.
			psmt = conn.prepareStatement(sql); // PrepareStatement로 sql을 가져옴 변수명은 보통 psmt로 한다.
			psmt.setString(1, inputNick);
			
			cnt = psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	//회원목록보기 메소드
	public ArrayList<MemberDTO> selectAll() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>(); 
		getConnection();
		
		try {
			String sql ="select * from bigmember";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String nick = rs.getString(3);//컬럼명을 쓰든 컬럼 번째 수를 쓰든 상관없다.
				MemberDTO m = new MemberDTO(id, pw, nick);
				list.add(m);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
		
	}

}
