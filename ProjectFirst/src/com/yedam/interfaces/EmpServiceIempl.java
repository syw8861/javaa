package com.yedam.interfaces;

public class EmpServiceIempl implements EmpService{
	EmpDAO dao = new EmpDAO();
	
	
	@Override
	public void createEmp(Employee emp) {
		dao.insertEmp(emp);
	}

	@Override
	public void getEmpList() {
		for (Employee emp : dao.getEmpList()) {
			if (emp != null)
			System.out.println(emp.toString());
		}
		
	}
	@Override
	public void changEmp(Employee emp) {
		dao.updateEmp(emp);
		
	}
	@Override
	public void removeEmp(int empId) {
		dao.deleteEmp(empId);
		
	}
}