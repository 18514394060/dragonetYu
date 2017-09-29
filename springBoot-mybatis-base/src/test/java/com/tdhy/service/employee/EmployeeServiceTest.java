package com.tdhy.service.employee;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tdhy.BaseTest;
import com.tdhy.domain.entity.employee.Employee;

public class EmployeeServiceTest extends BaseTest{

	@Autowired
	EmployeeService employeeService;
	
	@Test
	public void testSaveEmployee() {
		for(int i=1;i<10;i++){
			Employee emp = new Employee();
			emp.setAge(18);
			emp.setCreateDate(new Date());
			emp.setDepartmentId(1);
			emp.setSex(1);
			emp.setName("测试"+i);
			emp.setRemoveStatus(0);
			employeeService.saveEmployee(emp);
			
		}
		
	}

	
	@Test
	public void testselectAll() {
		 List<Employee> list = employeeService.findAll();
		 for (Employee employee : list) {
			System.out.println(employee.getName());
		}
	}
}
