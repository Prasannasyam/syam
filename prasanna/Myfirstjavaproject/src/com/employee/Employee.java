package com.employee;

public class Employee {
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String empName, int empSalary) {
		this.empid = empid;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	int empid;
	String empName;
	int empSalary;

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

}
