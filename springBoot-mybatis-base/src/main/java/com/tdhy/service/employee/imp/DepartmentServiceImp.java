package com.tdhy.service.employee.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tdhy.dao.employee.DepartmentMapper;
import com.tdhy.domain.data.employee.DepartmentData;
import com.tdhy.domain.entity.employee.Department;
import com.tdhy.domain.entity.employee.Employee;
import com.tdhy.service.employee.DepartmentService;
import com.tdhy.service.employee.EmployeeService;

@Service("deparmentService")
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	private DepartmentMapper departmentMapper;

	@Autowired
	private EmployeeService employeeService;

	@Override
	@Transactional
	public int saveDepartment(Department Department) {
		return departmentMapper.insert(Department);
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
	
		return departmentMapper.selectAll();
	}

	@Override
	public DepartmentData findById(Integer Id) {
		// TODO Auto-generated method stub
		Department list = departmentMapper.selectByPrimaryKey(Id);
		String a = "abc";
		int b = Integer.parseInt(a); // 模拟异常测试
		if (list != null) {
			List<Employee> empList = employeeService.findEmployeeByDepartmentId(list.getId());
			DepartmentData data = new DepartmentData(list, empList);
			return data;
		}
		return null;

	}

}
