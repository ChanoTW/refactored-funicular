import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberDAO {
	//DAO >> �����;ȿ� ���� �ְ� �����ִ� ���� >> Controller�� ����
	// DataBase Access Object
	// ����Ÿ ���̽��� ������ �� �ִ� ��ü�� ����� �ִ� Ŭ����

	private Connection conn = null;
	private PreparedStatement psmt;// �ʵ忡 ������ ���۷��� �������� �⺻������ null���� ���� ��� �� �ʿ䰡 ����.
	private ResultSet rs;

	// ����̹� �ε��� Ŀ�ؼ� ��ü�� �������� �޼ҵ�
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		} catch (ClassNotFoundException e) {// ���ܻ�Ȳ�Ͻ� catch�� ����� >> Ŭ������ ã�� �� �����ϴ�.
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DataBase�� ������ �����ִ� �޼ҵ�
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

	// �α��� ���
	public String login(String id, String pw) {
		String nick = null;
		try {
			// JDBC
			// 0. JDBS�� ����ϴ� ������Ʈ�� Driver ���ϳֱ�
			// 1. Driver �ε� (Oracle Driver) -> �����ε�
			// ���� ����ϴ� DBMS�� ����̹� �ε�
			// 2.Connection ����
			// JBDS���� �������� �ʿ��ϴ�.
			// DB�� �����ϰ� �����ִ� ID,PW,�׸��� ���Ӱ����� url�� �ʿ��ϴ�!!
			getConnection();
			// �� �޼ҵ带 ó�����ֱ�

			// 3. SQL�� �ۼ� �� ����
			String sql = "select * from bigmember where id = ? and pw = ?"; // ���� ���� �ٲ�°� ó���� �� ?ó���Ѵ�.

			psmt = conn.prepareStatement(sql); // PrepareStatement�� sql�� ������ �������� ���� psmt�� �Ѵ�.
			psmt.setString(1, id); // 1��° ����ǥ�� id ���� �־��!
			psmt.setString(2, pw); // 2��° ����ǥ�� pw ���� �־��!
			// ������� �ؼ� ����ǥ �� ó���ߴٸ� ���� ����ܰ谡 ���Ҵ�.
			rs = psmt.executeQuery();// executrQuery >> ���̺��� ������ ��ȭ�� ���� �� ���

			if (rs.next()) {
				nick = rs.getString("nick"); //"nick"�� ����� �� �� �� �ȿ� nick���� �ҷ�����!!
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 4. Java�� DataBase���� ������ �����ش�.
			// �ݾ��ִ� ���� >> rs -> psmt -> conn
			// id -> pbk�� ȸ���� �г�����
			// 'ŷ����' ���� �ٲپ� �ּ���
			close();
		}
		return nick;
	}

	// ȸ������ ����� �Űܺ���
	public int join(String id, String pw, String nick) {
		int cnt = 0;
		try {
			getConnection();
			// 3. SQL�� �ۼ� �� ����
			String sql = "insert into bigmember values(?,?,?)"; // ���� ���� �ٲ�°� ó���� �� ?ó���Ѵ�.
			psmt = conn.prepareStatement(sql); // PrepareStatement�� �޾ƿ� �������� ���� psmt�� �Ѵ�.
			psmt.setString(1, id); // 1��° ����ǥ�� id ���� �־��!
			psmt.setString(2, pw);
			psmt.setString(3, nick); // ������� �ؼ� ����ǥ �� ó���ߴٸ� ���� ����ܰ谡 ���Ҵ�.
			cnt = psmt.executeUpdate(); // ���̺��� ������ ����� �� ���! (�� �߰�, �� ����, �� ����)
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// ȸ������������ �Űܺ���
	public int update(String inputNick) {
		int cnt = 0;
		try {
			getConnection();
			
			String sql = "update bigmember set nick = ? where id = 'pbk'"; // ���� ���� �ٲ�°� ó���� �� ?ó���Ѵ�.
			psmt = conn.prepareStatement(sql); // PrepareStatement�� sql�� ������ �������� ���� psmt�� �Ѵ�.
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

	//ȸ����Ϻ��� �޼ҵ�
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
				String nick = rs.getString(3);//�÷����� ���� �÷� ��° ���� ���� �������.
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
