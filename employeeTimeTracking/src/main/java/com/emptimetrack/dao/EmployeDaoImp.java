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

import com.emptimetrack.entity.EmployeeEntity;


@Repository
public class EmployeDaoImp implements EmployeDao {

  @Autowired
   private SessionFactory sessionFactory;

	
	@Override
	public List<EmployeeEntity> list() {
		 Session session = sessionFactory.getCurrentSession();
	      CriteriaBuilder cb = session.getCriteriaBuilder();
	      CriteriaQuery<EmployeeEntity> cq = cb.createQuery(EmployeeEntity.class);
	      Root<EmployeeEntity> root = cq.from(EmployeeEntity.class);
	      cq.select(root);
	      Query<EmployeeEntity> query = session.createQuery(cq);
	      return query.getResultList();
	}


	@Override
	public long save(EmployeeEntity emp) {
		 sessionFactory.getCurrentSession().save(emp);
	      return emp.getEid();
	}
	
	
	
	
	
	
	
	

}
