package com.example.demo.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.Employee;
import com.example.demo.EmployeeRecord;

@Controller
public class EmployeeGetController {
	  @RequestMapping(method = RequestMethod.GET, value="/Employee/AllData")
	  @ResponseBody
	  public List<Employee> getAllStudents() {
	  return EmployeeRecord.genrateEmp().getEmployeeRecord();
	  }
	

}
