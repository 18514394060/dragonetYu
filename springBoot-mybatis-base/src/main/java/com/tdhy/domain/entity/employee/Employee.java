package com.tdhy.domain.entity.employee;

import javax.persistence.Column;

import com.tdhy.domain.entity.BaseEntity;
/**
 * 员工表
 */
public class Employee extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/*
	 * 姓名
	 */
	private String name;
	/*
	 * 年龄
	 */
	private Integer age;
	/*
	 * 性别
	 */
	private Integer sex;
	/*
	 * 部门Id
	 */
	@Column(name ="department_id")
	
	private Integer departmentId;
	
	
	public String getName() {
		return name;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

}
