package com.emptimetrack.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class LoginEntity {
	
	@Id
	public Integer loginId;
	
	private Date swipeIn;
	
	private Date swipeOut;
	
	@ManyToOne
    @JoinColumn(name = "eid")
	public EmployeeEntity employee;

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}

	public Date getSwipeIn() {
		return swipeIn;
	}

	public void setSwipeIn(Date swipeIn) {
		this.swipeIn = swipeIn;
	}

	public Date getSwipeOut() {
		return swipeOut;
	}

	public void setSwipeOut(Date swipeOut) {
		this.swipeOut = swipeOut;
	}

	public EmployeeEntity getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}
	
}
