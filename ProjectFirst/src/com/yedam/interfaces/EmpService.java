package com.yedam.interfaces;

public interface EmpService {
	//기능정의,,,,, 구현은X
	//정의해줘야 할 기능 -> 1, 한건생성  2,전체조회  3.한건수정  4.한건삭제;
	public void createEmp(Employee emp); //  ==   public abstract void createEmp();
	public void getEmpList();
	public void changEmp(Employee emp);
	public void removeEmp(int empId);
}
