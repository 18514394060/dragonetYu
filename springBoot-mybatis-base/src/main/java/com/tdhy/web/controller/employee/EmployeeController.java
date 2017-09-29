package com.tdhy.web.controller.employee;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.tdhy.domain.entity.employee.Employee;
import com.tdhy.service.employee.EmployeeService;
import com.tdhy.web.result.Result;
import com.tdhy.web.result.ResultEnum;
import com.tdhy.web.result.ResultUtil;

@Controller
@RequestMapping("/emp")
public class EmployeeController {
	 Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="list")
	public String empList(Model model){
		 List<Employee> list = employeeService.findAll();
		model.addAttribute("list", list);
		logger.info("----------------------------------- 员工查询  success  ------------------------------------ ");
		return "index";
	}
	
	@GetMapping(value="{did}/list")
	public ModelAndView empListByDepartmentId(@PathVariable Integer did ,ModelAndView modelAndView){
		 List<Employee> list = employeeService.findEmployeeByDepartmentId(did);
		 modelAndView = new ModelAndView("emplist");
		 modelAndView.addObject("list", list);
		 logger.info("----------------------------------- 部门Id查询员工  success  ------------------------------------ ");
		 return modelAndView;
	}
	@GetMapping(value="{did}/page")
	@ResponseBody
	public Result<?> page(@PathVariable Integer did ,Integer page, Integer rows){
		 PageInfo<?> pageInfo = employeeService.findPage(did, page, rows);
		 logger.info("----------------------------------- 部门Id查询员工分页   success  ------------------------------------ ");
		 return	 ResultUtil.success(ResultEnum.SUCCESS, pageInfo);
	}
	
	
}
