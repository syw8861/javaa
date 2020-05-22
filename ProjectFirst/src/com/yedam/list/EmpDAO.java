package com.yedam.list;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO
{
	Connection conn = null;
	PreparedStatement pstmt = null;

	public Connection getConnect()
	{
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 접속주소(oracle db에 접속하기위한)
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클패키지 밑에 jdbc 드라이버 오라클드라이버가 있는지 확인 //에러날까봐 예외처리해줌
			conn = DriverManager.getConnection(url, "hr", "hr"); // getconnection메소드 주소/사용자/비밀번호 체크
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		return conn;
	}

	public void insertEmp(Employee emp)
	{
		String sql = "insert into emp values(?,?,?,?)";
		conn = getConnect();
		try
		{
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getLastName());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setString(4, emp.getHireDate());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력됨");

		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Employee> getEmpList()
	{
		String sql = "select * from emp";
		conn = getConnect();
		List<Employee> employees = new ArrayList<>();
		int i = 0;
		try
		{
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				Employee emp = new Employee(rs.getInt("employee_id"), rs.getString("last_name"), rs.getInt("salary"),
						rs.getString("hire_date"));

				employees.add(emp);
			};
		} catch (SQLException e)
		{

			e.printStackTrace();
		}
		return employees;
	}

	public void updateEmp(Employee emp)
	{
		// 전체 : 급여만 변경
		String sql = "update emp set salary = ? where employee_id = ??";
		conn = getConnect();
		try
		{
			pstmt = conn.prepareCall(sql);
			pstmt.setInt(1, emp.getSalary());
			pstmt.setInt(2, emp.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 변경됨");
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteEmp(int empId)
	{
		conn = getConnect();
		String sql = "delete from emp where employee_id = ?";
		try
		{
			pstmt = conn.prepareCall(sql);
			pstmt.setInt(1, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 삭제");
		} catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
