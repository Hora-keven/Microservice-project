package com.study.serviceregistry.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.serviceregistry.model.Department;

@Repository
public class DepartmentRepository {
	private List<Department> departments = new ArrayList<>();
	
	public Department addDepartment(Department data) {
		departments.add(data);
		return data;
	}
	public Department findById(Long id){
		return departments.stream().filter(department -> department.getId().equals(id)).findFirst().orElseThrow();
	}
		
	public List<Department> findAll(){
		return departments;
	}
	
}
