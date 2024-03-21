package com.study.serviceregistry.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.study.serviceregistry.model.Employee;


@FeignClient(name = "employee-service")
public interface EmployeeClient {
	
	@GetMapping("/employee/department/{departmentId}")
	public List<Employee> findByDepartmentId(@PathVariable("departmentId")Long departmentId);
}
