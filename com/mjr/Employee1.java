package com.mjr;
/*STATIC VARIABLES CAN BE RETAINED*/
public class Employee1 {
	static int a;
	int b=3;
	public Employee1()
	{ 
		a++;
		b++;
	}

	public static void main(String[] args) {
		Employee1 obj=new Employee1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		Employee1 obj1=new Employee1();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		Employee1 obj2=new Employee1();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		

	}

}
