package johoon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class userDAOimple implements userDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private final String url = "jdbc:mysql://localhost/sds?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC";
	private final String user_id = "root";
	private final String user_pw = "hhtad9134";
	
	private final String SQL_INSERT = "INSERT INTO USER(num, name, addr, tel, date) VALUES (?, ?, ?, ?, ?)";
	private final String SQL_UPDATE = "update Member set id = ?, pw = ?, name = ?, tel = ? where num = ?";
	private final String SQL_DELETE = "DELETE FROM user WHERE num = ?";
	private final String SQL_DELETE_ALL = "DELETE FROM user";
	private final String SQL_SET_AUTO_INCREMENT = "ALTER TABLE user SET AUTO_INCREMENT = 1";
	private final String SQL_SELECT_ONE = "select * from member where num = ?";
	private final String SQL_SELECT_ALL = "select * from member order by num desc limit 5";
	private final String SQL_SEARCH_LIST = "select * from member where name = ? or tel = ?";
	
	public userDAOimple() {
		System.out.println("userDAOimple Constuructor()...");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver successed...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally { // 무조건 실행
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public int insert(userVO vo) {
		int flag = 0;
		try {
			conn = DriverManager.getConnection(url, user_id, user_pw);
			System.out.println("\n #############################");
			System.out.println(  " # insert Connection Success #");
			System.out.println(  " #############################\n");
		
			pstmt = conn.prepareStatement(SQL_INSERT);
			pstmt.setInt   (1, vo.getNum());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getAddr());
			pstmt.setString(4, vo.getTel());
			pstmt.setString(5, vo.getDate());
			
			flag = pstmt.executeUpdate(); // DML용

			System.out.println("\n ####################################");
			System.out.println(  " # insert Prepare Statement success #");
			System.out.println(  " ####################################\n");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { // 무조건 실행
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return flag;
	}
	
	@Override
	public int update(userVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int delete(userVO vo) {
		int flag = 0;
		try {
			conn = DriverManager.getConnection(url, user_id, user_pw);
			System.out.println("\n #############################");
			System.out.println(  " # delete Connection Success #");
			System.out.println(  " #############################\n");

			pstmt = conn.prepareStatement(SQL_DELETE);

			pstmt.setLong(1, vo.getNum());

			flag = pstmt.executeUpdate(); // insert, update, delete (DML) 용

			System.out.println("\n ####################################");
			System.out.println(  " # delete Prepare Statement success #");
			System.out.println(  " ####################################\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return flag;
	}
	
	@Override
	public int deleteAll() {
		int flag = 0;
		try {
			conn = DriverManager.getConnection(url, user_id, user_pw);
			System.out.println("\n #############################");
			System.out.println(  " # delete Connection Success #");
			System.out.println(  " #############################\n");

			pstmt = conn.prepareStatement(SQL_DELETE_ALL);

			flag = pstmt.executeUpdate(); // insert, update, delete (DML) 용

			System.out.println("\n ####################################");
			System.out.println(  " # delete Prepare Statement success #");
			System.out.println(  " ####################################\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return flag;
	} 
	
	@Override
	public void set_auto_increment() {
		try {
			conn = DriverManager.getConnection(url, user_id, user_pw);
			System.out.println("\n #############################");
			System.out.println(  " # setaut Connection Success #");
			System.out.println(  " #############################\n");

			pstmt = conn.prepareStatement(SQL_SET_AUTO_INCREMENT);

			rs = pstmt.executeQuery(); // insert, update, delete (DML) 용

			System.out.println("\n ####################################");
			System.out.println(  " # setaut Prepare Statement success #");
			System.out.println(  " ####################################\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	} 
	
	@Override
	public userVO selectOne(userVO vo) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<userVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
