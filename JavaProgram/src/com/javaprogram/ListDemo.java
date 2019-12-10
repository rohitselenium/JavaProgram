package com.javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] str= {"act","cat","atb","bta","god","dog","lisent","silent","ilent","atc","dgo"};
		ArrayList<String> al1=new ArrayList<>();
		for(int i=0;i<str.length;i++)
		{
			
			
			TreeSet<String> ts=new TreeSet<String>();
			for(int j=i+1;j<str.length;j++)
			{
				char[] c1=str[i].toCharArray();
				Arrays.sort(c1);
				char[] c2=str[j].toCharArray();
				Arrays.sort(c2);
				
				
				if(Arrays.equals(c1, c2))
				{
				
					ts.add(str[i]);
					ts.add(str[j]);
					al1.add(str[i]);
				
					
				}
				
				
				
			}
			
		//	TreeSet<String> ts=new TreeSet<String>(al);
			
			if(!ts.isEmpty())
				{
				if(!ts.containsAll(al1))
				
					System.out.println(ts);
				}
			//al.removeAll(al);
		}
		
		
		ArrayList<String> al=new ArrayList<>(Arrays.asList(str));
		
		Comparator<String> com=(o1,o2)->{
			return (o1.compareToIgnoreCase(o2));
			
		};
		Collections.sort(al, com);
		
		
		
		
		System.out.println(al);
		
		Stack<Integer> s=new Stack<Integer>();
		
		s.add(8);
		s.add(9);
		s.add(7);
		s.add(9);
		
		s.pop();
		s.push(10);
		System.out.println(s);
		System.out.println(s.capacity());
		
		s.forEach(x->System.out.print(x + " "));
		
		
		PriorityQueue<String> pq=new PriorityQueue<String>();
		
		pq.add("8");
		pq.add("0");
		pq.add("7");
		pq.add("null");
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		pq.poll();
		
		System.out.println(pq);
		
		Object[] a=pq.toArray();
		
		for(Object i:a)
			System.out.print(i.toString()+ " ");
		
		System.out.println(al.equals(s));
		System.out.println(al.retainAll(s));
	}

}
