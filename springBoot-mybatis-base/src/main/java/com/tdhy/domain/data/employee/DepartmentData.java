package com.tdhy.domain.data.employee;

import java.io.Serializable;
import java.util.List;

import com.tdhy.domain.entity.employee.Department;
import com.tdhy.domain.entity.employee.Employee;

public class DepartmentData implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Department department;
	
	private List<Employee> employees;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public DepartmentData(Department department, List<Employee> employees) {
		super();
		this.department = department;
		this.employees = employees;
	}

	public DepartmentData() {
		super();
	}
	
	
	
	
	
	
	 
	

}
