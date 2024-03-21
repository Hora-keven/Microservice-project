package com.study.serviceregistry.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
	public Long id;
	private String name;
	private List<Employee> employees = new ArrayList<>();
	
	public Department(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employees=" + employees + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getEmployess()=" + getEmployees() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
