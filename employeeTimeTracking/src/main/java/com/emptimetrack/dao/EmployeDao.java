package com.emptimetrack.dao;

import java.util.List;

import com.emptimetrack.model.Employee;

public interface EmployeDao {

	List<Employee> list();

	long save(Employee emp);

	
	
	
}
