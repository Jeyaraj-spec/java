package com.jraj;
// extends from employees
public class Manager extends Employees {
	int a=20;
	public void show()
	{
		super.show();
		System.out.println(a);
	}

	public static void main(String[] args) {
		Manager obj=new Manager();
		obj.show();
		

	}

}
