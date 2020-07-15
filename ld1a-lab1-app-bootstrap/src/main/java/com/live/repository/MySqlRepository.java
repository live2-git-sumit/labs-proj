package com.live.repository;

import java.util.ArrayList;
import java.util.List;

import com.live.model.Employee;

public class MySqlRepository implements EmployeeRepository {

	@Override
	public List<Employee> getEmployee()  {
		System.out.println("MySQL Repository");
		List<Employee> employees = new ArrayList<>();

		Employee employee = new Employee();

		employee.setEmployeeId("1001");
		employee.setEmployeeName("Ram MySQL");

		employees.add(employee);
		

		return employees;
	}

}
