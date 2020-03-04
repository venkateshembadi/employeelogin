package com.emptimetrack.service;

import java.util.List;

import com.emptimetrack.model.Employee;

public interface EmployeService {

	List<Employee> list();

	long saveEmployee(Employee emp);
	
	long updateSwipeHours(Employee emp);

}
