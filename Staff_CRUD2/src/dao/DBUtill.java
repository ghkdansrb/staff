package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtill {
	//final 로 상수화
	//static문법을 사용해서 멤버변수(전역변수)에 포함시켜 매개변수안에 생성자로 생성하지 않고 사용할 수 있다.
	//변수 선언할때 초기화 하는 방법보다 static블록안에서 초기화 하는방법이 트렌디하다.
	private static final String driver;
	private static final String url;
	private static final String user;
	private static final String pw;
	static {
		driver = "oracle.jdbc.OracleDriver";
		url = "jdbc:oracle:thin:@localhost:1521:XE";
		user = "myid";
		pw = "staffpw";
	}
	// static문법으로 멤버변수(전역변수)에 포함시켜 매개변수안에서 생성하지 않고 사용할 수 있다.
	public static Connection getConnection() {
		Connection conn = null;
		try{
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
