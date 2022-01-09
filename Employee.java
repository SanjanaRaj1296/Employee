package com.te.streamapi;

public class Employee {
	
	int id;
	String name;
	double salary;
String designation;
	int age;
	public Employee(int id, String name, double salary,String designation, int age) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation=designation;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", age=" + age + "]";
	}
}
	
	
	