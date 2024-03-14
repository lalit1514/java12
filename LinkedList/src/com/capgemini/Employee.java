package com.capgemini;

public class Employee {
private int empId;
private String empName;
private int empAge;
private int empSalary;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public int getEmpAge() {
	return empAge;
}
public void setEmpAge(int empAge) {
	this.empAge = empAge;
}
public int getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int empId, String empName, int empAge, int empSalary) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empAge = empAge;
	this.empSalary = empSalary;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
			+ ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName() + ", getEmpAge()=" + getEmpAge()
			+ ", getEmpSalary()=" + getEmpSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
	

	}


