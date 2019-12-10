package com.javaprogram;

public class MyLinkedList {
	
	Node head;
	
	
	
	
	public static MyLinkedList add(MyLinkedList list,int data)
	{
		
		Node new_Node= new Node(data);
		new_Node.next=null;
		
		if(list.head==null)
		{
			list.head=new_Node;
			
		}
		else
		{
			Node last_Node=list.head;
			
			while(last_Node.next!=null)
			{
				last_Node=last_Node.next;
			}
			
			last_Node.next=new_Node;
		}
		
		
		
		return list;
		
	}
	
	
	public static void print(MyLinkedList list)
	{
		
		Node current_Node=list.head;
		System.out.print("MyLinked List Data :: [ " );
		while(current_Node.next!=null)
		{
			System.out.print(current_Node.data + ", ");
			current_Node=current_Node.next;
			
		}
		
		System.out.print(current_Node.data + " ]");
		
		
	}
	
	
	
	

}
