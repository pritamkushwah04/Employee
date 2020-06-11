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

	public void addEmployee(Employee e) {
		edata.add(e);
	}

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
	 

	public List<Employee> getEmployeeRecord() {
		return edata;
	}

}
