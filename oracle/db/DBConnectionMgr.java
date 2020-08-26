package oracle.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionMgr {
	public static final String _DRIVER = "oracle.jdbc.driver.OracleDriver";// ClassNotFoundException
	public static final String _URL = "jdbc:oracle:thin:@192.168.0.59:1521:orc11";
	public static String _USER = "scott";
	public static String _PW = "tiger";
	public Connection con = null;
	// 싱글톤 패턴에 대해 생각해보기

	// 물리적으로 멀어져있는 오라클 서버와 연결 통로 만들기
	public Connection getConnetcion() {
		try {// 예외처리를 하였다.실행시에 에러 발생할 가능성이 있는 코드는 try..catch안에 써준다.
			Class.forName(_DRIVER);
			con = DriverManager.getConnection(_URL, _USER, _PW);// 인스턴스화
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 클래스를 찾을 수 없습니다.");
		} catch (Exception e) {
			System.out.println("연결 실패!!!." + e.toString());
		}
		return con;// NullPointerException-인스턴스화 문제로 발생된다.
	}

	public static void main(String[] args) {
		DBConnectionMgr dbMgr = new DBConnectionMgr();
		dbMgr.con = dbMgr.getConnetcion();
		System.out.println("con => " + dbMgr.con);
	}
}
