package com.emptimetrack.dao;

import java.util.List;

import com.emptimetrack.entity.EmployeeEntity;

public interface EmployeDao {

	List<EmployeeEntity> list();

	long save(EmployeeEntity emp);

	
	
	
}
