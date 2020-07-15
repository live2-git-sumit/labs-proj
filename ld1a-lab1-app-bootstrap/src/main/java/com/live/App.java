package com.live;

import com.live.repository.EmployeeRepository;
import com.live.repository.MySqlRepository;
import com.live.repository.OracleRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        oracleEmployee();
        mySqlEmployee();
    }

	private static void oracleEmployee() {
		
        EmployeeRepository empRepo = new OracleRepository();
        empRepo.getEmployee().forEach(System.out::println);
	}
	private static void mySqlEmployee() {
		
        EmployeeRepository empRepo = new MySqlRepository();
        empRepo.getEmployee().forEach(System.out::println);
	}
}
