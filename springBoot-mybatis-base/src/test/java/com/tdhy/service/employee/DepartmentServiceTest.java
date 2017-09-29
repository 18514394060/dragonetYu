package com.tdhy.service.employee;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import com.tdhy.BaseTest;
import com.tdhy.domain.entity.employee.Department;

public class DepartmentServiceTest extends BaseTest{

	Logger logger = LoggerFactory.getLogger(DepartmentServiceTest.class);
	@Autowired
	DepartmentService departmentService;
	
	@Test
	public void testSaveDepartment() {
		Department department = new Department();
		department.setCreateDate(new Date());
		department.setName("软件部");
		department.setRemoveStatus(0);
		int i = departmentService.saveDepartment(department);
		System.out.println(i);
		Assert.notNull(i);
	}

	@Test
	public void testfindAll() {
		List<Department> list = departmentService.findAll();
		for (Department department : list) {
			logger.info(department.getName());
			
		}
	}
}
