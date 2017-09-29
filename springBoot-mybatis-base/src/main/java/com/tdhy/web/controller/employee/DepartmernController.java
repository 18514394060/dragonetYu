package com.tdhy.web.controller.employee;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tdhy.domain.data.employee.DepartmentData;
import com.tdhy.domain.entity.employee.Department;
import com.tdhy.domain.entity.employee.Employee;
import com.tdhy.service.employee.DepartmentService;
import com.tdhy.web.exception.BaseException;
import com.tdhy.web.result.Result;
import com.tdhy.web.result.ResultEnum;
import com.tdhy.web.result.ResultUtil;

@RequestMapping(value = "dep")
@RestController
public class DepartmernController {

	private static Logger logger = LoggerFactory.getLogger(DepartmernController.class);
	
	@Autowired
	private DepartmentService departmentService;

	@GetMapping(value = "list")
	public Result<?> findList(HttpSession session) {
		
		String user= (String)session.getAttribute("user");
		logger.info("sessionId:"+user);
		if(user == null || user == ""){
			 session.setAttribute("user","123456");
		}
		logger.info("sessionId:"+session.getId());
		
		if (user == null) {
			throw new BaseException(ResultEnum.NO_LOGIN);
		}
		List<Department> list = departmentService.findAll();
		return ResultUtil.success(ResultEnum.SUCCESS, list);
	}

	@GetMapping(value = "{id}/list")
	public Result<?> findList(@PathVariable Integer id) {
		DepartmentData data = departmentService.findById(id);
		if (data == null) {
			throw new BaseException(ResultEnum.NOT_PARMS);
		} else {
			return ResultUtil.success(ResultEnum.SUCCESS, data);
		}

	}
	
	@GetMapping(value="login")
	public void loginToJunitTest(HttpSession session){
		session.setAttribute("user", "123456");
	}
}
