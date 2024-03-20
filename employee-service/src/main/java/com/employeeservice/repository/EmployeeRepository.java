package com.employeeservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.employeeservice.model.Employee;

@Repository
public class EmployeeRepository {
	private List<Employee> employees = new ArrayList<>();
	
	public Employee add(Employee data) {
		employees.add(data);
		return data;
	}
	public Employee findById(Long id){
		return employees.stream().filter(e -> e.id().equals(id)).findFirst().orElseThrow();
	}
		
	public List<Employee> findAll(){
		return employees;
	}
	public List<Employee> findByDepartmentId(Long id){
		return employees.stream().filter(e -> e.departmentId().equals(id)).toList();
	}
}
