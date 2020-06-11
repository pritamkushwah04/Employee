package com.example.demo;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Employee {
   private int eID;
   private String eName;
   private String eProfile;
   private String eAddress;
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
public String geteProfile() {
	return eProfile;
}
public void seteProfile(String eProfile) {
	this.eProfile = eProfile;
}
public String geteAddress() {
	return eAddress;
}
public void seteAddress(String eAddress) {
	this.eAddress = eAddress;
}
}


