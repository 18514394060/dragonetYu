package com.tdhy.service.employee.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tdhy.dao.employee.EmployeeMapper;
import com.tdhy.domain.entity.employee.Employee;
import com.tdhy.service.employee.EmployeeService;

import tk.mybatis.mapper.entity.Example;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;

	@Override
	@Transactional
	public int saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeMapper.insertSelective(employee);
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> empList = employeeMapper.selectAll();
		// TODO Auto-generated method stub
		return empList;

	}

	@Override
	public List<Employee> findEmployeeByDepartmentId(Integer departmentId) {
		// TODO Auto-generated method stub
		Example example = new Example(Employee.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andEqualTo("departmentId", departmentId);
		return employeeMapper.selectByExample(example);
	}

	@Override
	public PageInfo<?> findPage(Integer departmentId,Integer page, Integer rows) {
	    if (page!= null &&rows != null) {
            PageHelper.startPage(page, rows);
        }
	    List<Employee> employees = this.findEmployeeByDepartmentId(departmentId);
	    
		// TODO Auto-generated method stub
		return new PageInfo<Employee>(employees);
	}

}
