package com.emptimetrack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emptimetrack.dao.EmployeDao;
import com.emptimetrack.entity.EmployeeEntity;

@Service
@Transactional(readOnly = true)
public class EmployeServiceImp implements EmployeService {

	@Autowired
	EmployeDao empdao;

	@Override
	public List<EmployeeEntity> list() {
		return empdao.list();
	}

	@Override
	public long saveEmployee(EmployeeEntity entity) {
		return empdao.save(entity);
	}

	@Override
	public long updateSwipeHours(EmployeeEntity emp) {
		return empdao.save(emp);
	}

}
