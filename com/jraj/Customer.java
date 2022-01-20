package com.jraj;
//enum for color and seasons 
public class Customer {

	public static void main(String[] args) {
		for(Color c:Color.values())
		{
			System.out.println(c);
			System.out.println(c.ordinal());
		}
		for (Season s:Season.values())
		{
			System.out.println(s);
			System.out.println(s.ordinal());
		}

	}

}
