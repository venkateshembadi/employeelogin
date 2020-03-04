package com.emptimetrack.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emptimetrack.model.Employee;


@Repository
public class EmployeDaoImp implements EmployeDao {

  @Autowired
   private SessionFactory sessionFactory;

	
	@Override
	public List<Employee> list() {
		 Session session = sessionFactory.getCurrentSession();
	      CriteriaBuilder cb = session.getCriteriaBuilder();
	      CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
	      Root<Employee> root = cq.from(Employee.class);
	      cq.select(root);
	      Query<Employee> query = session.createQuery(cq);
	      return query.getResultList();
	}


	@Override
	public long save(Employee emp) {
		 sessionFactory.getCurrentSession().save(emp);
	      return emp.getEid();
	}
	
	
	
	
	
	
	
	

}
