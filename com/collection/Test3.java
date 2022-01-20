package com.collection;

import java.util.ArrayList;

//generics
public class Test3 {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ArrayList<Integer> ai=new ArrayList<Integer>();
		ar.add("Mjr");
		ai.add(23);
		ar.add("jmr");
		ai.add(45);
		System.out.println(ar);
		System.out.println(ai);

	}

}
