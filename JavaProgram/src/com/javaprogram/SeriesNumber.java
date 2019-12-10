package com.javaprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SeriesNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> al1=new ArrayList<>(Arrays.asList(1,2,5,6,7));
		
		ArrayList<Integer> al2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
		
		//al2.removeAll(al1);
		al2.retainAll(al1);
		System.out.println(al2);
		
		
		
		ArrayList<String> al3=new ArrayList<>(Arrays.asList("rohitrohitrohit" .replaceAll("rohit","rohit ").split(" ")));
		
		ArrayList<String> al4=new ArrayList<>(Arrays.asList("t"));
		
		
		//al3.retainAll(al4);
		String str="rohitrohitrohit";
		int count=0;
		for(int i=0;i<str.length();i=i+5)
		{
			int lastindex=i+5;
			System.out.print(str.substring(i, lastindex)+"  ");
			count++;
			
		}

		System.out.println(count);
		
		
		
		//al3.subList(0, toIndex)
		
		System.out.println(al3.size());
		
		
	}

}
