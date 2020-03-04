package com.emptimetrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emptimetrack.model.Employee;
import com.emptimetrack.service.EmployeService;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeService empservice;
	
	 @PostMapping("/employe")
	   public ResponseEntity<?> saveEmployee(@RequestBody Employee emp) {
	      long id = empservice.saveEmployee(emp);
	      return ResponseEntity.ok().body("New Employee has been saved with ID:" + id);
	   }
	
	 @GetMapping("/employelist")
	 public ResponseEntity<List<Employee>> list() {
	      List<Employee> employe = empservice.list();
	      return ResponseEntity.ok().body(employe);
	   }
	
	 @PutMapping("/employelist")
	 public ResponseEntity<List<Employee>> updateSwapeHours() {
	      List<Employee> employe = empservice.list();
	      return ResponseEntity.ok().body(employe);
	   }
	
	
}
