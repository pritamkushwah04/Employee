package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Employee;
import com.example.demo.EmployeeRecord;

@Controller
public class EmployeeUpdateController {

	  @RequestMapping(method = RequestMethod.PUT, value="/update/employee")

@ResponseBody
public Boolean updateStudentRecord(@RequestBody Employee e) {
    System.out.println("Update Employee method");   
    return EmployeeRecord.genrateEmp().updateEmployee(e);
}
	
	
}
