package com.live;



import com.live.repository.MySqlRepository;
import com.live.repository.OracleRepository;
import com.live.repository.ProductRepository;

public class App 
{
    public static void main( String[] args )
    {
    testSingleton();
    }

	
	
	private static void testSingleton() {
		ProductRepository mysqlInstance = MySqlRepository.getInstance();
		System.out.println(mysqlInstance.toString());
		
		ProductRepository mysqlInstance2 = MySqlRepository.getInstance();
		System.out.println(mysqlInstance2.toString());
		
		ProductRepository oracleInstance = OracleRepository.getInstance();
		System.out.println(oracleInstance.toString());
		
		ProductRepository oracleInstance2 = OracleRepository.getInstance();
		System.out.println(oracleInstance2.toString());
	}
}
