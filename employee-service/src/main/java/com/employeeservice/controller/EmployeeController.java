package com.employeeservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeeservice.model.Employee;
import com.employeeservice.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeRepository repository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	@PostMapping
	public ResponseEntity<Employee> add(@RequestBody Employee data) {
		LOGGER.info("employee ADD{}", data);
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.add(data));
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Employee> findById(@PathVariable("id")Long id) {
		LOGGER.info("employee find by id{}", id);
		return ResponseEntity.status(HttpStatus.OK).body(repository.findById(id));
		
	}
	@GetMapping
	public ResponseEntity<List<Employee>> findALL() {
		LOGGER.info("employee find all");
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.findAll());
		
	}
	@GetMapping("/department/{departmentId}")
	public ResponseEntity<List<Employee>> findByDepartmentId(@PathVariable("departmentId")Long departmentId) {
		LOGGER.info("employee department find by id{}", departmentId);
		return ResponseEntity.status(HttpStatus.OK).body(repository.findByDepartmentId(departmentId));
		
	}
}
