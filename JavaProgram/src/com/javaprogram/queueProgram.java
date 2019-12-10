package com.javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class queueProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Queue<String> q=new PriorityQueue<>();
		Queue<Integer> q1=new PriorityQueue<>();
		q.offer("Google");
		q.add("Oracle");
		q.offer("facebook");
		q.add("adobe");
		q.poll();
		System.out.println(q);
		
		q1.offer(600);
		q1.add(700);
		q1.offer(10);
		q1.add(1);
		q1.poll();
		System.out.println(q1);
		
		
		
		
		System.out.println("Head of the queue::" + q.element());
		System.out.println("Head of the queue::" + q.peek());
		
		q.remove();
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
		String str="aaabbbccc";
		char []c=str.toCharArray();
		
		Set<String> al=new HashSet<String>(Arrays.asList("a", "a" ,"a" ,"b", "b"));
	/*	
		for(int i=0;i<str.length();i++)
		{
			
			//al.add(c[i]+"");
			al.add(String.valueOf(c[i]));
			
		}
		*/
		System.out.println(al);
		
	}

}
