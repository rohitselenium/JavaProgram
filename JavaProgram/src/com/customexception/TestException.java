package com.customexception;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		do
		{
		System.out.println("Please Enter the Employee Details:: ");
		
		System.out.println("Please Enter the Name::");
		String name=sc.next();
		
		System.out.println("Please Enter the Age::");
		int age=sc.nextInt();
		
		System.out.println("Please Enter the Address::");
		String address=sc.next();
		
		System.out.println("Please Enter the Role::");
		String role=sc.next();
		
		Employee emp=new Employee(name, role, age, address);
		
		
		 
	
			
			if(emp.age<18)
			{
				
				try
				{
					
				throw new LabourActException();
				
				
				}
				
				catch(LabourActException e)
				{
					System.out.println("Labour Act Exception :: " + e.getMessage());
					
					e.printStackTrace();
					
				}
				
			}
			else
			{
				
				System.out.println(emp.toString());
				
			}
			
			
		}while(true);
		
		
		
		
		
		
		
		
		
		
	}

}
