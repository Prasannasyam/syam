package com.employee;

public class Manager extends Employee{
	
	public static void main(String arg[]) {
		
		Employee employee = new Manager();
		employee.setEmpid(6789);
		employee.setEmpName("syam");
		employee.setEmpSalary(12345);
		
		System.out.println(employee.getEmpid());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpSalary());
		
		
	}

}
