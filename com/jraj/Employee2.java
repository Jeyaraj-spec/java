package com.jraj;
//Getter and shutter
public class Employee2 {
	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
	Employee2 obj=new Employee2();
	obj.setId(44);
	obj.setName("Jeyaraj");
	
	System.out.println(obj.getId());
	System.out.println(obj.getName());

	}

}
