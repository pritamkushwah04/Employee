package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Employee;
import com.example.demo.EmployeeRecord;
import com.example.demo.EmployeeStatus;

import java.util.List;

@Controller
public class EmployeePostController {
	
	@RequestMapping(method = RequestMethod.POST, value="/onbord/employee")
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
   
}
