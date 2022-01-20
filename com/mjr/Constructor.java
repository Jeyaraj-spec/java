package com.mjr;

public class Constructor {
	
	int id;
	String name;
	String dept;
	
	public Constructor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println(id+" "+name);
	}

	public Constructor(String dept) {
		super();
		this.dept = name;
		System.out.println(dept);
	}

	public static void main(String[] args) {
		Constructor a= new Constructor(22,"JK");
		Constructor b= new Constructor(23,"PK");
		Constructor c= new Constructor("ECE");
		
		
		
	}

}
