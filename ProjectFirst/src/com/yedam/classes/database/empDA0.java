package com.yedam.classes.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class empDA0 {
	
	//사원등록 Emp 테이블 insert해주기
	public void insertEmp(Emp emp) { //매게값으로 Emp 클래스에 emp 인스턴스가 와야한다는 말
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //접속주소(oracle db에 접속하기위한)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클패키지 밑에 jdbc 드라이버 오라클드라이버가 있는지 확인 //에러날까봐 예외처리해줌
			conn = DriverManager.getConnection(url, "hr", "hr"); //getconnection메소드 주소/사용자/비밀번호  체크
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			} catch (SQLException e) {
			e.printStackTrace();
		} 
		String sql = "insert into emp values("+emp.getEmployeeId() + ", "
											  +"'"+emp.getLastName()+"'"+ ", "
											  +emp.getSalary()+ " ,"
											  +"'"+emp.getHireDate()+
											  "'" +")";
		try {
			System.out.println(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql); //sql구문 만든걸 실행하기전에 담아놓는거
			int r = pstmt.executeUpdate(); //업데이트 되는 갯수를 r변수에다가 담아서 
			System.out.println(r + "건이 입력되었습니다."); //r건을 입력되었다고 해줌
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}//end of insertEmp();
	
	//employees테이블 데이터조회결과
	public Employee[] getEmpList() {
		Employee[] emps = new Employee[1000];
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; //접속주소(oracle db에 접속하기위한)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //오라클패키지 밑에 jdbc 드라이버 오라클드라이버가 있는지 확인 //에러날까봐 예외처리해줌
			conn = DriverManager.getConnection(url, "hr", "hr"); //getconnection메소드 주소/사용자/비밀번호  체크
			} catch (ClassNotFoundException e) {
			e.printStackTrace();
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		String sql ="select * from employees"; //쿼리구문 넣어주기
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); //resultset rs<<에다가 쿼리실행결과를 담겠다
			int i = 0;
			while(rs.next()) { //가지고 올 데이터가 있으면 while구문을 실행시키겠다.
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNuber(rs.getString("Phone_Number"));
				emps[i++] = emp;//Employee 인스턴스를 저장;
				
//				System.out.println(rs.getInt("employee_id")+" "  //바로 출력해주는거
//						          +rs.getString("first_name")+" "
//						          +rs.getString("last_name")+" "
//						          +rs.getString("email")+" "
//						          +rs.getString("Phone_number"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("조회 완료");
		return emps;
	} //end of getEmpList()
}
