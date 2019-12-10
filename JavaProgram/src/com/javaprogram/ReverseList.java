package com.javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class ReverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] no= {1,3,2,8,5,6,7};
		
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(no));
		
		System.out.println("Data in the List Before Reversing :: " + list);
		
		//Collections.reverse(list);
		
		//System.out.println("Data in the List After Reversing :: " + list);
		ArrayList<Integer> rev=reversemethod(list);
		
		System.out.println("Reversed List:: " + rev);
		
		
		Stack<Integer> s=new Stack<>();
		
		s.add(4);
		s.push(7);
		s.push(9);
		s.push(6);
		s.pop();
		s.remove(1);
		System.out.println("Stack Data are here:: " + s);
		
		
	}

	public static ArrayList<Integer> reversemethod(ArrayList<Integer> list)
	{
		
		/*ArrayList<Integer> revlist=new ArrayList<>();
		int size=list.size();
		
		for(int i=size-1;i>=0; i--)
		{
			
			revlist.add(list.get(i));
			
		}
		*/
		
		int size=list.size();
		
		for(int i=0;i<(size-1)/2;i++)
		{
			
			Integer temp=list.get(i);			
			list.set(i, list.get(size-1-i));
			list.set(size-1-i, temp);
		}
		
		
		
		return list;
	}
	
	
}
