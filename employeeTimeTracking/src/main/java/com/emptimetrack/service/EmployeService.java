package com.emptimetrack.service;

import java.util.List;

import com.emptimetrack.entity.EmployeeEntity;

public interface EmployeService {

	List<EmployeeEntity> list();

	long saveEmployee(EmployeeEntity emp);
	
	long updateSwipeHours(EmployeeEntity emp);

	

}
