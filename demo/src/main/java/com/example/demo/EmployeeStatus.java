package com.example.demo;

import lombok.Setter;
import lombok.Getter;

@Getter @Setter
public class EmployeeStatus {
   private int eID;
   private String eName;
   private String eAddress;
   private String eProfile;
   private String eStatus;
   
	public String geteStatus() {
	return eStatus;
    }
	public void seteStatus(String eStatus) {
		this.eStatus = eStatus;
	}
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteAddress() {
		return eAddress;
	}
	public void seteAddress(String eAddress) {
		this.eAddress = eAddress;
	}
	public String geteProfile() {
		return eProfile;
	}
	public void seteProfile(String eProfile) {
		this.eProfile = eProfile;
	}
}
