package com.demo.test;

import java.util.Scanner;
import com.demo.beans.*;
import com.demo.dao.*;
public class EmployeeTest {
public static void main(String[] arg) {
	Employee emp1=new Employee();
	EmployeeServices es=new EmployeeServices();
	QueueUsingLinkedList q=new QueueUsingLinkedList();
	Scanner sc=new Scanner(System.in);
	
	int a;
	
	do {
		System.out.println("1.Insert Employee \n 2.RemoveEmployee \n 3.Print complete Queue using toString \n 4.PrintallFemaleEmp \n 5.Print allMale Emp\n 6.Empty Queue Using Recursion \n 7.PrintQueue in reverse order");
		 a=sc.nextInt();
		switch(a) {
		case 1:
			
			System.out.println("enter Emp id");
			int id= sc.nextInt();
			System.out.println("enter fullname");
			String name=sc.next();
			System.out.println("enter gender");
			String gender =sc.next();
			q.enqueue(id, name, gender);
			System.out.println("inserted successfully");
			break;
		case 2:
			Employee a1= q.dequeue();
			
		  System.out.println(a1);
		  break;
		case 3: 
			q.toString();
			break;
		case 4:
			es.allFemale();
			break;
		case 5:
		
		case 6:
		
		case 7:
			q.Reverse();
			break;
			
		}
	}while (a!=8);
}
}
