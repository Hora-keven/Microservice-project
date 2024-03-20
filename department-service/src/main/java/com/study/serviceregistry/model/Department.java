package com.study.serviceregistry.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
	public Long id;
	private String name;
	private List<Employee> employess = new ArrayList<>();
	
	public Department(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employess=" + employess + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getEmployess()=" + getEmployess() + ", getClass()=" + getClass()
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
	public List<Employee> getEmployess() {
		return employess;
	}
	public void setEmployess(List<Employee> employess) {
		this.employess = employess;
	}
}
