package com.jraj;
//to print age and name using getters and constructor extends students
public class Person {
	String ename;
	int age;
	public String getEname() {
		return ename;
	}
	public int getAge() {
		return age;
	}
	public Person(String ename,int age) {
		super();
		this.ename=ename;
		this.age=age;
		
	}
/*
	public static void main(String[] args) {
		

	}
*/
}
