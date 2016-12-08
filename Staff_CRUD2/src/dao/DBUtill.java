package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtill {
	//final �� ���ȭ
	//static������ ����ؼ� �������(��������)�� ���Խ��� �Ű������ȿ� �����ڷ� �������� �ʰ� ����� �� �ִ�.
	//���� �����Ҷ� �ʱ�ȭ �ϴ� ������� static��Ͼȿ��� �ʱ�ȭ �ϴ¹���� Ʈ�����ϴ�.
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
	// static�������� �������(��������)�� ���Խ��� �Ű������ȿ��� �������� �ʰ� ����� �� �ִ�.
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
