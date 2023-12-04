package com.demo.beans;
import com.demo.beans.*;

public class QueueUsingLinkedList {
	Node front,rear;
	
	class Node{
	    
		int empid;
		String fullname;
		String gender;
		Employee e=new Employee( empid, fullname,gender);
		Node next;
		public Node(int a, String b, String c) {
			e=new Employee( a, b, c);
			next=null;
		}
	}
	public void QueueUsingLinkedList(){
		front=null;
		rear=null;
	}
	
	public void enqueue(int id,String fullname,String Gender){
       Node newemp=new Node(id,fullname,Gender);
       if(front==null) {
    	   front=newemp;
       }
      rear=newemp;
			
		rear=rear.next;
		
	}
	public Employee dequeue() {
		Employee x =front.e;
	
		
		return x;
	
	}
	
	public String toString() {

		Node temp= front;
		while(temp!=null&&temp!=rear) {
			System.out.println((temp.e).toString());
			temp=temp.next;
		}
		return "printed";
	 }
	
	public void Reverse() {
		Node str=null;
		Node temp=front;
		Node prev =temp.next;
		while(prev!=rear) {
			front=str;
			
			prev=temp;
			temp.next=null;
			temp=temp.next;
			

		}
		
	}
	
}
