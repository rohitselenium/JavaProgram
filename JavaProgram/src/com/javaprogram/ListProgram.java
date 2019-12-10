package com.javaprogram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//	String a=new String();
		
		ArrayList<String> al=new ArrayList<>();//java 1.8v
		
	
		
		al.add("SQL");
		al.add("C++");
		al.add("Java");
		al.add("C");
		
		
		
		
		//Collections.sort(al);
		//Anonymous class
		
		
		Comparator<String> c=( o1,  o2) ->{return o1.compareToIgnoreCase(o2);};
			
	
		
		
		Collections.sort(al, c);
		
		//1) ways
		System.out.println(al);
		
		//2nd ways:
		System.out.println();
		
		for(String s:al)//Enhanced For Loop *****************************
			System.out.print(s + " ");
		
		//3rd ways
		System.out.println();
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i)+ " ");
		
		//4ways
		
		
		Iterator<String> itr=al.iterator();
		
		System.out.println();
		
		while(itr.hasNext())//***************************
		{
			System.out.print(itr.next()+" ");
		}
		//5ways:
		
		System.out.println();
		
		al.forEach(System.out::println);
		
		al.forEach(S->System.out.println(S));
		
	}

}
