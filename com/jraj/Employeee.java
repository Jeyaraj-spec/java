package com.jraj;

public class Employeee implements i2,i1 {
	public static void main(String[] args) {
		/*i1 obj=new Employeee();
		System.out.println(obj.PI);*/
		Employeee obj=new Employeee();
		obj.display();
		obj.show();
		
	}

	@Override
	public void display() {
		System.out.println("what i want to say that");
		
	}

	@Override
	public void show() {
		System.out.println("no problem");
	}

}