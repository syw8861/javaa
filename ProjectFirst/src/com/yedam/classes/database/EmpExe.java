package com.yedam.classes.database;

public class EmpExe {
	public static void main(String[] args) {
		empDA0 dao = new empDA0();
		Emp emp = new Emp("Hong", "2020/05/15");
		emp.setEmployeeId(300);
		emp.setSalary(3000);
		dao.insertEmp(emp);
		
//		empDA0 dao = new empDA0();
//		Employee[] employees = dao.getEmpList();
//		for (Employee emp : employees) {
//			if (emp != null) {
//				System.out.println(emp.toString());
//			}
//		}
	}//end of main()
}//end of class
