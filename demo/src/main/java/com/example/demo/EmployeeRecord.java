package com.example.demo;

import java.util.List;
import java.util.ArrayList;

public class EmployeeRecord {
	private List<Employee> edata;
	private static EmployeeRecord eRec = null;

	private EmployeeRecord() {
		edata = new ArrayList<Employee>();
	}

	public static EmployeeRecord genrateEmp() {
		if (eRec == null)
			eRec = new EmployeeRecord();
		return eRec;
	}

	// method to add an employee
	public void addEmployee(Employee e) {
		edata.add(e);
	}

	
	//method to delete an employee 
	public Boolean deleteEmp(Employee e) {
		for (int i = 0; i < edata.size(); i++) {
			Employee emp = edata.get(i);
			if (e.geteID() == (emp.geteID())) {
				edata.remove(i);
				return true;
			}
		}
		return false;
	}
	
	  
	 // Method to get Employee object according to given id
	  public Employee geEmployee(int id) {
		  Employee e=null;
		  for (int i=0;i<edata.size();i++) {
			  e=edata.get(i);
			  if(id == e.geteID()) {
				  return e;
			  }
		  }
		  return e;
	  }

	
	  // method to update existing employee 
	  public Boolean updateEmployee(Employee e){
	  
	  for (int i=0;i<edata.size();i++) { 
		  Employee emp=edata.get(i); 
		  if(e.geteID()== (emp.geteID())) { 
			  edata.set(i, e); 
			  return true;
			  }
		  }
	  return false;
	  }
	 
    // method to get all employee list
	public List<Employee> getEmployeeRecord() {
		return edata;
	}

}
