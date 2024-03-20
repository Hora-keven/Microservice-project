package com.study.serviceregistry.controller;

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

import com.study.serviceregistry.model.Department;
import com.study.serviceregistry.repository.DepartmentRepository;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentRepository repository;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping
	public ResponseEntity<Department> add(@RequestBody Department data) {
		LOGGER.info("DEPARTMENT ADD{}", data);
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.addDepartment(data));
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Department> findById(@PathVariable("id")Long id) {
		LOGGER.info("DEPARTMENT find by id{}", id);
		return ResponseEntity.status(HttpStatus.OK).body(repository.findById(id));
		
	}
	@GetMapping
	public ResponseEntity<List<Department>> findALL() {
		LOGGER.info("deparments find all");
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.findAll());
		
	}
}
