package com.customexception;

public class LabourActException extends Exception{
	
	
	String msg="Labour Act Exception Due to Teenageer";
	
	/*
	LabourActException(String msg)
	{
		
		super(msg);
		
	}*/
	
	public String getMessage()
	{
		
		return msg;
		
		
	}
	
	

}
