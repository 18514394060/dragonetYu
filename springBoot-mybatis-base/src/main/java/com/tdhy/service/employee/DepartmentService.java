package com.tdhy.service.employee;

import java.util.List;

import com.tdhy.domain.data.employee.DepartmentData;
import com.tdhy.domain.entity.employee.Department;

public interface DepartmentService {

	public int saveDepartment(Department Department);
	
	public List<Department> findAll();	
	
	
	public DepartmentData findById(Integer Id);
}
