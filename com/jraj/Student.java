package com.jraj;
//extends person 
public class Student extends Person {
	

	public Student(String ename, int age,double salary) {
		super(ename, age);
		this.salary=salary;
	
	}
	double salary;
	public double getSalary() {
		return salary;
	}
	
     public static void main(String[] args) {
    	 Student obj=new Student("Jey",22,10000);
    	 System.out.println(obj.getEname());
    	 System.out.println(obj.getAge());
    	 System.out.println(obj.getSalary());
		

	}

}
