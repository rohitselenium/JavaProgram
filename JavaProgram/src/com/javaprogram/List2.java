
package com.javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collectors;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Integer[] a=new Integer[] {1,2,3,-1,-2,-3};
		
		ArrayList<Integer> al =new ArrayList<>(Arrays.asList(1,2,3,-1,-2,-3));
		
		
		ArrayList<Integer> al2=new ArrayList<>(Arrays.asList(1,2,3,4,5));
		
		
		System.out.println(al.addAll(al2));
		
		//al.add(e)
		
		
		al.removeIf(I->I<0);
		
		
		Collections.reverse(al);;
		
		System.out.println(al);
		
		ArrayList<Integer> l=(ArrayList<Integer>) al.stream().filter(I->I>0).collect(Collectors.toList());
		
		l.stream().map(I->I*3).forEach(System.out::print);
		
		System.out.println(l);
		
		ArrayList<Integer> l1=(ArrayList<Integer>) al.stream().map(I->I*2).collect(Collectors.toList());
		System.out.println(l1);
		
		
		Vector<Integer> v=new Vector<Integer>();
		
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		v.add(2);
		
		
	
		
		
		
		
		
		
		System.out.println(v.capacity());
	
		
		
		
	Stack<Integer> s= new Stack<Integer>();
		
		s.add(8);
		s.push(3);
		s.add(7);
		s.push(10);
		
		s.pop();
		
		
		System.out.println(s);
		
		

	}

}
