package com.emptimetrack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emptimetrack.entity.EmployeeEntity;
import com.emptimetrack.service.EmployeService;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeService empservice;
	
	 @PostMapping("/employe")
	   public ResponseEntity<?> saveEmployee(@RequestBody EmployeeEntity request) {
		 long employee = empservice.saveEmployee(request);
	      return ResponseEntity.ok().body(employee);
	   }
	
	 @GetMapping("/employelist")
	 public ResponseEntity<List<EmployeeEntity>> list() {
	      List<EmployeeEntity> employe = empservice.list();
	      return ResponseEntity.ok().body(employe);
	   }
	
	 @PutMapping("/employeeswipe")
	 public ResponseEntity<?> updateSwapeHours(@RequestBody EmployeeEntity request) {
		 long employee = empservice.updateSwipeHours(request);
	      return ResponseEntity.ok().body(employee);
	   }
	
	
}
