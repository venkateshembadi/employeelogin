package com.emptimetrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emptimetrack.dao.EmployeDao;
import com.emptimetrack.model.Employee;

@Service
@Transactional(readOnly = true)
public class EmployeServiceImp implements EmployeService {

	@Autowired
	EmployeDao empdao;
	
	
	@Override
	public List<Employee> list() {
		// TODO Auto-generated method stub
		return empdao.list();
	}


	@Override
	public long saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
		 return empdao.save(emp);
	}
	
	@Override
	public long updateSwipeHours(Employee emp) {
		// TODO Auto-generated method stub
		 return empdao.save(emp);
	}

	
	
	
}
