package com.learning.employee;

import org.springframework.stereotype.Repository;

//	Importing the employees class
import com.learning.employee.Employees;

@Repository

//	class to create a list of employees
public class EmployeeDAO {

	private static Employees list = new Employees();

	//	method to return the list
	public Employees getAllEmployees() {
		return list;
	}

	//	method to add an employee to list of employees
	public void addAllEmployees(Employee employee) {
		list.getEmployeeList().add(employee);
	}



	//	this static block will execute before main block
	static {
		//	Creating a few employees
		//	and adding them to the list
		list.getEmployeeList().add(
			new Employee(1, "Karan", "Sharma", "rootz491@hackerone.com")
		);

		list.getEmployeeList().add(
			new Employee(2, "Nikhil", "Swain", "nikhilswain36@gmail.com")
		);

		list.getEmployeeList().add(
			new Employee(3, "Sudhanshu", "Rajdhur", "sudi@hackerone.com")
		);
	}
}
