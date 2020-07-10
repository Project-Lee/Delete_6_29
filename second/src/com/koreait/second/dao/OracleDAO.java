package com.koreait.second.dao;

import java.sql.Connection;
import java.sql.DriverManager;

// 시험문제 임 위에부터 제일 밑에까지 싹다 이해하고 넘어가기 
public class OracleDAO {

		private static OracleDAO dao = null;  // 생성자에 private 걸면 바깥에서 생성못하게끔 하는법 
		
		private OracleDAO() {}
		
		public static OracleDAO getInstance() { // getInstance 이것은 싱글톤을 사용할때 getName() 이런것처럼 이름 관례상 약속 한 메소드 명 
			if(dao == null) { 	// 한개만 생성되고 그이후로는 null이 아니니 한개를 계속 리턴한다
				dao = new OracleDAO();
			}
			return dao;
		}
		
		
		
		
	
	// getConn()   ->   throws Exception 하면 try , catch 사용안하고 미루는것임 ( 그냥 지가 try 쓰기귀찮으니까 마지막에 최종적으로 오류 다 보겠다 )  
	public Connection getConn() throws Exception {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String userName = "hr";
		String password = "koreait2020";
		
		Connection con = null;
		/////////// = try 문 사용시 이부분을 주석처리하기 - ////////////
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, userName, password);
		//////////////////////////////////////////////////////
		
		
		
//		try 캐치문 뺏을경우 
		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			con = DriverManager.getConnection(url, userName, password);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		System.out.println("접속 성공!!!");
		return con;
	}
	
	
	// 위에 
	public void closeConn(Connection conn) throws Exception {
		// conn.close();
		
		
		// 밑에 코드가 FM코드 
		if (conn != null) {
			try {
				conn.close();
			} catch (Exception e) {}
			
		}
	}
	
	// 싱글톤 - 무조건 객체생성은 하나만 만들게끔 고정 하는것 
	// ex) 홈페이지에  접속자가 한명 추가될때마다 한개이 객체가 추가된다 했을때 너무 많으면 메모리 관리가 안되니 한개의 객체로 여러명이 들어올때마다 돌려쓰는 것 
	
}
