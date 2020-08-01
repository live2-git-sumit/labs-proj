package com.live.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


//Spring Framework is all about reflection
@Configuration
@ComponentScan("com.live")
@PropertySource("classpath:database-mysql.properties")
public class AppConfig {
	
	private final String DB_DRIVER = "db_driver";
	private final String DB_URL = "db_url";
	private final String DB_USER = "db_user";
	private final String DB_PASSWORD = "db_password";
	
	
	@Autowired
	Environment environment;
	
	@Bean
	DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getProperty(DB_DRIVER));
		dataSource.setUrl(environment.getProperty(DB_URL));
		dataSource.setUsername(environment.getProperty(DB_USER));
		dataSource.setPassword(environment.getProperty(DB_PASSWORD));
		return dataSource;
	}
	

}
