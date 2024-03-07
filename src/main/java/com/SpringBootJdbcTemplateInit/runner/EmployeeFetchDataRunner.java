package com.SpringBootJdbcTemplateInit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.SpringBootJdbcTemplateInit.model.Employee;
@Component
public class EmployeeFetchDataRunner implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("DATA OF EMPLOYEE TABLE IS:");
		String sql="SELECT * FROM EMPLOYEE";
		jt.query(sql, (r, count)-> new Employee(
										r.getInt("eid"),
										r.getString("ename"),
										r.getDouble("esal")
										)).forEach(System.out::println);

	}

}
