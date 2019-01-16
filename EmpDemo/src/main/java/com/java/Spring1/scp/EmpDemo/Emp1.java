package com.java.Spring1.scp.EmpDemo;

import org.springframework.beans.factory.annotation.Autowired;

public /*abstract*/ class Emp1 {
	private String empName;
	private int empId;
	
	
	abstract public Address getAddress1();
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		System.out.println("settertype injection");
		this.empName = empName;
	}
	public int getEmpId() {
		System.out.println("getter injection");
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public Address getAddress() {
		return getAddress1();
	}
	/*public void setAddress(Address address) {
		this.address = address;
	}*/
	public Emp1() {
		super();
		System.out.println("this id default constructor");
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp1 [empName=" + empName + ", empId=" + empId + ", address=" + getAddress() + "]";
	}
	public Emp1(String empName, int empId, Address address) {
		super();
		this.empName = empName;
		this.empId = empId;
	//	this.address = address;
	}

	/*public Emp1(int empId, Address address,String empName) {
		super();
		System.out.println("parametr constructor wd 2 parameter");
		//this.empName = empName;
		this.empId = empId;
		this.address = address;
		this.empName = empName;
	}*/
}
class Address{
	private String city;
	private int pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pincode=" + pincode + "]";
	}
	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}
	
	
}

abstract class AddressImpl{
	abstract public Address getAddess1();
}
