package com.employee;

public class Security extends Employee {
	
	public static void main(String arg[]){
		Employee employee = new Security();
		employee.setEmpid(1234);
		employee.setEmpName("Ram");
		employee.setEmpSalary(2345);
		
		System.out.println(employee.getEmpid());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpSalary());
		

	}

}
