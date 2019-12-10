package com.customexception;

public class Employee {
	
	
	String name;
	String role;
	int age;
	String address;
	
	
	Employee(String name,String role,int age,String address)
	{
		
		
		this.name=name;
		this.age=age;
		this.address=address;
		this.role=role;
		
		
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", role=" + role + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	
	

}
