package com.SpringBootJdbcTemplateInit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	private Integer empId;
	private String empName;
	private Double empSal;

}
