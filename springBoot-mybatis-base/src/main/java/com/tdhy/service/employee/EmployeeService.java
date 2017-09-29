package com.tdhy.service.employee;

import java.util.List;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.tdhy.domain.entity.employee.Employee;

public interface EmployeeService {
	public int saveEmployee(Employee employee);	
	
	public List<Employee> findAll();
	
	
	public List<Employee> findEmployeeByDepartmentId(Integer departmentId);
	
	public PageInfo<?> findPage(Integer departmentId,Integer page, Integer rows);
}
         