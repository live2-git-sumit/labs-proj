package com.live.model;

public class Employee {
	private String EmployeeId;
	private String EmployeeName;
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + "]";
	}
	
	
}
