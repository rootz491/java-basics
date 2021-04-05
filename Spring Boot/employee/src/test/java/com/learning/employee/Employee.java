package com.learning.employee;

//	creating an Employee entity
public class Employee {

	private String firstName;
	private String lastName;
	private Integer id;
	private String email;

	public Employee() {}

	public Employee(Integer id, String firstName, String lastName, String email) {
		super();

		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//	overriding toString method to find all values
	@Override
	public String toString() {
		return "Employee [id="
			+ id + ", firstName="
			+ firstName + ", lastName="
			+ lastName + ", email="
			+email + "]";
	}

	//	getter of properties
	public Integer getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	//	setter of properties
	public void setId(Integer id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}