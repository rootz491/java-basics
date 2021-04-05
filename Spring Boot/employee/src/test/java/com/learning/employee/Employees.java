package com.learning.employee;

import java.util.ArrayList;
import java.util.List;

//	class to store list of 
//	all the employees in a
//	ArrayList
public class Employees {
	//	employeeList
	private List<Employee> employeeList;

	//	getter of employeeList
	public List<Employee> getEmployeeList() {

		if (employeeList == null)
			employeeList = new ArrayList<Employee>();

		return employeeList;
	}

	//	setter of employeeList
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
}