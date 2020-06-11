package com.example.demo.controller;


import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import com.example.demo.*;


@Controller
public class EmployeeController {
	
	
	  @RequestMapping(method = RequestMethod.GET, value="/Employee/AllData")         // For GET method
	  @ResponseBody
	  public List<Employee> getAllStudents() {
	  return EmployeeRecord.genrateEmp().getEmployeeRecord();
	  }
	
	  
	  @RequestMapping(method = RequestMethod.POST, value="/onbord/employee")     // For POST method
	  @ResponseBody
	  public EmployeeStatus onBoardEmp(@RequestBody Employee e) {
		
		EmployeeStatus empStatus=new EmployeeStatus();
	     EmployeeRecord.genrateEmp().addEmployee(e);
	     empStatus.seteName(e.geteName());
	     empStatus.seteID(e.geteID());
	     empStatus.seteAddress(e.geteAddress());
	     empStatus.seteProfile(e.geteProfile());
	     empStatus.seteStatus("Onboarded");

	  
	    return empStatus;
	  }
	
	
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/Employee/{edata}") // For DELETE method
	@ResponseBody
	
	public Boolean deleteEmployee(@PathVariable("edata") Employee edata) {
	System.out.println("delete record method");   
	    return EmployeeRecord.genrateEmp().deleteEmp(edata);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT, value="/update/employee") // For UPDATE method

	@ResponseBody
	public Boolean updateStudentRecord(@RequestBody Employee e) {
	    System.out.println("Update Employee method");   
	    return EmployeeRecord.genrateEmp().updateEmployee(e);
	}
		

}
