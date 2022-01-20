package com.jraj;
//declare using costructor
public class Employee1 {
	int id;
	String name;
	
	public Employee1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public static void main(String[] args) {
		
		Employee1 obj=new Employee1(44,"Jeyaraj");
		System.out.println(obj.id);
		System.out.println(obj.name);
		
	}

}
