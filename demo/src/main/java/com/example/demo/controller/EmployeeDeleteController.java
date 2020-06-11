package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Employee;
import com.example.demo.EmployeeRecord;
@Controller



public class EmployeeDeleteController {


@RequestMapping(method = RequestMethod.DELETE, value="/delete/Employee/{edata}")
@ResponseBody
public Boolean deleteEmployee(@PathVariable("edata") Employee edata) {
System.out.println("delete record method");   
    return EmployeeRecord.genrateEmp().deleteEmp(edata);
}
}