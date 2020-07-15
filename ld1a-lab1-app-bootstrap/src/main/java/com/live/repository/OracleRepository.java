package com.live.repository;

import java.util.ArrayList;
import java.util.List;

import com.live.model.Employee;

public class OracleRepository implements EmployeeRepository {

	@Override
	public List<Employee> getEmployee()  {
		System.out.println("Oracle Repository");
		List<Employee> employees = new ArrayList<>();

		Employee employee = new Employee();

		employee.setEmployeeId("1002");
		employee.setEmployeeName("Laxman Oracle");
		
		
		Employee employee2 = new Employee();

		employee2.setEmployeeId("1003");
		employee2.setEmployeeName("Hanuman Oracle");
		

		employees.add(employee);
		employees.add(employee2);
		
		return employees;
	}

}
